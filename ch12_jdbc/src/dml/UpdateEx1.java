package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEx1 {

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstnt = null;

        try {
            // 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 객체 생성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";
            con = DriverManager.getConnection(url, user, password);

            String sql = "update dept_temp set loc = 'SEOUL' where deptno =10";

            pstnt = con.prepareStatement(sql);
            System.out.println(pstnt.executeUpdate() > 0 ? "입력 성공" : "입력 실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstnt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
