public class Main {

    public static void main(String[] args) {
	// Polymorphism   Çok biçimlilik demektir. Referans tiplerinin birbirinin
        // refaranslarını tutması inherities olması lazım
    //loglama ????
        //
         // Loglama Yöntemi ???

     //   EmailLogger logger=new EmailLogger();
       // logger.Log("Log Mesajı");

//        BaseLogger[] loggers=new BaseLogger[] {new FileLogger(), new EmailLogger(),new ConsolLogger(),new DatabaseLogger()};
//        //filelogger emaillogger databaselogger hepsi baselogger e baplı olduğu için aynı parametreleri tutabiliyor
////her biri baselogger olan 3 eleman ekledik
//        for (BaseLogger logger:loggers)//baselogger i diğerlerine extend yaptık annesi gibi
//            //yapabiliyoruz
//        {
//            logger.Log("Log Mesajı");
//        }
//        //kodlar çalıştı buna polymorphism deniyor
        CustomerManager customerManager= new CustomerManager(new FileLogger());
        customerManager.Add();



    }
}
