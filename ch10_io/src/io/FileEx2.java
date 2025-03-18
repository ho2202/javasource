package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileEx2 {
    public static void main(String[] args) {
        File file = new File("c:/temp");
        File dir = new File(file, "dir");

        if (!dir.exists()) {
            dir.mkdirs();
        }
        File file2 = new File("c:/temp/file1.txt");
        File file3 = new File("c:/temp/file2.txt");
        File file1 = new File("c:/temp/");
        try {
            if (!file2.exists()) {
                file2.createNewFile();
            }
            if (!file3.exists()) {
                file3.createNewFile();
            }
            if (!file1.exists()) {
                file1.createNewFile();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        File[] files = file1.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
        System.out.println("\t수정일\t\t 형태\t  크기\t   이름");
        for (File filee : files) {
            System.out.print(sdf.format(filee.lastModified()) + "\t");
            if (filee.isDirectory()) {
                System.out.print("<DIR>\t\t\t" + filee.getName());
            } else {
                System.out.print("\t\t" + filee.length() + "\t" + filee.getName());
            }
            System.out.println();
        }
        System.out.println(file2.getParent());
    }
}
