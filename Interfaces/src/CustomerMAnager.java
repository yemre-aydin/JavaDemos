public class CustomerMAnager {

    IcustomerDal icustomerDal;
    public CustomerMAnager(IcustomerDal icustomerDal){
        this.icustomerDal=icustomerDal;
    }
    public void add(){
        //burada iş kosları yazılır.
        icustomerDal.Add();

    }
}
