package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriterEx1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
                FileWriter writer = new FileWriter("c:/temp/output4.txt");
                BufferedWriter bwr = new BufferedWriter(writer);) {
            System.out.println("q 입력시 종료");
            String input = "";

            System.out.print(">> ");
            while (!(input = sc.next()).equals("q")) {
                System.out.print(">> ");
                bwr.write(input);
                bwr.newLine();
            }
            // String data = "";
            // String dataLine = "";
            // do {
            // dataLine = sc.nextLine();
            // data += dataLine;
            // } while (!dataLine.equals("q"));

            // bwr.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
