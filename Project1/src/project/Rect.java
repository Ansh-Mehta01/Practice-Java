package project;

public class Rect {
	private int length;
	private int width;
    public Rect(int length , int width) {
	    this.length = length;
	    this.width = width;
	}
    public void area() {
		System.out.println("Area : "+length*width);
		
	}
    public static void main(String[] args) {
		Rect r = new Rect(2,3);
		r.area();
	}
}
