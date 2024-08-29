package project;

public class Seleniumautomation extends Webautomation{
      public void m1() {
		System.out.println("child class");
	}
      public static void main(String[] args) {
    	  Seleniumautomation a = new Seleniumautomation();
  		a.method1();
  		a.method();
  		a.m1();
  		a.abc=12;
  		System.out.println(a.abc);
  	}
}
