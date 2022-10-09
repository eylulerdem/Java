package JavaDegiskenleri;

import java.util.Scanner;

public class _07_ScannerExample {
    public static void main(String[] args) {
        //Girilen bir adı ekrana yazdırınız
        Scanner read=new Scanner(System.in);
        System.out.println("name =");
         String name= read.next();
        System.out.println("name = " + name);
    }
}
