public class Main {

    public static void main(String[] args) {
	baseKrediManager[] krediManagers=new baseKrediManager[]
            {new OgretmenkrediManager(),new TarimkrediManager(),new OgrenciKrediManager()};
	for (baseKrediManager krediManager:krediManagers){

	    System.out.println(krediManager.hesapla(1000));
    }



    }
}
