public class Main {

    public static void main(String[] args) {
	String mesaj="Bugün hava çok güzel.";
	String yenimesaj= sehirVer();
	int sayi= topla(2,5);
	System.out.println(sayi);
	int toplam= topla2(2,3,4,6,10);
	System.out.println(toplam);

    }

    public static  void ekle(){
        System.out.println("mesaj eklendi");
    }
    public static void sil() {
        System.out.println("Silindi.");
    }
    public static void guncelle () {
        System.out.println("Güncellendi.");
    }
    public static int topla(int sayi1,int sayi2){
       return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){
        //3 nokta variable argumens anlamına geliyor
        int toplam=0;
        for (int sayi:sayilar){
            toplam +=sayi;
        }
        return toplam;

    }
    public static String sehirVer(){
        return "Ankara";
    }

}
