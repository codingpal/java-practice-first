package src.com.mycompany.coding.practice.inheritanceMultipleLevel;

public class Parent extends GrandParent {
	
    int a=5;
	public void home()
	{
		System.out.println(super.a);
		System.out.println("Home is running");
	}
	public void bike()
	{
		System.out.println("Bike is running");
	}
	
	public void car()
	{
		System.out.println("Car is running");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		Parent p = new Parent();
		p.home();
		p.bike();
		p.car();
	}
}
