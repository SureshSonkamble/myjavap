package Serialization;

import java.io.Serializable;

public class Student implements Serializable
{
	 int id;
	 String name,address;
	
	public Student(int id, String address, String name) 
	{
		// TODO Auto-generated constructor stub
		this.id = id;
		this.address = address;
		this.name = name;
	}
}

