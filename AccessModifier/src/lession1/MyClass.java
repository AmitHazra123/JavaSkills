package lession1;
import lession2.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.setName("Mark");
		System.out.println(stu.getName());
		
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		rec.set_values(10, 10);
		tri.set_values(10, 10);
		//rec.width = 10;      protected member of polygon
		System.out.println("Area of Rectangle: " + rec.area());
		System.out.println("Area of Triangle: " + tri.area());
	}
	
}
