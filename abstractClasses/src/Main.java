public class Main {
//abstract lar yalnız kullanılamazlar ve ortak paylaşımda herkesin kendi şartlarını yazmasını zorunlu
// kılan  bir class
    public static void main(String[] args) {

        WomenGameCalculator womenGameCalculator=new WomenGameCalculator();
        womenGameCalculator.hesapla();
        womenGameCalculator.gameOver();

        GameCalculater gameCalculater=new WomenGameCalculator();

    }
}
