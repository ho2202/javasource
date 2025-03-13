package src.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TyWithEx {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try (FileInputStream fis2 = new FileInputStream("file.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
