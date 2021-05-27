public class Product {

    public Product(int id, String name, String description,double price,int stockAmount,String renk){//yapıcı blog constructor yapısıdır bu
        //parantez içine koyduğumuz int string ve diğerleri anlamı: eğer bu değerleri verirsen kullanmana izin veririm diyor.
        System.out.println("Yapıcı Blog Çalıştı.");
        this.id=id;
        this.renk=renk;
        this.name=name;
        this.price=price;
        this.description=description;
        this.stockAmount=stockAmount;
        System.out.println("Yapıcı Blog Çalıştı.");


    }//buna overload deniyor
  //  bir tane parametreli bir tane de parametre vermeden istenildiği gibi
    //kullanmak için yapılıyor
    public Product(){
        //isteyen istediğini kullanır anlamına geliyor
    }

    //attribute  field deniyor
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

//getter denir
    public int getId(){
        //işleyip ihtiyaçlarıma göre değiştirebilirim
        return id;
    }//isimlendirme get ve set ile başlar
    //setter denir
    public void setId(int id){ //set edilecek dğişkenin parameteresi verilmeli
        this.id=id;//iki id değişkeni karışmasın diye this koyuyoruz
                    // yada birinin başına _ çigi koyabilirizyoksa this koymak zorundayız
    }


    public String get_Name() {
        return name;
    }

    public void set_Name(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }
//yazılabilir olmasını istemiyorsanız setkod u sileriz
    /*
    public void setKod(String kod) {
        this.kod = kod;
    }*/
}
