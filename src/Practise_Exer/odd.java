package Practise_Exer;

public class odd {

	public static void main(String[] args) {
		
		String s="100";  
		//Converting String into int using Integer.parseInt()  
		int i=Integer.parseInt(s);  
		//Printing value of i  
		System.out.println(i);  
		
		int i1=Integer.valueOf(s);  
		System.out.println(i1); 
	
		int i3=200;  
		String s1=String.valueOf(i3);  
		System.out.println(s1);
		
		int i4=300;  
		String s2=Integer.toString(i4);  
		System.out.println(s2);
}}
