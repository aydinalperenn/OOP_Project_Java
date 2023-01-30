package project;

public abstract class Staff {
	 private int id;//idsi
	 private String name;//Staff adı
	 private String surname;//Staff soyadı
	 private int working_hours;//Çalışma saatleri
	 private String task_information;//Görev bilgisi
	 private String work_type;//Çalışma tipi
	 private int salary;//(ekstra özellik)Maaş
	 private String graduatedschool;//(ekstra özellik)Mezun olduğu okul
	 public abstract void salary();//(Ekstra metot)Maaş hesaplayan metot
	 //Constructor
	 public Staff(int id_, String name_, String surname_, int workinghours, String taskinformation,String worktype,String graduatedschool) {
		 this.name = name_;
		 this.surname = surname_;
		 this.task_information = taskinformation;
		 this.work_type = worktype;
		 this.setid(id_);
		 this.setWorkinghours(workinghours);
		 this.graduatedschool=graduatedschool;
	 }
	 //Getters and setters
	 public void setid(int id_) {
		 this.id = id_;
	 }
	 public int getid() {
		 return this.id;
	 }
	 public void setName(String name_) {
		 this.name = name_;
	 }
	 public String getName() {
		 return this.name;
	 }
	 public void setSurname(String surname_) {
		 this.surname = surname_;
	 }
	 public String getSurname() {
		 return this.surname;
	 }
	 public void setTaskinfo(String taskinformation) {
		 this.task_information = taskinformation;
	 }
	 public String getTaskinfo() {
		 return this.task_information;
	 }
	 public void setWorktype(String worktype) {
		 this.work_type = worktype;
	 }
	 public String getWorktype() {
		 return this.work_type;
	 }
	 public int getWorkinghours() {
		 return this.working_hours;
	 }
	 public void setWorkinghours(int workinghours) {
		 this.working_hours = workinghours;
	 }
	 public void setSalary(int salary)
	 {
		 this.salary=salary;
	 }
	 public String getGraduatedschool() {
		 return graduatedschool;
	 }
	 public String toString() {
		 return String.format("\nid: %d\nName:%s,\nSurname:%s,\nTask Info:%s\nWork Type:%s,\nWorking Hours:%d\n", this.getid(), this.getName(), this.getSurname(), this.getTaskinfo(),this.getWorktype(), this.getWorkinghours());
	 }
}
