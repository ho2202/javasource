package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx1 {
    public static void main(String[] args) {
        try (Reader re = new FileReader("c:/temp/file1.txt", Charset.forName("utf-8"));
                Writer writer = new FileWriter("c:/temp/output2.txt", true);) {
            char buf[] = new char[1024];

            while (re.read(buf) != -1) {
                // System.out.print(buf);
                writer.write(buf);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
