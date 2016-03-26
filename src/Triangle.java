
public class Triangle extends Shape {
	private int base;
	private int height;
	Triangle(String aName){
		super(aName);
		base = 3;
		height = 4;
	}
	
	public float calculateArea(){
		float area;
		area = (base * height)/2;
		return area;
	}
}
