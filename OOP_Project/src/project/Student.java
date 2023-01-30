package project;

import java.util.Scanner;
public class Student {
	private static final int MAX_COURSES =40;//Öğrencinin alabileceği maksimum ders sayısı
	private int id;//Öğrencinin numarası
	private String name;//Öğrencinin adı
	private String surname;//Öğrencinin soyadı
	private String studentId;//Öğrencinin TC
	private int year;//Öğrencinin giriş yılı
	private String[] coursesTaken;//Öğrencinin alınnan dersleri tutan dizi
	private int[] grades;//Öğrencinin notlarını tutan dizi
	private float gpa=0;//Öğrencinin GPA
	private String studentType;//öğrencinin türü(master,etc.)
	private String graduateCertificate;//Öğrencinin mezuniyet sertifikası
	private int numCourses = 0;//Öğrencinin ders sayısı tutan değişken(Array indisi için)
	private int numGrade = 0;//Öğrencinin not sayısını tutan değişken(Array indisi için)
	private Lecturer advisor;///ekstra özellik) öğrencinin danışman öğretmeni
	private int absenteeism = 0;//(ekstra özellik) devamsızlık
	private int money;//(ekstra özellik)öğrencinin parası(bursu)
	private String department;//Öğrencinin bölümü
	private int [] coursescredits;//Öğrencinin sırasıyla aldığı derslerin kredi değerleri
	private static final int MAX_CREDITS=40;//Öğrencinin alabileceği max krediyi tutan değişken
	//Ekstra metot
	public void addAbsenteeism() {
		if(absenteeism<5)
		{
			++this.absenteeism;
			System.out.printf("Absenteeism count of the student:%d\n", this.absenteeism);
		}
		else
		{
			System.out.println("Your absenteeism reached max number.");
		}
	}
	public void setCommunities(Communities community)//Öğrencinin topluluğa kaydolur
	{
		community.setStudents(id);
	}
	public void addMoney(int money)//Öğrenciye para ekleyen metot
	{
		this.money+=money;
	}
	public void deleteMoney(int money)//Öğrencinin parasını azaltan metot
 	{
		this.money-=money;
 	}
	//Getters and setters
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getSurname() {
		return this.surname;
	}
	public String getStudentId() {
		return this.studentId;
	}
	public int getYear() {
		return this.year;
	}
	public String[] getCoursesTaken() {
		return this.coursesTaken;
	}
	public int getAbsenteeism()
	{
		return this.absenteeism;
	}
	public void setCoursesTaken(Courses course) {//Öğrenci derse kaydolur
		if( course.getNumStudents()<course.getMAX_STUDENTS())
		{
			boolean isTaken = false; // Dersin daha önce alınıp alınmadığını kontrol etmek için
			for(String c: coursesTaken){
				if(c == course.getCode()) isTaken=true; // Ders daha önce alındısya değişkeni true yap
			}
			if(!isTaken){
				this.coursesTaken[this.numCourses] = course.getCode();
				coursescredits[numCourses]=course.getCredit();
				++this.numCourses;
				course.setstudentids(this);
				System.out.println("Successful! "+getName() +" has "+course );

			}
			else{
				System.out.println("Adding course is failed! The student has " +course );
			}

		}
		else
		{
			System.out.println("The course reached max student number.");
		}
	}
	public void setGrades() {//Öğrenciye not ataması yapan metot
		int i;
		int note;
		int totalcredit=0;//Öğrencinin almış olduğu derslerin toplam kredisi
		int tempnotemultiplycredits=0;//GPA hesaplamak için tutulan temp değeri
		for(int credit : coursescredits) {
			totalcredit+=credit;//Öğrencinin daha önceden aldığı derslerin toplam kredisini hesaplıyor
		}
		//Öğrenciye not girişi yapılıyor
		for(i = 0; i < this.coursesTaken.length && this.coursesTaken[i] != null; ++i) {
			System.out.printf("%s: ", this.coursesTaken[i]);
			Scanner scanner = new Scanner(System.in);
			note = Integer.parseInt(scanner.nextLine());
			this.grades[i] = note;

			tempnotemultiplycredits += note*coursescredits[i];//Notu yeni atanan derslerin notlarıyla kredilerini çarpıyor

		}

		gpa= gpa*100/4;//4 üzerindeni 100 üzerine çeviriyor
		gpa=(gpa*totalcredit+tempnotemultiplycredits)/(totalcredit);//100 üzerinden işlem yapıyor

		gpa=(gpa*4/100);//4lüke çeviriyor
	}
	//Getters and setters
	public int[] getGrades() {
		return this.grades;
	}
	public float getGpa() {
		return this.gpa;
	}
	public String getGraduateCertificate() {
		return this.graduateCertificate;
	}
	public void setGraduateCertificate(String graduateCertificate){
		this.graduateCertificate = graduateCertificate;
	}
	public String getStudentType(){
		return studentType;
	}
	public String getDepartment()
	{
		return department;
	}
	public Lecturer getAdvisor() {
		return this.advisor;
	}
	public void setAdvisor(Lecturer advisor)
	{
		this.advisor=advisor;
	}
	public int getNumCourses(){
		return numCourses;
	}
	public void setMoney(int money) {
		this.money=money;
	}
	public int getMoney() {
		return money;
	}
	//Constructor
	public Student(int id, String name, String surname, int year,String studentType,int money,Lecturer advisor,String department,String studentId) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.year = year;
		this.department=department;
		this.coursesTaken = new String[50];
		this.grades = new int[50];
		this.studentType = studentType;
		this.money=money;
		setAdvisor(advisor);
		coursescredits = new int[MAX_CREDITS];
		this.studentId=studentId;
	}
	//toString method
	public String toString() {
		return String.format("\nid:%d\nName:%s,\nSurname:%s,\nYear:%d\nStudentId:%s,\nGPA:%f\nAdvisor:%s\n", this.getId(),this.getName(), this.getSurname(), this.getYear(), this.getStudentId(), this.getGpa(),this.getAdvisor().getName() + " " + getAdvisor().getSurname());
	}
	//A method to print a students' lessons and grades.
	public void Print() {
		for(int i = 0; i < this.coursesTaken.length && this.coursesTaken[i] != null; ++i) {
			System.out.printf("Course:%s,Grade:%d\n", this.coursesTaken[i], this.grades[i]);
		}
	}
}
