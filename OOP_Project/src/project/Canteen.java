package project;

public class Canteen extends Areas {
	public Canteen(int balance)//Constructor
	{
		super(balance);
	}
	public void buying(Student student,String product)//Öğrenci kantinden ürün satın alıyor
	{
		if(getStock()>0)//Stok kontrolü
		{
			student.deleteMoney(5);//Öğrencinin parası azalıyor
			System.out.println(product+" is bought");
			this.balance();
			this.deleteStock();
		}
		else
		{
			System.out.println("Stock is empty.");//Stokta ürün yoksa satın alınamaz
		}
	}
	public void balance()//Ürün satın alınınca kantinin bakiyesi artıyor
	{
		int tempbalance=getBalance();
		tempbalance+=5;
		setBalance(tempbalance);
	}
	public void addStock(int stock)//Satılacak ürünler satın alınıyor
	{
		if(getBalance()>=stock*2)//Satılacak ürünleri almak için bakiye kontrolü
		{
			int tempBalance=getBalance();
			tempBalance-=stock*2;
			setBalance(tempBalance);//Satılacak ürün satın alındıktan sonra bakiye azalır
			int tempstock=getStock();
			tempstock+=stock;
			setStock(tempstock);//Satılacak ürünün stoğu artıyor
		}
		else
		{
			System.out.println("The balance is not enough to buy");
		}
	}
	public void deleteStock()//Ürün öğrenci tarafından satın alındıktan sonra satılacak ürün stoğu azalır
	{
		int tempstock=getStock();
		tempstock--;
		setStock(tempstock);
	}
}