// introduce methods with return type, use of return statement
// introduce constructor, its name is same class name
// Constructor automatically invoked
// introduce static, this and final keywords
// this is a keyword, which gives the reference of current object
// final can be used with class as well as with variable
// if it is used with variable, then it acts as constant
// if it is used with class then the class can't be inherit

import java.util.Scanner;

class BOX {

	double width;
	double height;
	double depth;

	BOX() {
		width=0;
		height=0;
		depth=0;
	}

	BOX(double width, double height, double depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}

	void setData(double w, double h, double d) {
		width=w;
		height=h;
		depth=d;
	}

	void showData() {
		System.out.print("\nThe width = " + width);
		System.out.print("\nThe height = " + height);
		System.out.print("\nThe depth = " + depth);
		System.out.println("\n--------------------");
	}

	double volume() {
		return width*height*depth; //return statement transfer controll
					   // and transfer computed result
	}
}


class Demo5 {

	public static void main(String arg[]) {
		
		final int b=10;		
	
		BOX b1 = new BOX(); //b1 is instantiated
		BOX b2 = new BOX();
		BOX b3 = new BOX(50,50,50);

		b1.setData(20,20,30);		//these are arguments
		System.out.print("\nThe volume = " + b1.volume());
		b1.showData();

		b2.setData(40,40,40);		//these are arguments
		System.out.print("\nThe volume = " + b2.volume());
		b2.showData();

		System.out.print("\n\nThe volume = " + b3.volume());
		b3.showData();
		
		//System.out.print("\nb = " + b++);
	}

}

