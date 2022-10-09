package DegiskenÖrn1;

import java.util.Scanner;

public class _08_ScannerExam2 {
    public static void main(String[] args) {
        // bir kenarı verilen karenin cevresini ve alanını bulunuz
        Scanner read=new Scanner(System.in);
        System.out.print("edge=");
       int edge=read.nextInt();
       int area=edge*edge;
        System.out.println("area = " + area);
        int envinorment=4*edge;
        System.out.println("envinorment = " + envinorment);


    }
}
