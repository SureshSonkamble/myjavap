package Strings;

public class Split_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "05-01-2022";
		String[] arr = s.split("-");    
         String dt=arr[0];
         String mnt=arr[1];
         String yr=arr[2];
         System.out.println("Date "+dt);
         System.out.println("Month "+mnt);
         System.out.println("Year "+yr);
		for ( String ss : arr) {
		    System.out.println(ss);
		}
	}

}
