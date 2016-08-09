import java.util.Scanner;
public class Dates {
      int month;
      int day;
      int year;
	public Dates()
	{
		month=0;
		day=0;
		year=0;
	}
	public void setMonth(int a)
	{
		this.month=a;
	}
	public void setDay(int b)
	{
		this.day=b;
	}
	public void setYear(int c)
	{
	    this.year=c;	
	}
	Scanner i=new Scanner(System.in);
	public void getMonth()
	{
		int m=i.nextInt();
		setMonth(m);
		
	}
	public void getDay()
	{
		int d=i.nextInt();
		setDay(d);
	}
	public void getYear()
	{
		int y=i.nextInt();
		setYear(y);
	}
	public void displayDate()
	{
		System.out.print("Date in<mm/dd/yy> format:"+month+"/"+day+"/"+year);
	}
	public static void main(String[] args) 
	{
	       Dates s=new Dates();
	       System.out.println("enter the month:");
	       s.getMonth();
	       System.out.println();
	       System.out.println("enter the day:");
	       s.getDay();
	       System.out.println();
	       System.out.println();
	       System.out.println("enter the year:");
	       s.getYear();
	       System.out.println();
	       s.displayDate();
	
	
	
	}

}
