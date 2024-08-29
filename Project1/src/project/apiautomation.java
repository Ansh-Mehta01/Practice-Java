package project;

public class apiautomation extends Automation{
	public void b3() {
		System.out.println("2nd child");
	}      
	public static void main(String[] args) {
		apiautomation a= new apiautomation();
		a.method1();
		a.b3();
	}
}
