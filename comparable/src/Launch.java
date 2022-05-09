import java.util.ArrayList;
import java.util.Collections;

public class Cricketer implements Comparable
{
	String name;
	int runs;
	float avg;
	public Cricketer(String name,int runs,float avg)
	{
		this.name=name;
		this.runs=runs;
		this.avg=avg;
	}
	public String getName()
	{
	return name;	
	}
	public int getRuns()
	{
		return runs;
	}
	public float getAvg()
	{
		return avg;
	}
	public String toString()
	{
		return name + " "+runs+" "+avg;
	}
	public int CompareTo(Object y)
	{
		if (this.runs>((Cricketer)(y)).runs)
		{
			return 1;
			
		}
		else
		{
			return-1;
		}
	}
	
	
}
	
	
	
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cricketer c1=new Cricketer("rohit",264,48.7f);
Cricketer c2=new Cricketer("rahul",101,35.2f);
Cricketer c3=new Cricketer("virat",180,55.9f);
ArrayList al=new ArrayList();
al.add(c1);
al.add(c2);
al.add(c3);
System.out.println(al);
Collections.sort(al);
System.out.println(al);
	}

}
/* Though in the above program sorting has been achieved it would not always work . if in our 
project the cricketer class was only accessible but not open for modification then the above
approach fails */
