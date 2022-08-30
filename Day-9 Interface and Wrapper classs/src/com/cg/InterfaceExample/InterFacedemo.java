package com.cg.InterfaceExample;

interface A
{
	void print();
	void display();
	
}
class B implements A
{
	public void print() {
		System.out.println("Technosereve India Foundation");
		
	}
	
	public void display() {
		System.out.println("Java Full Stack");
		
	}
}
public class Interfacedemo {

	public static void main(String[] args) {
		B b=new B();
        b.print();
        b.display();
	}

}