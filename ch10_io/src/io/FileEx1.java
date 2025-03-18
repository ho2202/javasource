package io;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {
        // File file = new File("c:tmp\\");
        File file2 = new File("c:tmp\\", "text.txt");
        // File dir = new File("c");
        // File file3 = new File(dir, "t.txt");

        int pos = file2.getName().lastIndexOf(".");
        System.out.println("경로 없는 파일명 " + file2.getName());
        System.out.println("확장자 없는 파일명 " + file2.getName().substring(0, pos));
        // File.pathSeparatorChar = File.pathSeparator = ;
        // File.separatorChar = File.separator = \
    }
}
