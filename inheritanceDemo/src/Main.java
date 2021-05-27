public class Main {

    public static void main(String[] args) {
        KrediUI krediUI=new KrediUI();
        //polymorphism
        krediUI.KrediHesapla(new OgretmenKrediManager());
    }
}
