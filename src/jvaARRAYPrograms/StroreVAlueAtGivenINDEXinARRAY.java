package jvaARRAYPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class StroreVAlueAtGivenINDEXinARRAY {
	public static void main(String[] args) {
		{
			int arr[]=new int[]{10,20,30};
			System.out.println(Arrays.toString(arr)+" existing array");
			System.out.println("size of existing array "+arr.length);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value to insert");
			int val=sc.nextInt();
			System.out.println("enter the index where to insert the value");
			int index=sc.nextInt();
			int insert[]=new int[arr.length+1];
			try{
				if(index<insert.length){
			for(int i=0;i<insert.length;i++)
			{
				if(i==index)
					insert[i]=val;
				else if(i<index)
					insert[i]=arr[i];
				else 
					insert[i]=arr[i-1];
				
					//throw new Exception();
			}
			System.out.println(Arrays.toString(insert));
				}
				else
					throw new Exception();
			}
			catch(Exception e){
				System.out.println("enter valid index");
				e.printStackTrace();
			}
			
		}
	}
	

}
