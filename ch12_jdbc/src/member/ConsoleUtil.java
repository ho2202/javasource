package member;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {

    public MemberDTO memberInsertInto(Scanner sc) {
        MemberDTO memberDTO = new MemberDTO();
        System.out.println();
        System.out.println("===================== 회원 정보 입력 화면 ======================");
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

    public MemberDTO memberUpdateMenu(Scanner sc) {
        System.out.println("===================== 회원 정보 수정 화면 ======================");
        System.out.println("1. 주소 수정");
        System.out.println("2. 이메일 수정");
        System.out.println("================================================================");
        System.out.print("번호 >> ");
        int no = Integer.parseInt(sc.nextLine());
        if (no == 1) {
            return memberUpdateAddr(sc);
        } else if (no == 2) {
            return memberUpdateEmail(sc);
        } else {
            return null;
        }
    }

    public MemberDTO memberUpdateEmail(Scanner sc) {
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("====================== 이메일 수정 화면 =======================");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("변경할 이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        return memberDTO;
    }

    public MemberDTO memberUpdateAddr(Scanner sc) {
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("======================= 아이디 수정 화면 =======================");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("변경할 주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        return memberDTO;
    }

    public String memberDelete(Scanner sc) {
        System.out.println("======================= 회원 삭제 화면 ========================");
        System.out.print("삭제할 아이디 >> ");
        return sc.nextLine();
    }

    public String memberSelect(Scanner sc) {
        System.out.println("======================== 회원 검색 화면 ========================");
        System.out.println("1. 아이디 조회");
        System.out.println("2. 이름 조회");
        System.out.print("선택 >> ");
        if (Integer.parseInt(sc.nextLine()) == 1) {
            System.out.print("찾을 아이디 >> ");
            return sc.nextLine();
        } else {
            System.out.println("찾을 이름 >> ");
            return sc.nextLine();
        }
    }

    public String memberGetRow(Scanner sc) {
        System.out.println("======================== 회원 검색 화면 ========================");
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

    public void printRow(MemberDTO dto) {
        System.out.println("================================================================");
        System.out.println("번호\t아이디\t이름\t주소\t\t이메일\t\t나이");
        System.out.println("================================================================");

        System.out.printf("%d\t%s\t%s\t%s\t%s\t%d살\n", dto.getNo(), dto.getId(), dto.getName(), dto.getAddr(),
                dto.getEmail(),
                dto.getAge());

    }

    public void printDTOAll(List<MemberDTO> list) {
        System.out.println("================================================================");
        System.out.println("번호\t아이디\t이름\t주소\t\t이메일\t\t나이");
        System.out.println("================================================================");
        for (MemberDTO dto : list) {
            System.out.printf("%d\t%s\t%s\t%s\t%s\t%d살\n", dto.getNo(), dto.getId(), dto.getName(), dto.getAddr(),
                    dto.getEmail(),
                    dto.getAge());

        }
    }
}
