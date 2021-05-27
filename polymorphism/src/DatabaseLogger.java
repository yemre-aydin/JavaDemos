public class DatabaseLogger extends BaseLogger{

    //Override eder base den çekmek yerine tekrar yazarsan
    //üzerine yazmış demektir

    public void Log(String massage){
        System.out.println("Logged to database:  "+massage);
    }//bütün operayonlarda sonuç aynıdır ama database de değişiyorsa ona gelip
    //değiştirebiliyoruz buna Override deniyor




}
