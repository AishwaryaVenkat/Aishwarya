import java.util.Scanner;
public class Employee {

	String firstName;
	String lastName;
	double salary;
	public Employee()
	{
		firstName="\0";
		lastName="\0";
		salary=0.0;
		}
	public void setFirst(String a)
	{
		this.firstName=a;
	}
	public void setLast(String b)
	{
		this.lastName=b;
	}
	public void setSalary(double c)
	{
		if(c>0.0)
			this.salary=c;
		}
	public String getFirst()
	{
		return firstName;
	}
	public String getLast()
	{
		return lastName;
	}
	public double getSalary()
	{
		return salary;
	}
	public double annualIncome()
	{
		return(salary*12);
	}
	public double increase()
	{
		double a=((double)0.1)*(salary*12);
		return(a+salary*12);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner i=new Scanner(System.in);
       
       Employee e=new Employee();
       Employee e1=new Employee();
       System.out.println("\n enter first employee's details: ");
       System.out.println("first name:");
       String s1=i.nextLine();
       e.setFirst(s1);
       System.out.println("lastname:");
       String s2=i.nextLine();
       e.setLast(s2);
       System.out.println("monthly income:");
       double s3=i.nextDouble();
       e.setSalary(s3);
       Scanner i1=new  Scanner(System.in);
       System.out.println("\n Enter second employee's detail:");
       System.out.println("first name:");
       String t1=i1.nextLine();
       e1.setFirst(t1);
       System.out.println("lastname:");
       String t2=i1.nextLine();
       e1.setLast(t2);
       System.out.println("monthly income:");
       double t3=i1.nextDouble();
       e1.setSalary(t3);
       System.out.println("\n details of employee 1:");
       System.out.println("first anme:"+e.getFirst()+"\n last name:"+e.getLast()+"\n monthly salary:"+e.getSalary());
       System.out.println("\n income for one year:"+e.annualIncome()+"\nafter 10%increase:"+e.increase());
       System.out.println("\n details of employee 2:");
       System.out.println("first name:"+e1.getFirst()+"\n last name:"+e1.getLast()+"\n monthly salary:"+e1.getSalary());
       System.out.println("\n income for one year:"+e1.annualIncome()+"\nafter 10%increase:"+e1.increase());
	}
}	


