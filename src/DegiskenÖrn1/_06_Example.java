package DegiskenÖrn1;

public class _06_Example {
    public static void main(String[] args) {

        // kisinin agırlıgını double boyunu int giriniz
        //bir satırda boyuuz kilonuz seklınde yazdırınız
        //vucut kıtle ındexını bulunuz(kg/boy*boy)

        double agırlık=62.1;
        int boy=165;
        double kıtleIndex=agırlık/boy*boy;
        System.out.println("boy = " + boy );
        System.out.println("agırlık = " + agırlık);
        System.out.println("boy = " + boy +",agırlık=" +agırlık);
        System.out.println("kıtleIndex = " + kıtleIndex);
        int kutleIndex1=(int)agırlık/boy*boy;
        System.out.println("kutleIndex1 = " + kutleIndex1);

    }
}
