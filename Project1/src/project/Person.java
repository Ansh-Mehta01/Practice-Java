package project;

public class Person {
      private String v; 
      private int age;
      private String s; 
    		  
      public Person(String v , int age , String s) {
    	  this.v = v;
    	  this.age = age;
    	  this.s = s;	  
	  }
      public void display() {
	       System.out.println("Name : "+v);
	       System.out.println("Age  : "+age);
	       System.out.println("City : "+s);
      }
      public static void main(String[] args) {
		Person p = new Person("Ansh" , 20 , "Sirsa");
		p.display();
	}
}
