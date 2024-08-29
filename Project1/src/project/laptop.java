package project;

public class laptop {
      private String s;
      private String m;
      private int p;
      public laptop() {
		this.s = "Dell";
 		this.m = "Inspiron";
 		this.p = 45000;
	}
      public void display()
      {
    	  System.out.println("Brand : "+s);
    	  System.out.println("Model : "+m);
    	  System.out.println("Price : "+p);
      }
      public static void main(String[] args) {
		laptop lap = new laptop();
		lap.display();
	}
}
