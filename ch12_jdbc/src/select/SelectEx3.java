package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectEx3 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstnt = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        try {
            // 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 객체 생성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";
            con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                // System.out.println("연결됨");
                System.out.println("조회할 사원번호 입력 : ");
                int empno = Integer.parseInt(sc.nextLine());

                String sql = "select * from emp where empno = ?"; // 물음표 자리에 무엇이 들어갈 것을 알려줌
                pstnt = con.prepareStatement(sql);
                pstnt.setInt(1, empno);
                rs = pstnt.executeQuery();

                // 데이터 추출
                while (rs.next()) {
                    empno = rs.getInt(1);
                    String ename = rs.getString("ename");
                    String job = rs.getString("job");
                    int mgr = rs.getInt("mgr");
                    String hiredate = rs.getString("hiredate");
                    int sal = rs.getInt("sal");
                    int comm = rs.getInt("comm");
                    int deptno = rs.getInt("deptno");

                    System.out.printf("%d %s %s %d %s %d %d %d\n", empno, ename, job, mgr, hiredate, sal, comm, deptno);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstnt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
