package jvaARRAYPrograms;

import java.util.HashSet;

public class FIndDuplicatesInARRAY {
	public static void main(String[] args) {
		int arr[]=new int[]{10,20,30,10,10,10,20,90};
		HashSet<Integer> hs=new HashSet();
		for(int i=0;i<arr.length-1;i++)
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j])
					hs.add(arr[i]);
				
			}
		for(int i:hs)
		{
			System.out.println("the duplicates are "+i);
		}
		
	}

}
