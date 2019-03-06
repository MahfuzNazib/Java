import java.lang.*;

public class ArrayStudent
{
	Student s[] = new Student[5];

	//insert function

	public void insertStudent(Student st)
	{
		for(int i=0; i<s.length; i++)
		{
			if(s[i] == null)
			{
				s[i] = st;
				break;
			}
		}

		
	}

	//remove function

	public void removeStudent(Student st)
	{
		

		for(int i=0; i<s.length;i++)
		{
			if(s[i] == st)
			{
				s[i] = null;
				break;
			}
		}
	}

		public void showDetails()
		{
			for(Student st : s)

			{
				if(st != null)
				{
					System.out.println("Student Name : "+st.getName());
					System.out.println("Student CGPA : "+st.getCgpa());
					System.out.println("Semester No  : "+st.getSemesterNo());
					System.out.println("----------------------------------");
				}
			}
		}

	public static void main(String[] args) {
		
	
		ArrayStudent as = new ArrayStudent();

		Student s1 = new Student("Nazib",3.74,7);
		Student s2 = new Student("Mahfuz",3.25,6);
		Student s3 = new Student("Hasib",3.10,7);
		Student s4 = new Student("Naim",2.90,3);
		Student s5 = new Student("Bristy",3.10,4);

		
		as.insertStudent(s1);
		
		as.insertStudent(s5);
		as.insertStudent(s2);
		as.showDetails();
		System.out.println("_______________");
		as.removeStudent(s5);
		as.showDetails();
		

	}
}