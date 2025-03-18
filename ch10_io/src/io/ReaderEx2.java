package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx2 {
    public static void main(String[] args) {
        try (Reader re = new FileReader("c:/temp/file1.txt", Charset.forName("utf-8"));
                BufferedReader bre = new BufferedReader(re);
                Writer writer = new FileWriter("c:/temp/output3.txt", true);
                BufferedWriter bwr = new BufferedWriter(writer);) {

            String str = "";
            while ((str = bre.readLine()) != null) {
                bwr.write(str);
                bwr.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
