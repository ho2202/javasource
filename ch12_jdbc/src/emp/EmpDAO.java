package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
    private Connection con = null;
    private PreparedStatement pstnt = null;
    private ResultSet rs = null;

    static {
        try {
            // 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        // 객체 생성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public int select() {
        return 0;
    }

    public int insert(EmpDTO eDto) {
        con = getConnection();
        int result = 0;
        String sql = "insert into emp_temp(EMPNO, ENAME, JOB, MGR ,HIREDATE, SAL ,COMM, DEPTNO) values(?,?,?,?,?,?,?,?)";
        try {
            pstnt = con.prepareStatement(sql);
            pstnt.setInt(1, eDto.getEmpNo());
            pstnt.setString(2, eDto.getEname());
            pstnt.setString(3, eDto.getJob());
            pstnt.setInt(4, eDto.getMgr());
            pstnt.setString(5, eDto.getHirDate());
            pstnt.setInt(6, eDto.getSal());
            pstnt.setInt(7, eDto.getComm());
            pstnt.setInt(8, eDto.getDeptNo());
            result = pstnt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstnt);
        }
        return result;
    }

    public int update(EmpDTO eDto) {
        con = getConnection();
        int result = 0;
        String sql = "update emp_temp set sal=? where empno=?";
        try {
            pstnt = con.prepareStatement(sql);
            pstnt.setInt(1, eDto.getSal());
            pstnt.setInt(2, eDto.getEmpNo());
            result = pstnt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstnt);
        }
        return result;
    }

    public int delete(int empno) {
        con = getConnection();
        int result = 0;
        String sql = "delete from emp_temp where empno =?";
        try {
            pstnt = con.prepareStatement(sql);
            pstnt.setInt(1, empno);
            result = pstnt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstnt);
        }
        return result;

    }

    public void close(Connection con, PreparedStatement pstnt) {
        try {
            pstnt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstnt, ResultSet rs) {
        try {
            rs.close();
            pstnt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
