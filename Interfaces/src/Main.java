public class Main {

    public static void main(String[] args) {

	//interface onu implement eden class ın refaransını tutabilir
        //interface operasyonu implement edilmesi gereken durumlarda
        //o zaman interfaceden yararlanıyoruz
        //bir class birden fazla interface i implement edebilir
        CustomerMAnager customerMAnager= new CustomerMAnager(new OracleCustomerDal());
        //customerMAnager.icustomerDal=new MySqlCustomerDal();
        customerMAnager.add();

    }
}
