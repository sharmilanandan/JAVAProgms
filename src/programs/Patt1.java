package programs;

public class Patt1 {
	public static void main(String[] args) {
		int val=1,n=4;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
					System.out.print(val--);
				System.out.println();
				if(i!=4)
				{val++;
				 val=val+val*2;
				}
			
		}
			System.out.println("hi");
	}

}
