package Array;

class Testarray2
{  
	
static void min(int arr[]){  

int min=arr[0];  
System.out.println(min);  
for(int i=1;i<arr.length;i++)  
 if(min>arr[i]) 
 {
	 System.out.println("in loop"+min);  
  min=arr[i];  
 }
System.out.println(min);  
}  
  
public static void main(String args[]){  
  
int a[]={22,3,4,1,55};  
min(a);//passing array to method  
  
}}  