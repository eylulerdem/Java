package Donusum1;

import java.util.Scanner;

public class _03_Example {
    public static void main(String[] args) {
        //kullanıcıdan alacagınız iki tam sayının toplamını ekrana yazdırınız
      Scanner read=new Scanner(System.in);
        System.out.println("number");
      int number= read.nextInt();
        System.out.println("number1");
      int number1= read.nextInt();
      int toplam=number+number1;
        System.out.println("toplam = " + toplam);



    }
}
