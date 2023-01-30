package project;

public class Courses {
	 private String code;//Dersin kodu
	 private String name;//Dersin adı
	 private int credit;//Dersin kredisi
	 private int[] studentids;//Dersi alan öğrencilerin idlerini tutan dizi
	 private Lecturer lecturer;//Dersin öğretmeni
	 private String category;//Dersin graduate mi undergraduate mi olduğunu tutuyor
	 private int numStudents = 0;//Dersi alan öğrenci sayısı
	 private String classroom;//Dersin verildiği derslik
	 private static final int MAX_STUDENTS=80;//Dersi alan maksimum öğrenci sayısı
	 private Student headofcourse;//(Ekstra özellik)Dersin öğrenci temsilci
	 private String resourcebook;//(Ekstra özellik)Dersin kaynak kitabı
	 private int[] studentswhoboughtthebook;//(Ekstra özellik)Kitabı alan öğrencilerin idlerini tutan dizi
	 private int numStudentswhoboughtthebook=0;//(Ekstra özellik)Kitabı alan öğrenci sayısını tutan değişken
	 //Constructor
	 public Courses(String code, String name, int credit, String category,Lecturer lecturer,String classroom)
	 {
		 this.code = code;
		 this.name = name;
		 this.credit = credit;
		 this.category = category;
		 this.setLecturer(lecturer);
		 lecturer.addCourse(this);
		 this.classroom=classroom;
		 studentids=new int [MAX_STUDENTS];
		 studentswhoboughtthebook=new int[MAX_STUDENTS];
	 }
	 //Ekstra metotlar
	 public void buyResourceBook(Student student)//Öğrencinin kaynak kitabı satın alması
	 {
		 if(student.getMoney()>=15)
		 {
			 student.deleteMoney(15);
			 System.out.println("The book is bought by the student");
			 studentswhoboughtthebook[numStudentswhoboughtthebook]=student.getId();
			 numStudentswhoboughtthebook++;
		 }
		 else
		 {
			 System.out.println("Money is not enough");
		 }
	 }
	 public void printStudentswhoboughtthebook()//Kaynak kitabı satın alan öğrencileri gösteren method
	 {
		 System.out.println("The students who bought the book:");
		 for(int i=0;i<numStudentswhoboughtthebook&&studentswhoboughtthebook[i]!=0;i++)
		 {
			 System.out.println(studentswhoboughtthebook[i]);
		 }
	 }

	 //Derse kaydolan öğrencilerin idleri tutuluyor
	 public void setstudentids(Student student) {
		 if(numStudents==0)
		 {
			 this.headofcourse=student;
		 }
		 this.studentids[this.numStudents] = student.getId();
		 ++this.numStudents;
	 }
	 //Getters and setters
	 public String getCode() {
		 return this.code;
	 }
	 public String getName() {
		 return this.name;
	 }
	 public String getLocation() {
		 return this.classroom;
	 }
	 public void setLocation(String classroom_) {
		 this.classroom = classroom_;
	 }
	 public int getCredit() {
		 return this.credit;
	 }
	 public void setCategory(String category_) {
		 this.category = category_;
	 }
	 public String getCategory() {
		 return this.category;
	 }
	 public void setLecturer(Lecturer lecturer_) {
		 this.lecturer = lecturer_;
	 }
	 public Staff getLecturer() {
		 return this.lecturer;
	 }
	 public int[] getStudents() {
		 return this.studentids;
	 }
	 public int getNumStudents()
	 {
		 return numStudents;
	 }
	 public int getMAX_STUDENTS()
	 {
	 		return MAX_STUDENTS;
	 }
	 public Student getHeadofcourse() {
		 return headofcourse;
	 }
	 public String getResourcebook() {
		 return resourcebook;
	 }
	 public void setResourcebook(String resourcebook) {
		 this.resourcebook = resourcebook;
	 }
	 public String toString() {
		 return String.format("\nCode: %s,\nName:%s,\nCredit:%d,\nLocation:%s\n", this.getCode(),this.getName(), this.getCredit(), this.getLocation());
	 }
}
