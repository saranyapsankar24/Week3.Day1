package week3.day1;

public class Automation implements Language,TestTool{
	private int number;
	private String name;
	public void java() {
		System.out.println("Language is Java");
	}
	public void selenium() {
		System.out.println("Automation tool is Selenium");
	}
	public String getName(String name) {
		return name;
		
	}
public Automation(String name, int number) {
		this.name=name;
		this.number=number;
		System.out.println("Name is " + name + " and number is " + number  );
		
	}
	public static void main(String[] args) {
		Automation auto=new Automation("Test Name",123);
		auto.java();
		auto.selenium();
		System.out.println("Id is " + id);
		
		
	}
	
	
}

