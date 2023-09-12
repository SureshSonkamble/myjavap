package Strings;

public class SplitExample{  
public static void main(String args[]){  
String s1="java string split method by javatpoint";  
String[] words=s1.split("\\s");//splits the string based on whitespace  
//using java foreach loop to print elements of string array  
for(String str:words){  
System.out.println(str);  
}  
}}  