package com.practices25_08_23.revission;

public class person {
	static String name;
	static int age;
	
	public person(String name,int age ) {
		this.name=name;
		this.age=age;
		
	}
	public static void display()
	{
		System.out.println("Name"+ name + "age " + age);
	}
		public static void main(String args[]) {
			person person1 =new person("arun",23);
			person1.display();
		}
	
}
