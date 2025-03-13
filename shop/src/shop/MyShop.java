package shop;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {

    private String title;
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Product> product = new ArrayList<>();
    private ArrayList<Product> cart = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    // user 보관 변수
    private String selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void getUser() {
        users.add(new User("user1", PayType.CARD));
        users.add(new User("user2", PayType.CASH));
    }

    @Override
    public void getProduct() {
        product.add(new CellPhone("갤럭시 S25", 10000, "SKT"));
        product.add(new Tv("삼성QLED", 10000, "1080"));
        product.add(new Tv("삼성OLED", 15000, "1080"));
        product.add(new CellPhone("갤럭시 S24", 7000, "KT"));

    }

    @Override
    public void start() {
        System.out.println();
        System.out.printf("%s : 메인화면 - 계정 선택\n", title);
        System.out.println("======================================");

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) == null) {
                break;
            } else {
                System.out.printf("[%d] %s(%s)\n", i, users.get(i).getName(), users.get(i).getPayType());
            }
        }
        System.out.println("[X] 종료");
        System.out.println("======================================");

        System.out.print("선택 : ");
        String input = sc.nextLine();

        // if (answer.equalsIgnoreCase("x")) {

        // }else{

        // }
        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                selUser = input;
                productList();
                break;
            case "x":
            case "X":
                System.exit(0);
            default:
                System.out.println("입력을 확인해 주세요");
                start();
                break;
        }
    }

    public void productList() {
        System.out.println(title + " : 상품목록 - 상품 선택");
        System.out.println("======================================");
        for (int j = 0; j < product.size(); j++) {
            if (product.get(j) == null) {
                break;
            } else {
                System.out.printf("[%d] ", j);
                product.get(j).printDetail();
            }
        }
        System.out.println("[h] 메인화면\n[c] 체크아웃\n");
        System.out.println("======================================");
        System.out.print("선택 : ");
        String input = sc.nextLine();
        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                cart.add(product.get(Integer.parseInt(input)));
                productList();

                break;
            case "h":
                start();
                break;
            case "c":
                checkOut();
            default:
                break;
        }
    }

    public void cart(String input) {
        // for (int i = 0; i < cart.size(); i++) {
        // if (cart[i] == null) {
        // cart[i] = product[Integer.parseInt(input)];
        // System.out.println("상품이 담겼습니다");
        // break;
        // }
        // }
        productList();
    }

    public void checkOut() {
        System.out.println(title + " : " + users.get(Integer.parseInt(selUser)).getName() + " - 체크 아웃");
        System.out.println("======================================");
        int sum = 0;
        for (int j = 0; j < cart.size(); j++) {
            if (cart.get(j) == null) {
                break;
            } else {
                System.out.printf("[%d] %s (%d)\n", j, cart.get(j).getPname(),
                        cart.get(j).getPrice());
                sum += cart.get(j).getPrice();
            }
        }
        System.out.println("결제 방법: " + users.get(Integer.parseInt(selUser)).getPayType());
        System.out.println("합계: " + sum + "원");
        System.out.println("======================================");
        System.out.println("[p] 이전\n[q] 종료\n");
        System.out.print("선택 : ");
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("p")) {
            productList();
        } else if (input.equalsIgnoreCase("q")) {
            System.exit(0);
        }
    }

}
