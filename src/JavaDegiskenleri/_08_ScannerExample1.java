package JavaDegiskenleri;

import java.util.Scanner;

public class _08_ScannerExample1 {
    public static void main(String[] args) {
        // adını ve soyadını ayrı ayrı yazdırınız
        Scanner read=new Scanner(System.in);
        System.out.println("name =");
        String name= read.next();

        System.out.println("surname=");
        String surname=read.next();
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
    }
}
