package programs;

import java.util.Scanner;

public class Passwordvalidation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the password to create");
		String str=sc.nextLine();
		System.out.println("your password is :::"+testpwd(str)+"  saved successfully");
		
	}
	public static String testpwd(String str)
	{  int sml=0,cap=0,dgt=0,spl=0;
		
		try{
		if(str.length()==8){
			for(int i=0;i<=str.length();i++)
			{
				if(str.charAt(i)==' ')
				{
					throw new Exception();
				}
			   if(str.charAt(i)>=65&&str.charAt(i)<=90)
			   {
				   cap++;
			   }
			   if(str.charAt(i)>=97&&str.charAt(i)<=122)
			   {
				   sml++;
			   }
			   if(str.charAt(i)>=48&&str.charAt(i)<=57)
			   {
				   dgt++;
			   }
			   else{
				   spl++;
			   }
			}
			if(cap>=1&&sml>=1&&dgt>=1&&spl>=1)
			{
				return str;
			}
			else{
		   throw new Exception();
			}
			
			
		}}
	catch(Exception e)
	{
		System.out.println("Invalid password format");
	}
	
		
	}

}
