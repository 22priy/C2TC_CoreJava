// program to demonstrate import package.classname;
package com.tnsif.lesson3a;
import com.tnsif.lesson3b.Two;
import com.tnsif.lesson3c.Three;

public class One {
	
	public void dispOutput()
	{
		System.out.println("I am One");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One obj = new One();	
		obj.dispOutput();
		Three obj1 = new Three();	
		obj1.dispOutput();
		Two obj2 = new Two();	
		obj2.dispOutput();
	}

}


