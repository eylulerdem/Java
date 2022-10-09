package Degisken2;

import java.util.Scanner;

public class _02_StringExam {
    public static void main(String[] args) {
        // girilen bir stringin sadece son harfini yazdırınız
        Scanner read=new Scanner(System.in);
        System.out.println("bir string giriniz=");
        String girilen= read.nextLine();
        int uzunluk=girilen.length();
        char sonHarf=girilen.charAt(uzunluk-1);
        System.out.println(sonHarf);
        System.out.println("sonHarf = " + girilen.charAt(girilen.length()-1));
    }
}
