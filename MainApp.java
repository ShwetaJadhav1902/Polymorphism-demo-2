package com.polymorphism1;

public class MainApp {
	public static void main(String[] args) {
		Manager mgr=new Manager(123,"Shweta",45000,5460,450,4500);
		mgr.printInfo();
		System.out.println("==================================================================================");
		
		Salexe s=new Salexe(126,"Aishwarya",50000,4532,534,2345);
		s.printInfo();
		
         System.out.println("==================================================================================");
		
		Developer d=new Developer(122,"Nikita",50000,4532,534,2345);
		d.printInfo();
		
		
	}
	

}
