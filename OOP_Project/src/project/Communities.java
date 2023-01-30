package project;

public class Communities {
	 private String name;//Topluluğun adı
	 private Student headstudent;//Topluluk başkanı öğrenci
	 private Lecturer lecturer;//Topluluğa danışman öğretmen
	 private String department;//Topluluğun ait olduğu bölüm
	 private int [] studentids;//Topluluğa kayıt olan öğrencilerin idsi
	 private int numstudents=0;//Topluluğa kayıtlı öğrenci sayısı
	 private static final int MAX_STUDENTS=60;//Topluluğun alabileceği maximum öğrenci sayısı
	 public Communities(String name, Student headstudent, Lecturer lecturer, String department)
	 {//Constructor
		 this.name = name;
		 this.headstudent =headstudent;
		 this.department = department;
		 this.lecturer = lecturer;
		 studentids = new int[MAX_STUDENTS];
	 }
	 //Getters and setters
	 public void setLecturer(Lecturer lecturer) {
		 this.lecturer = lecturer;
	 }
	 public Lecturer getLecturer() {
		 return this.lecturer;
	 }
	 public String getName() {
		 return this.name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public Student getHeadStudent() {
		 return this.headstudent;
	 }
	 public void setHeadStudent(Student headstudent) {
		 this.headstudent = headstudent;
	 }
	 public String getDepartment() {
		 return this.department;
	 }
	 public void setDepartment(String department) {
		 this.department = department;
	 }
	 public int[] getStudents() {
		 return this.studentids;
	 }
	 public void setStudents(int studentid)//Öğrenciyi topluluğa kayıt ediyor
	 {
		 if(numstudents<MAX_STUDENTS) {
			 studentids[numstudents]=studentid;
			 numstudents++;
		 }
		 else
		 {
			 System.out.println("Error!The student number reached max student number");
		 }

	 }
	 public String toString()
	 {
		 return String.format("\nName:%s,\nStudent:%s,\nLecturer:%s\nDepartment:%s\nStudents number in the community:%d\n", this.getName(),this.getHeadStudent().getName(),this.getLecturer().getName()+" " +this.getLecturer().getSurname(),this.getDepartment(),numstudents);
	 }
}
