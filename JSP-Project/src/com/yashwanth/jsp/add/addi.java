package com.yashwanth.jsp.add;

public class addi {

	public static String name;
	public static String Dept ;

	

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.Dept = dept;
	}
	
	public static  String  print(String name, String dept) {
		
		return ("name  : " + name + " Department : " + dept);
		
	}


	public static void main(String args[]) {

	addi ad = new addi();
		ad.print(name, Dept);
		

	}

}
