package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEx2 {
    private static Scanner sc = new Scanner(System.in);

    public static DeptDTO insert(Scanner sc) {
        // 테이블에 저장 데이터 입력 받기
        System.out.println("-------------------- dept에 데이터 입력 ---------------------------");
        System.out.print("deptno >> ");
        int deptno = Integer.parseInt(sc.nextLine());
        System.out.print("dname >> ");
        String dname = sc.nextLine();
        System.out.print("loc >> ");
        String loc = sc.nextLine();

        DeptDTO dto = new DeptDTO(deptno, dname, loc);
        return dto;
    }

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
            DeptDTO dto = insert(sc);

            String sql = "Insert into dept_temp(deptno, dname, loc) values(?, ?, ?)";
            pstnt = con.prepareStatement(sql);

            pstnt.setInt(1, dto.getDeptno());
            pstnt.setString(2, dto.getDname());
            pstnt.setString(3, dto.getLoc());

            int result = pstnt.executeUpdate();

            System.out.println(result > 0 ? "입력 성공" : "입력 실패");

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
