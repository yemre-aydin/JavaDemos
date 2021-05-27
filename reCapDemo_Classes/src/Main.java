public class Main {

    public static void main(String[] args) {
/*

	DortIslem dortislem= new DortIslem();
	int sonuc= dortislem.Topla(3,4);
	System.out.println(sonuc);

*/
		Product product= new Product(1,"LAptop","Asus",3000,2,"Siyah");//product class ının içine method gibi olabiliyor
	/*	product.set_Name("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);*/
		System.out.println(product.getKod());


		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		//productManager.Add2(2," "," ",2,2000);
		product.getId();//bu şekilde id yi okuyabilir



    }
}
