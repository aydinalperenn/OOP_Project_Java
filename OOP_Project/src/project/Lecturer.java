package project;

import java.util.Scanner;
public class Lecturer extends Staff {
	private static final int MAX_COURSES = 10;//Öğretmenin verebileceği max ders sayısı
	private String[] listofCourses = new String[10];//Öğretmenin verdiği derslerin listesi
	private int numCourses = 0;//Öğretmenin verdiği ders sayısı
	private String announcement;//(Ekstra özellik)Duyuru
	private String title;//(Ekstra özellik)Unvanını tutan değişken
	private int titletype=0;//(Ekstra özellik)Unvanının derecesini tutan değişken
	//Constructor method
	public Lecturer(int id_, String name_, String surname_, int workinghours, String taskinformation,String worktype,String graduatedschool,String title) {
		super(id_, name_, surname_, workinghours, taskinformation, worktype,graduatedschool);
		this.title=title;//Belli bir unvanı varsa o unvanla kaydolur.
		if(title=="Lecturer" || title=="lecturer")
		{
			titletype=1;
		}
		else if(title=="Associate Professor" || title=="associate professor")
		{
			titletype=2;
		}
		else if(title=="Professor" || title=="professor")
		{
			titletype=3;
		}
		else
		{
			titletype=0;
			this.title="Research Assistant";
		}
	}
	//@Override
	//Lecturer kaydolurken unvan bilgisi girilmediyse araştırma görevlisi olarak kayıt olur.
	public Lecturer(int id_, String name_, String surname_, int workinghours, String taskinformation,String worktype,String graduatedschool)
	{
		super(id_, name_, surname_, workinghours, taskinformation, worktype,graduatedschool);
		this.title="Research Assistant";
		titletype=0;
	}
	//Extra metotlar
	public void promoted()//Lecturerı terfi ettiren,unvanını değiştiren fonksiyon
	{
		titletype++;
		switch(titletype)
		{
		case 1:
			setTitle("Lecturer");
			break;
		case 2:
			setTitle("Associate Professor");
			break;
		case 3:
			setTitle("Professor");
			break;
		}
	}
	public void setAnnouncement()//A method to make an announcement for a lecturer.
	{
		System.out.println("Make an announcement: ");
		Scanner scanner = new Scanner(System.in);
		this.announcement=scanner.nextLine();
		System.out.println(announcement);
	}
	public void salary()//A method to calculate salary.
	{
		setSalary(getWorkinghours()*100);
	}
	public void addAbsenteeism(Student student) {
		//An extra method to add absenteeism for a student.
		student.addAbsenteeism();
	}
	public void printCourses() {//A method to print the lessons which are given by the lecturer.
		for(int i = 0; i < this.listofCourses.length && this.listofCourses[i] != null; ++i) {
			System.out.printf("\n%s's course name:%s\n", this.getName(), this.listofCourses[i]);
		}
	}
	public void addCourse(Courses course) {//A method to add a lesson for a lecturer.
		try {
			this.listofCourses[this.numCourses] = course.getName();
			++this.numCourses;
		} catch (Exception var3) {
			System.out.println("\nThis lecturer access to max course number.");
		}
	}
	public void addCourseGrade(Student student) {//A method to add a grade for a student
		student.setGrades();
	}
	//Getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
