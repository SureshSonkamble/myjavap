package Strings;

public class IndexOfExample{  
public static void main(String args[]){  
String s1="this   is index of example";  
//passing substring  
int index1=s1.indexOf("s");//returns the index of is substring  

int index2=s1.indexOf("in");//returns the index of index substring  
System.out.println(index1+"    "+index2);//2 8  
  
}}  