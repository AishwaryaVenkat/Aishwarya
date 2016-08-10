import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		int i,j ,temp=1;
		int a[]=new int[5];
		System.out.println("enter 5 values between 10 and 100:");
		Scanner in=new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			if(temp<=5)
			{
			    System.out.printf("\n enter %d value"+temp);
			    temp++;
				int x=in.nextInt();
				System.out.println("\n After the elimation of duplicate value:");
				int count=0;
				for(j=0;j<1;j++)
				{
					if(x==a[j])
					{
						count++;
						break;
					}
				}
				if(count==0)
				{
					a[i]=x;
					for(int k=0;k<=i;k++)
					{System.out.println(" "+a[k]);
				}
				}
					else
					{
						i--;
					   for(int k=0;k<=i;k++)
					{
						   System.out.println(" "+a[k]);
					}
			        }
			}
					else
						break;
	      }
		}

	}
