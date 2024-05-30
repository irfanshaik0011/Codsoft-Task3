import java.util.*;
public class stud_grade{
	public static void main(String[] args) {
	int maths,java,python,dsa,dm,avg;
	int sum;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the marks of student out of 100 ");
	System.out.println("Maths ");
	maths=s.nextInt();
	System.out.println("Java ");
	java=s.nextInt();
	System.out.println("Python ");
	python=s.nextInt();
	System.out.println("DSA");
	dsa=s.nextInt();
	System.out.println("DM");
	dm=s.nextInt();
	sum=maths+java+python+dsa+dm;
	System.out.println("Sum of  marks obtained is "+sum);
avg=(maths+java+python+dsa+dm)/5;
System.out.println("Average marks is "+avg);
if(avg>=90)
 System.out.println("A grade ");
 else if  (avg >=80 && avg <90)
System.out.println("B grade ");
else if  (avg >=70 && avg <80)
System.out.println("C grade ");
else if  (avg >=60 && avg <70)
System.out.println("D grade ");
else if  (avg >=50 && avg <60)
System.out.println("E grade ");
else if  (avg >=40 && avg <50)
System.out.println("F grade ");
else   
System.out.println("Fail ");
	
		s.close();

	}
	
}