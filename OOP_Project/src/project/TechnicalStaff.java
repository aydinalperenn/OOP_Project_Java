package project;

public class TechnicalStaff extends Staff {
	 private boolean isBroken=false;//A variable to show something is broken or not.
	 private int bonus;//A variable for their bonus money.
	 public TechnicalStaff(int id_, String name_, String surname_, int workinghours, String taskinformation, String worktype,String graduatedschool) {
		 super(id_, name_, surname_, workinghours, taskinformation, worktype,graduatedschool);
	 } // End of Constructor of TechnicalStaff
	 //Ekstra metot
	 public void fix()//A method to get bonus money for a technical staff.They get money when they fix something is broken.
	 {
		 setBroken(true);
		 System.out.println("The broken thing is fixed.");
		 bonus();
	 }
	 public void bonus()//To calculate their bonus money when they fix broken things.
	 {
		 bonus+=100;
	 }
	 public void salary()//To calculate their salary.
	 {
		 setSalary(getWorkinghours()*70+bonus);
	 }
	 //Getters and setters
	public boolean isBroken() {
		return isBroken;
	}
	public void setBroken(boolean isBroken) {
		this.isBroken = isBroken;
	} 
}
