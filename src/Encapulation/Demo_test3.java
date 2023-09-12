package Encapulation;


class employee
{
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		System.out.println("Id set by user...");
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	//getter and setter methods//Right click->source->generate getter and setter->selecte variable and ok
	

}
public class Demo_test3 {

	public static void main(String[] args) {
		
		employee emp=new employee();
		emp.setEmpid(1);
		emp.setEmpname("Suresh");
		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getEmpname());
	}

}
