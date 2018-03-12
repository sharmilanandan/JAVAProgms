package jvaARRAYPrograms;

import java.util.HashMap;

public class FindRepeatingValueInARRAY {
	public static void main(String[] args) {
		int arr[]=new int[]{10,20,10,10,201,20};
		HashMap<Integer,Integer> hm=new HashMap();
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{      count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j])
				{   count++;
					hm.put(arr[i],count);
				}
				}
			}
		for(Integer i:hm.keySet())
		{System.out.print(i+" repeating ");
		System.out.println(hm.get(i)+" time");
		}
	

}}
