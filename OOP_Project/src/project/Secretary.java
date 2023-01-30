package project;

public class Secretary extends Staff {
	 //Ekstra özellikler
	 private String department;//(Ekstra özellik)Çalıştığı bölüm
	 private String phonenumber;//(Ekstra özellik)Sekreterin telefon numarası
	 //Constructor
	 public Secretary(int id_, String name_, String surname_, int working_hours, String taskinformation,String worktype,String graduatedschool,String department,String phonenumber) {
		super(id_, name_, surname_, working_hours, taskinformation, worktype,graduatedschool);
		this.setDepartment(department);
		this.setPhonenumber(phonenumber);
	 }
	 public void salary()//A method to calculate the salary for a secretary
	 {
		 setSalary(getWorkinghours()*65);
	 }
	 public Communities setCommunity(String name, Student headstudent, Lecturer lecturer, String department)//(Ekstra metot)
	 {//A method to create a new community for a secretary
		 return new Communities(name,headstudent,lecturer,department);
	 }
	 public Courses setCourse(String code, String name, int credit, String category, Lecturer lecturer,String classroom) {
		 return new Courses(code, name, credit, category, lecturer,classroom);
	 }//A method to make a new course from secretary.
	 //Personel görevlendirme metotları(Ekstra metotlar)
	 public void assignStaff(TechnicalStaff technicalstaff)//Teknik personeli görevlendirme
	 {
		 technicalstaff.setBroken(false);
		 System.out.println("Something is broken");
	 }
	 public void assignStaff(CleaningStaff cleaningstaff)//Temizlik personelini görevlendirme
	 {
		 cleaningstaff.setCleaned(false);
		 System.out.println("Something needs to clean");
	 }
	 //Getters and setters
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
}
