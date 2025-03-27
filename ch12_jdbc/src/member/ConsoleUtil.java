package member;

import java.util.Scanner;

public class ConsoleUtil {

    public MemberDTO MemberInsertInto(Scanner sc) {
        MemberDTO memberDTO = new MemberDTO();
        System.out.println();
        System.out.println("=================== 회원 정보 입력 화면 ==================");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("이름 >> ");
        memberDTO.setName(sc.nextLine());
        System.out.print("주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        System.out.print("이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        System.out.print("나이 >> ");
        memberDTO.setAge(Integer.parseInt(sc.nextLine()));
        return memberDTO;
    }

    public MemberDTO MemberUpdateMenu(Scanner sc) {
        System.out.println("=================== 회원 정보 수정 화면 ==================");
        System.out.println("1. 주소 수정");
        System.out.println("2. 이메일 수정");
        System.out.println("==========================================================");
        System.out.print("번호 >> ");
        int no = Integer.parseInt(sc.nextLine());
        if (no == 1) {
            return MemberUpdateAddr(sc);
        } else if (no == 2) {
            return MemberUpdateEmail(sc);
        } else {
            return null;
        }
    }

    public MemberDTO MemberUpdateEmail(Scanner sc) {
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("==================== 이메일 수정 화면 ===================");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("변경할 이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        return memberDTO;
    }

    public MemberDTO MemberUpdateAddr(Scanner sc) {
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("==================== 아이디 수정 화면 ===================");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("변경할 주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        return memberDTO;
    }

    public MemberDTO MemberDelete(Scanner sc) {
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("==================== 회원 삭제 화면 ====================");
        System.out.print("삭제할 아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("삭제할 이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        return memberDTO;
    }

    public String MemberSelect(Scanner sc) {
        System.out.println("=================== 회원 검색 화면 ==================");
        System.out.print("아이디 >> ");
        return sc.nextLine();
    }

    public void printSuccessMessage(int result) {
        System.out.println(result > 0 ? "입력 성공" : "실패");
    }

    public void printUpdateSuccessMessage(int result, String id) {
        System.out.println(result > 0 ? id + "님의 정보 수정 성공" : id + "님의 수정 실패");
    }

    public void printDeleteSuccessMessage(int result, String id) {
        System.out.println(result > 0 ? id + "님의 정보 삭제 성공" : id + "님의 삭제 실패");
    }

    public void printDTOMessage(MemberDTO memberDTO) {

    }
}
