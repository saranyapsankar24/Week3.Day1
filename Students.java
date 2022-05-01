package week3.day1;

public class Students {
public int getStudentInfo(int id) {
	return id;
	
}
public void getStudentInfo(int id, String name) {
	System.out.println("Id is " + id);
	System.out.println("Name is " + name);
	
}
public void getStudentInfo(String email, long phoneNumber) {
	System.out.println("Email is " + email);
	System.out.println("Phone Number is " + phoneNumber);
}
public static void main(String[] args) {
	Students st=new Students();
	int studentID = st.getStudentInfo(1);
	System.out.println("Student ID is " + studentID);
	st.getStudentInfo(1, "Saranya");
	st.getStudentInfo("Test@123.com", 9840301801L);
	
}
}
