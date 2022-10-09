package Degisken2;

import java.util.Scanner;

public class _04_Exam {
    public static void main(String[] args) {
        //contains:bir stringin içerisinde karakterlerin var olup olmadıgını boolean cinsinden yazdırınız
        Scanner read=new Scanner(System.in);
        String cümle="merhaba Dünya";
        boolean varMı=cümle.contains("a");
        System.out.println("varMı = " + varMı);

    }
}
