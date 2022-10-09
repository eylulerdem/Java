package DegiskenÖrn1;

import java.util.Scanner;

public class _07_Example {
    public static void main(String[] args) {
        // kullanıcını adını ve soyadını ekran yazdırınız
        Scanner read=new Scanner(System.in);
        System.out.print("name and surname=");
        String nameSurname = read.nextLine();
        System.out.println("nameSurname = " + nameSurname);
    }
}
