package Degisken2;

import java.util.Scanner;

public class _03_Exam {
    public static void main(String[] args) {
        // girilen ad soyadın baş harflerini yazdırınız
        Scanner read=new Scanner(System.in);
        System.out.println("name and surname=");
        String tamAd= read.nextLine();

        char ilkHarf=tamAd.charAt(0);
        int boslukIndex=tamAd.indexOf("");
        char soyadİlkHarf=tamAd.charAt(boslukIndex+1);
        System.out.println(ilkHarf+"." +soyadİlkHarf +".");



    }
}
