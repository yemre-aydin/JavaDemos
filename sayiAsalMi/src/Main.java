public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        int number = 4;
        int reminder=  number%2;
      //  System.out.println((reminder));
        boolean isPrime= true;
        if (number==1){
            System.out.println("Sayı asal değildir.");
            return;
        }
        if (number<1){
            System.out.println("Geçersiz sayı");

        }

        for (int i=2;i<number;i++){
            if (number%2==0){
                isPrime = false;

            }
        }
        if (isPrime){
            System.out.println("Sayı asaldır.");
        }else {
            System.out.println("Sayı asal değildir.");
        }
*/

        char harf= 'A';

        switch (harf){
            case  'A':
            case  'I':
            case  'O':
            case  'U':
                System.out.println("kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");


        }



    }
}
