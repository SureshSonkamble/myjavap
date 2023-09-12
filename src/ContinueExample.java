public class ContinueExample {  
public static void main(String[] args) {  
    for(int i=1;i<=10;i++){  
        if(i==5){  
        	 System.out.println("Match found at: "+i);  
            continue;  
        }  
        System.out.println(i);  
    }  
}  
}  