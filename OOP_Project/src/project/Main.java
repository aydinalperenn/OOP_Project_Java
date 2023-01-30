package project;

public class Main {

	public static void main(String[] args) {
		
		//	Alperen Aydın
		//	Tanem Çelik
		//	Ayşe Halise Demirel

		Secretary secretary1 = new Secretary(19127,"Şehnaz", "Yılmaz",7, "Sekreter", "Full-time","Gazi Üniversitesi","Bilgisayar Mühendisliği","3125554040");
		Lecturer lecturer1 = new Lecturer(124670,"Murat","Şırdancı",5,"Öğretmen","Full-time","Orta Doğu Teknik Üni.");
		Lecturer lecturer2 = new Lecturer(124671,"Eda","Akıncı",5,"Öğretmen","Full-time","İstanbul Teknik Üni.","Associate Professor");
		Student student1 = new Student(2000,"Asya","Bilge",2020,"licence",1250,lecturer1,"Bilgisayar Mühendisliği","10912714556");
		Student student2 = new Student(2001,"Özün","Bedir",2021,"Master",1650,lecturer2,"Bilgisayar Mühendisliği","10811712578");
		Student student3 = new Student(2002,"Burak","Akyüz",2021,"doctoral",2050,lecturer1,"Bilgisayar Mühendisliği","10611410246");
		Student student4 = new Student(2003,"Adil","Cantemur",2021,"licence",0,lecturer2,"Bilgisayar Mühendisliği","10912011512");
		Student student5 = new Student(2004,"Kemal","Demir",2021,"licence",1250,lecturer2,"Bilgisayar Mühendisliği","10512161418");
		Student student6 = new Student(2005,"Ahmet","Demirel",2020,"licence",1250,lecturer2,"Bilgisayar Mühendisliği","10812161418");
		CleaningStaff cleaningstaff=new  CleaningStaff (124672,"Mahmut","Tuncer",5, "Halay", "Part-time" ,"Ayrancı Meslek Lisesi");
		TechnicalStaff technicalStaff=new TechnicalStaff(124673,"İbrahim","Tatlıses", 4, "Türkü", "Part-time" ,"Çiğköfte Meslek Lisesi");
		HeadOfDepartment headofdepartment=new HeadOfDepartment(124372,"Lavinya","Aykaç",4,"Öğretmen","Full-time","140","Gazi Üniversitesi");

		//student2:master student3:doctoral
		secretary1.salary();
		System.out.println(secretary1.getSalary());

		Communities community1=secretary1.setCommunity("Yapay zeka", student1, lecturer1, "Bilgisayar mühendisliği");


		secretary1.assignStaff(cleaningstaff);
		secretary1.assignStaff(technicalStaff);

		Courses BM205= secretary1.setCourse("BM205","Data Structures",5,"graduate",lecturer1,"402");
		Courses BM224= secretary1.setCourse("BM224","OOP",4,"graduate",lecturer1,"414");
		Courses BM108= secretary1.setCourse("BM108","Data Science",8,"Master",lecturer2,"414");
		Courses BM102= secretary1.setCourse("BM102","Graf Teorisi",9,"Doctoral",lecturer2,"408");

		lecturer2.setAnnouncement();
		System.out.println(lecturer1.getTitle());
		lecturer1.promoted();
		System.out.println(lecturer1.getTitle());

		lecturer2.addAbsenteeism(student4);
		lecturer2.addAbsenteeism(student4);

		lecturer2.salary();
		System.out.println( lecturer2.getSalary());

		lecturer2.printCourses();

		student2.setCoursesTaken(BM108);//master
		student3.setCoursesTaken(BM102);//doctoral
		student1.setCoursesTaken(BM205);//lisans
		student1.setCoursesTaken(BM224);//lisans
		student4.setCoursesTaken(BM205);//lisans
		student4.setCoursesTaken(BM205);//öğrenci aynı derse kaydolamıyor
		student5.setCoursesTaken(BM205);
		student6.setCoursesTaken(BM205);//dersin kapasitesi dolduysa eklenemez

		lecturer1.addCourseGrade(student1);
		System.out.println(student1);//GPA'Yİ GÖSTERMEK İÇİN
		student1.Print();//Öğrencilerin aldığı dersleri ve notları
		lecturer2.addCourseGrade(student2);
		lecturer2.addCourseGrade(student3);
		lecturer1.addCourseGrade(student4);
		lecturer1.addCourseGrade(student5);

		System.out.println(BM205.getHeadofcourse());

		student3.setCommunities(community1);
		student4.setCommunities(community1);
		student5.setCommunities(community1);

		System.out.println(student1.getMoney());
		student1.addMoney(200);
		System.out.println(student1.getMoney());

		BM205.buyResourceBook(student4);
		BM205.buyResourceBook(student1);
		BM205.printStudentswhoboughtthebook();

		headofdepartment.honorstudent(student4);
		headofdepartment.honorstudent(student1);
		headofdepartment.setGraduateCertificate(student1);//Mezun olabilir
		System.out.println(student1.getGraduateCertificate());
		headofdepartment.setGraduateCertificate(student2);
		System.out.println(student2.getGraduateCertificate());
		headofdepartment.setGraduateCertificate(student3);
		System.out.println(student3.getGraduateCertificate());
		headofdepartment.setGraduateCertificate(student4);//Mezun olamıyor

		Canteen canteen=new Canteen(2);  //Balance
		canteen.addStock(1);
		System.out.println(canteen.getStock());
		canteen.buying(student4,"kalem");//Parası var
		canteen.buying(student1,"kalem");//Stok bitti
		System.out.println(canteen.getBalance());
		System.out.println(canteen.getStock());


		Stationery stationery=new Stationery(0);//Stok alamıyor
		stationery.addStock(1);

		cleaningstaff.salary();
		System.out.println(cleaningstaff.getSalary());
		cleaningstaff.cleanClass("402");
		cleaningstaff.salary();
		System.out.println(cleaningstaff.getSalary());
		technicalStaff.salary();
		System.out.println(technicalStaff.getSalary());
		technicalStaff.fix();
		technicalStaff.salary();
		System.out.println(technicalStaff.getSalary());


	}

}
