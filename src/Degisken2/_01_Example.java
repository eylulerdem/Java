package Degisken2;

import java.util.Scanner;

public class _01_Example {
    public static void main(String[] args) {
        //kullanıcıdan cadde sokak posta kodu ve ulke gırınız
         Scanner read=new Scanner(System.in);

         System.out.print("street number =");
         int streetNumber= read.nextInt();

         System.out.print("posta cod=");
         double postaCod=read.nextDouble();

         Scanner read1=new Scanner(System.in);
         System.out.print("country=" );
         String country=read1.nextLine();

         System.out.println("Adress = " +streetNumber+postaCod+country);



    }
}
