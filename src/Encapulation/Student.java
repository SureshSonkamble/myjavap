package Encapulation;

public class Student{  
private String name;
private Integer id;
   
public String getName(){  
return name;  
}  

public int getId()
{
	return id;
}

public void setName(String name){  
	if(name.length()!=6)
	{
		System.out.println("name length should be gerter than 6");
	}
	else
	{
		this.name=name;  
	}
}  

public void setId(int id){ 
	if(id>100){
		this.id=id;	
	}
	else{
		System.out.println("Id should be grater than 100");
	}
}  
}  