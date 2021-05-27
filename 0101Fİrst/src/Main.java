import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* System.out.println("Merhaba");
        System.out.println("MErehba JAva");

        double sayi = 12.5;

        char karakter= 'A';
        System.out.println(karakter);
        boolean dogruMu= false;

        int sayi= 19;

        if (sayi<20){
            System.out.println("SAyı 20 den küçük");
        }

*/
        /*
        for (int i=2;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("For döngüsü Bitti.");

        int i=1;


        //While
        while (i<10){
            System.out.println(i);
            i++;


        }
        //infinite loop sonsuz döngü olur o yüzden sayıyı artırıyoruz
        */


        String mesaj= "Bugün Hava Çok Güzel.";
        System.out.println(mesaj);
        /*
        System.out.println("Eleman sayısı:"+mesaj.length());
        System.out.println("5. Eleman:"+mesaj.charAt(4));
        System.out.println(mesaj.concat("Yaşasın"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler= new char[5];
        mesaj.getChars(0,5,karakterler,0);

        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));
    */

        String yeniMesaj = mesaj.replace(" ","-");
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));
        for (String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());






    }
}
