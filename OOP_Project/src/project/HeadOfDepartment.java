package project;

public class HeadOfDepartment extends Lecturer{
	 private Student honorstudent;//(Ekstra özellik)Onur öğrencisi
	 private String office;//(Ekstra özellik)Ofisi
	 //Constructor
	 public HeadOfDepartment(int id_, String name_, String surname_, int workinghours, String taskinformation, String worktype,String office,String graduatedschool) {
		 super(id_, name_, surname_, workinghours, taskinformation, worktype,graduatedschool);
		 this.setOffice(office);
	 }
	 //Ekstra metotlar
	 public void salary()//A method to calculate salary.
	 {
		 setSalary(getWorkinghours()*110);
	 }
	 public void honorstudent(Student student)//Onur öğrencisi seçen metot
	 {
		 if(student.getGpa()>3.50&&student.getAbsenteeism()==0)
		 {
			 setHonorstudent(student);
			 System.out.println("Congratulations!"+student.getName()+" "+student.getSurname()+"qualified to be a honor student");
		 }
		 else
		 {
			 System.out.println("This student is not qualified");
		 }
	 }
	 //Getters and setters
	public Student getHonorstudent() {
		return honorstudent;
	}
	public void setHonorstudent(Student honorstudent) {
		this.honorstudent = honorstudent;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	//A method to give graduate certificate for a student
	 public void setGraduateCertificate(Student student){
		 if(student.getStudentType() == "licence" || student.getStudentType() == "Licence"){
			 if(student.getNumCourses()>=40 && student.getGpa() >= 2.00){
				 student.setGraduateCertificate(student.getName() + " " + student.getSurname() + "(" + student.getStudentId() + ") " + "is qualified to graduate for " + student.getDepartment() + " department for " + student.getStudentType() + " thanks to Gpa: " +student.getGpa());
			 }
			 else{
				 System.out.println("This student does not meet the graduation requirements.");
			 }
		 } 
		 else if (student.getStudentType() == "Master" || student.getStudentType() == "master") {
			 if(student.getNumCourses()>=7 && student.getGpa() >= 2.50){
				 student.setGraduateCertificate(student.getName() + " " + student.getSurname() + "(" +student.getStudentId() + ") " + "is qualified to graduate for " + student.getDepartment()+ " department for " + student.getStudentType() + " thanks to Gpa: " +student.getGpa());
			 }
			 else{
				 System.out.println("This student does not meet the graduation requirements.");
			 }
		 }
		 else {
			 if(student.getNumCourses()>=8 && student.getGpa() >= 3.00){
				 student.setGraduateCertificate(student.getName() + " " + student.getSurname() + "(" +student.getStudentId() + ") " + "is qualified to graduate for " + student.getDepartment()+ " department for " + student.getStudentType() + " thanks to Gpa: " +student.getGpa());
			 }
			 else{
				 System.out.println("This student does not meet the graduation requirements.");
			 }
		 }
	 }
}

