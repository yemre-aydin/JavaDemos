public class sayi_asalM {

    public static void main(String[] args){
        int number = 25;
        int reminder=  number%2;
        System.out.println((reminder));
        boolean isPrime= true;

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



    }
}
