package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEx2 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstnt = null;
        Scanner sc = new Scanner(System.in);

        try {
            // 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 객체 생성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";
            con = DriverManager.getConnection(url, user, password);

            System.out.print("삭제할 부서 입력 >>");
            int dno = Integer.parseInt(sc.nextLine());
            String sql = "delete from dept_temp where deptno = ?";
            pstnt = con.prepareStatement(sql);
            pstnt.setInt(1, dno);

            int result = pstnt.executeUpdate();

            if (result > 0) {
                System.out.println("삭제 성공");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                sc.close();
                pstnt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
