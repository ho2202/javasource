package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
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

    public MemberDTO select(int id) {
        con = getConnection();
        String sql = "select * from member where id=?";
        MemberDTO dto = null;
        try {
            pstnt = con.prepareStatement(sql);
            pstnt.setInt(1, id);
            rs = pstnt.executeQuery();
            // 결과 옮기기
            if (rs.next()) {
                dto = new MemberDTO();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstnt, rs);
        }
        return dto;
    }

    public List<MemberDTO> selectALL() {
        con = getConnection();
        String sql = "select * from member";
        List<MemberDTO> list = new ArrayList<>();

        MemberDTO dto = null;
        try {
            pstnt = con.prepareStatement(sql);
            rs = pstnt.executeQuery();
            // 결과 옮기기
            while (rs.next()) {
                dto = new MemberDTO();

                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstnt, rs);
        }
        return list;
    }

    public int insert(MemberDTO dto) {
        int result = 0;
        String sql = "insert into member(id, name, addr, email, age) values(?,?,?,?,?)";
        try {
            con = getConnection();
            pstnt = con.prepareStatement(sql);
            pstnt.setString(1, dto.getId());
            pstnt.setString(2, dto.getName());
            pstnt.setString(3, dto.getAddr());
            pstnt.setString(4, dto.getEmail());
            pstnt.setInt(5, dto.getAge());
            result = pstnt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstnt);
        }
        return result;
    }

    public int update(MemberDTO dto) {
        int result = 0;
        try {
            con = getConnection();
            String sql = "update member ";
            if (dto.getAddr() != null) {
                sql = "set addr=? where id=?";
                pstnt = con.prepareStatement(sql);
                pstnt.setString(1, dto.getAddr());

            } else {
                sql += "set email=? where id=?";
                pstnt = con.prepareStatement(sql);
                pstnt.setString(1, dto.getEmail());
            }
            pstnt.setString(2, dto.getId());
            result = pstnt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstnt);
        }
        return result;
    }

    public int delete(MemberDTO dto) {
        con = getConnection();
        int result = 0;
        String sql = "delete from member where id =? and email =?";
        try {
            pstnt = con.prepareStatement(sql);
            pstnt.setString(1, dto.getId());
            pstnt.setString(2, dto.getEmail());
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
