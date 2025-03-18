package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class ReaderEx3 {
    public static void main(String[] args) {
        try (Reader re = new FileReader("./ch10_io/src/io/FileEx1.java", Charset.forName("utf-8"));
                BufferedReader bre = new BufferedReader(re);) {
            String str = "";
            int i = 1;
            while ((str = bre.readLine()) != null) {
                System.out.println(i++ + " " + str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
