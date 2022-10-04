package simple.com;

import java.util.Scanner;
class M{
	public static int removeDuplicate(int a[],int n) {
		if(n==0 && n==1	) {
			return n;
		}
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[n-1];
		for(int i=0;i<j;i++) {
			a[i]=temp[i];
		}
		return j;
	}


public class Wel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,2,2,3,3,45,45,2};
		int n=a.length;
		n=removeDuplicate(a,n);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+"      ");
		}
		
		
		
		/*
		 * String name="abhina3sh"; String revesr=""; int d = 0; for(int
		 * i=0;i<name.length();i++) { revesr=name.charAt(i) +revesr; //
		 * d=Integer.valueOf(i);
		 * 
		 * 
		 * 
		 * } System.out.println(revesr); System.out.println(d);
		 */
		/*Scanner in= new Scanner(System.in);
		String inputValue;
		String name[]= new String[6];
		int [] number=new int[6];
		String largerNmae="";
		int largerN=0;
		int as=5;
		for(int x=1;x<=as;x++) {
			inputValue=in.nextLine();
			String[] value= inputValue.split(" ");
			name[x] = value[0];
			number[x]=Integer.parseInt(value[1]);
		}
		for(int x=1;x<number.length;x++) {
			if(number[x]>largerN) {
				largerN=number[x];
				largerNmae=name[x];
			}
		}
		System.out.println("result"+largerN+"    "+largerNmae);


	
	}*/
//		for(int i=5;i>=1;i++) {
			/*
			 * for(int j=5;j>=1;j++) { System.out.print("*"); } System.out.println(); }
			 *//*
				 * 
				 * for(int i=1;i<=5;i++) { for(int j=1;j<=5;j++) { System.out.print(j); }
				 * System.out.println(); }
				 */
			/*
			 * for(int i=5;i>=1;i--) { for(int j=5;j>=1;j--) { System.out.print(j); }
			 * System.out.println(); }
			 */
/*		int n=5;
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				for(int f=1;f<=n;f++) {
					if(n%2==0) {
						System.out.print(+k);
						k++;
					}
					System.out.println();
					
				
			}*/
/*
 * int k=2; for(int i=0;i<=5;i++) { for(int j=0;j<=5;j++) {
 * System.out.printf("   %2d   ",k); k+=2; } System.out.println(); }
 */
/*
 * int k=1; for(int i=1;i<=5;i++) { for(int j=1;j<=5;j++) {
 * System.out.print(+i+"   "+j); } System.out.println();
 * 
 * }
 */
		/*for(int i=1;i<=5;i++) {
			for(int j=1;i<=5;j++) {
				System.out.printf("  %2d  ",(2*(i+j))-3);
		}
		System.out.println();
		}	
			
		
		
		
	}*/
		
	/*int n=5;
	int x;
	int y;
	for(int i=1;i<=n;i++)
	{
		x=i;
		y=n-i+1;
		for(int j=1;j<=n;j++) {
			if(j%2==0) {
				System.out.printf("   %2d  ",x);
			}
			else {
				System.out.printf("  %2d  ",y);
			}
			x=x+n;
			y=y+n;
		}
		System.out.println();*/

	
		
		
		
	}	
	}
}
