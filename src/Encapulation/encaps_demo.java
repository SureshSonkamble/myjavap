package Encapulation;

class techkrft
{
	
	   private	int fees;
	   private String stud;
	   
	   
   public int getFees() {
	   System.out.println("Getting fees...");
		return fees;
	}
	public void setFees(int fees) {
		 System.out.println("Setting fees...");
		this.fees = fees;
	}
	public String getStud() {
		System.out.println(stud);
		return stud;
	}
	public void setStud(String stud) {
		this.stud = stud;
		System.out.println(stud);
	}

}

public class encaps_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		techkrft t=new techkrft();
		t.setFees(1200);
		//int f=t.getFees();
		System.out.println("Fees "+t.getFees());
		
		//t.setStud("suresh");
		//System.out.println(t.getStud());
		
		
		
	}

}
