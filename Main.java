import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        /* Kullanıcıdan alınan boy ve kilo degerlerine göre beden kitle indeksş hesaplama Örneği

        BKİ: 18.5'un altındaysa --> Zayıf
        BKİ: 18.5-25 arasındaysa --> Normal
        BKİ: 25-30 arasındaysa --> Fazla Kilolu
        BKİ: 30 un üstündeyse --> Obez

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Giriniz..( Örn; 1,82 ) .. :");
        double boy= scanner.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz..:");
        int kilo= scanner.nextInt();

        double bki = ( kilo / ( boy * boy));

        if  ( bki < 18.5) {

            System.out.println("BKİ : Zayıf..");
        } else if ( bki >=18.5  && bki<25) {
            System.out.println("BKİ : Normal..");
            
            
        } else if ( bki>= 25 &&  bki<30 ) {

            System.out.println("BKİ :Fazla Kilolu..");
            
        } else {

            System.out.println("BKİ :Fazla Kilolu..Obez");
        }


    }
}
