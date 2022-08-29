package com.cg.array;
class Student
{
	public int roll_no;
	public String name;
	//constructor
	Student(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
}

public class StudentClass {

	public static void main(String[] args) {
		Student[] arr=new Student[3];
		arr[0]=new Student(101, "Yogesh");
		arr[1]=new Student(101, "Hariom");
		arr[2]=new Student(101, "Satish");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at " +" index: "+arr[i].roll_no+" "+arr[i].name);
			
		}
		

	}

}