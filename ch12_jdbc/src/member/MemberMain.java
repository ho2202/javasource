package member;

import java.util.List;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberDAO dao = new MemberDAO();
        MemberDTO dto = null;
        ConsoleUtil util = new ConsoleUtil();
        boolean run = true;
        int result;

        while (run) {
            System.out.println();
            System.out.println("================================================================");
            System.out.println("1. Member 입력");
            System.out.println("2. Member 수정");
            System.out.println("3. Member 삭제");
            System.out.println("4. Member 조회");
            System.out.println("5. 전체 조회");
            System.out.println("6. 종료");
            System.out.println("================================================================");
            System.out.print("메뉴 선택 >> ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    dto = util.MemberInsertInto(sc);
                    result = dao.insert(dto);
                    util.printSuccessMessage(result);
                    break;
                case 2:
                    dto = util.MemberUpdateMenu(sc);
                    if (dto != null) {
                        result = dao.update(dto);
                        util.printUpdateSuccessMessage(result, dto.getId());
                    }
                    break;
                case 3:
                    dto = util.MemberDelete(sc);
                    if (dto != null) {
                        result = dao.delete(dto);
                        util.printDeleteSuccessMessage(result, dto.getId());
                    }
                    break;
                case 4:
                    String id = util.MemberSelect(sc);
                    if (id != null) {
                        // result = dao.select(id);
                    }
                    break;
                case 5:
                    List<MemberDTO> dtoList = dao.selectALL();
                    break;

                case 6:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
