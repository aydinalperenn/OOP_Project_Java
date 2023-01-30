package project;

public abstract class Areas {
	
	private int balance=0;//bakiye
	private int stock;//stoktaki ürünler
	public Areas(int balance) //Constructor
	{
		this.balance=balance;
	}
	//the method is for the student to buy a product from canteen or stationery
	public abstract void buying(Student student,String product);
	public abstract void balance();
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
