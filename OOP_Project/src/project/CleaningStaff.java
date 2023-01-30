package project;

public class CleaningStaff extends Staff {
	private boolean isCleaned=false;//(Ekstra özellik)Temizlenip temizlenmediğini kontrol eden değişken
	private int bonus;//(Ekstra özellik)Ekstra kazanacağı parayı tutan değişken
	//Constructor
	public CleaningStaff(int id_, String name_, String surname_, int workinghours, String taskinformation, String worktype,String graduatedschool) {
		super(id_, name_, surname_, workinghours, taskinformation, worktype,graduatedschool);
	} // end of cleaning staff constructor
	
	public void salary()//to calculate cleaning staff's salary.
	{
		setSalary(getWorkinghours()*50+bonus);
	}
	public void cleanClass(String Class)//Temizlenecek sınıf temizleme metotu
	{
		setCleaned(true);
		System.out.println("The class is cleaned");
		bonus();
	}
	public void bonus()//Temizlenen sınıf başına bonus hesaplayan metot
	{
		bonus+=50;
	}
	//Getter and setter
	public boolean isCleaned() {
		return isCleaned;
	}
	public void setCleaned(boolean isCleaned) {
		this.isCleaned = isCleaned;
	}
}

