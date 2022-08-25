// program to demonstrate fully qualified name
package com.tnsif.lesson3c;

import com.tnsif.lesson3b.Two;

public class Three {
	
	public void dispOutput()
	{
		System.out.println("I am three");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three obj = new Three();	
		obj.dispOutput();
		Two obj1 = new Two();	
		obj1.dispOutput();
	}

}

