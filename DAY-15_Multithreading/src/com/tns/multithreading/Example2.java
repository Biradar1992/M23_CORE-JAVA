package com.tns.multithreading;
class Test
{
    public static synchronized void display()
    {
    	System.out.println("Current Thread " + Thread . currentThread[])
    	for(int i=0;i < 5 ; i++)
    	{
    		System.out.println(Thread.currentThread(),getname() + "i - " +
    	    try
    		{
    	    	Thread.sleep(50);
    		}
    		catch (InterruptedException e)
    		{
    			e.printStackTrace();
    		}
    	}
    }
}
class Value of implements Runnable{
	Thread t;
	Test val;
	Value of (Test val)
	{
		this.val = val;
		t = new Thread(this);
		t.statrt();
	}
	public void run()
	{
		val.display();
	}
}
public class Example2{
	public static void main(String[] args) {
		Test obj1 = new Test();
		Test obj2 = new Test();
		Valueof t1 = new valueof(obj1);
		Valueof t2 = new valueof(obj2);
	}
}	
	}
}