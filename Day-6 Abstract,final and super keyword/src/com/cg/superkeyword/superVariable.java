package com.cg.superkeyword;
//Super keywords:- It is used to access parent class instance variable
class Mobile
{
	protected String name="Samsung";

}
class Samsung extends Mobile
{
	String name="Galaxy M31a";
	void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class SuperVariable  {
	
	public static void main(String[] args) {
		Samsung s=new Samsung();
		s.display();
		
	}
}

			