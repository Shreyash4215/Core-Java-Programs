import java.util.*;
class Student
{    
	String name;	
	double perc;   
	
	Student(String name, double perc)
    {   
		this.name = name; 	
		this.perc = perc;
	}    
	
	public String toString()
    {   
		return "Nm = " + name + " & " + perc;
	}
}

class CompareByPerc implements Comparator
{   
	public int compare(Object obj1, Object obj2)
    {   
		Student o1 = (Student)obj1;       
		Student o2 = (Student)obj2;
		
		if (o1.perc == o2.perc)
		return 0;
        if (o1.perc < o2.perc)
		return 1;
		
        return -1;
	}
}

public class ComparatorDemo
{   
	public static void main(String[] args)
    {   
		ArrayList a = new ArrayList();
        a.add(new Student("A",76.2));
        a.add(new Student("B",96.5));
        a.add(new Student("C",81.7));
        a.add(new Student("D",62.1));
        System.out.println("Before Sorting : " + a);
        Collections.sort(a,new CompareByPerc());
        System.out.println("After Sorting : " + a);
	}
}
