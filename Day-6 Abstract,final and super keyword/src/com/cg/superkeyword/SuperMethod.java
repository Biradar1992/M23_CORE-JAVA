package com.cg.superkeyword;
//super keyword:-it is used to access parent class method
class Animal
{
   public int a=10,b=20;
   public void display()
   {
	   System.out.println("the addition of a and b is: "+(a+b));
   }
}
class Tiger extends Animal
{
   public void display()
   {
	System.out.println("Tiger");
   }
   void print()
   {
	   display();
	   //accessing the parent class method using super keyword
	   super.display();
   }
}

public class SuperMethod {

	public static void main(String[] args) {
       Tiger t=new Tiger();
       t.print();

	}

}
