package DegiskenÖrn1;

import java.util.Scanner;

public class _09_DoubleExmp {
    public static void main(String[] args) {
        //kullanıcının agırlıgını double boyunu ınt giriniz
        //bir satırda boyunuz ve kilonuz seklınde ekrana yazdırınız
        //vucut kitle indexini bulunuz kg/boy*boy
        Scanner read=new Scanner(System.in);
        System.out.println("weight = " );
        double weight= read.nextDouble();

        System.out.println("size = " );
        int size= read.nextInt();

        double vck=weight/(size*size);
        System.out.println("vck = " + vck);
        System.out.println("weight = " + weight+",size="+size);


    }
}
