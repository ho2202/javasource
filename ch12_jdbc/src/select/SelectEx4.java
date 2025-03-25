package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectEx4 {
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

                String sql = "SELECT e.EMPNO, e.DEPTNO, e.SAL, d.DNAME, d.LOC \r\n" +
                        "FROM emp e, DEPT d \r\n" +
                        "WHERE e.DEPTNO = d.DEPTNO AND e.SAL <= 2500 AND e.EMPNO <= 9900?"; // 물음표 자리에 무엇이 들어갈 것을 알려줌
                pstnt = con.prepareStatement(sql);
                // pstnt.setInt(1, empno);
                rs = pstnt.executeQuery();

                // 데이터 추출
                while (rs.next()) {
                    empno = rs.getInt(1);
                    String dname = rs.getString("dname");
                    int sal = rs.getInt("sal");
                    int deptno = rs.getInt("deptno");
                    String loc = rs.getString("loc");

                    System.out.printf("%d %s %d %d %s\n", empno, dname, sal, deptno, loc);

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
