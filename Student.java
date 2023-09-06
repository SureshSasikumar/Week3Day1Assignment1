package week3.day1.assignment2;

public class Student extends Department {

	public void studentName() {
		System.out.println("Suresh");
		
		
	}
	public void studentDept() {
		System.out.println("ECE");
		
	}
	
    public void studentId() {
    	System.out.println("ID:10286");
		
	}
    
    
   public static void main(String[] args) {
	Student st = new Student();
	st.studentName();
	st.studentDept();
	st.studentId();
	st.deptName();
	st.collegeName();
	st.collegeCode();
	st.collegeRank();
}
}
