package emp;

import java.util.List;
// import java.text.ParseException;
// import java.text.SimpleDateFormat;
// import java.util.Date;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        int empNo = 0;
        int result;
        EmpDAO eDao = new EmpDAO();
        EmpDTO eDto = null;

        while (run) {
            System.out.println("==============================================");
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 전체 조회");
            System.out.println("5. 특정 사원 조회");
            System.out.println("6. 종료");
            System.out.println("==============================================");

            System.out.print("메뉴 선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    eDto = InsertInfo(sc);
                    result = eDao.insert(eDto);
                    System.out.println(result > 0 ? "입력 성공" : "입력 실패");
                    break;
                case 2:
                    eDto = updateInfo(sc);
                    result = eDao.update(eDto);
                    System.out.println(result > 0 ? "수정 성공" : "수정 실패");
                    break;
                case 3:
                    empNo = deleteInfo(sc);
                    result = eDao.delete(empNo);
                    System.out.println(result > 0 ? "삭제 성공" : "삭제 실패");
                    break;
                case 4:
                    List<EmpDTO> list = eDao.selectALL();
                    empPrint(list);
                    break;
                case 5:
                    empNo = getRow(sc);
                    eDto = eDao.select(empNo);
                    System.out.println(eDto);

                    break;

                case 6:
                    run = false;
                    break;
                default:
                    break;
            }
        }

    }

    public static void empPrint(List<EmpDTO> list) {

        System.out.println("================================================================");
        System.out.println("사번\t 이름\t직무\t 매니저번호\t 입사일 \t급여 \t수당\t부서번호");
        System.out.println("================================================================");

        for (EmpDTO empDTO : list) {
            System.out.printf("%d\t %s\t %s\t %d\t %s\t %d\t %d\t %d\n", empDTO.getEmpNo(), empDTO.getEname(),
                    empDTO.getJob(), empDTO.getMgr(), empDTO.getHirDate(), empDTO.getSal(), empDTO.getComm(),
                    empDTO.getDeptNo());
        }
    }

    public static int getRow(Scanner sc) {
        System.out.println("조회할 사번 >> ");
        int empNo = Integer.parseInt(sc.nextLine());
        return empNo;
    }

    public static int deleteInfo(Scanner sc) {
        System.out.println("삭제할 empNo >> ");
        int empNo = Integer.parseInt(sc.nextLine());
        return empNo;

    }

    public static EmpDTO updateInfo(Scanner sc) {
        System.out.println("수정할 empNo >> ");
        int empNo = Integer.parseInt(sc.nextLine());
        System.out.println("변경할 급여 >> ");
        int sal = Integer.parseInt(sc.nextLine());

        EmpDTO eDto = EmpDTO.builder().empNo(empNo).sal(sal).build();

        return eDto;
    }

    public static EmpDTO InsertInfo(Scanner sc) {
        System.out.println("추가할 사번 >> ");
        int empNo = Integer.parseInt(sc.nextLine());
        System.out.println("이름 >> ");
        String ename = sc.nextLine();
        System.out.println("직무 >> ");
        String job = sc.nextLine();
        System.out.println("매니저 번호 >> ");
        int mgr = Integer.parseInt(sc.nextLine());
        System.out.println("입사일 >> ");
        String date = sc.nextLine();
        System.out.println("급여 >> ");
        int sal = Integer.parseInt(sc.nextLine());
        System.out.println("수당 >> ");
        int comm = Integer.parseInt(sc.nextLine());
        System.out.println("부서번호 >> ");
        int deptNo = Integer.parseInt(sc.nextLine());

        // Date hireDate = null;
        // try {
        // hireDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        // } catch (ParseException e) {
        // e.printStackTrace();
        // }

        EmpDTO eDto = EmpDTO.builder().empNo(empNo).ename(ename).job(job).mgr(mgr).hirDate(date).sal(sal)
                .comm(comm)
                .deptNo(deptNo).build();

        return eDto;
    }
}
