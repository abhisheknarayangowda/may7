import java.util.Collections;

public class TestSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"vijay",23));
		al.add(new Student(106,"ajay",27));
		al.add(new Student(105,"jai",21));
		Collections.sort(al);
		for(Student st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
