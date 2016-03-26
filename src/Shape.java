
public class Shape {
		private String name;
		Shape (String aName) {name=aName;}
		public String getName(){return name;}
		public float calculateArea() {return 0.0f;}
		
		public static void main(String argv[]){
			Circle c = new Circle("Circle C");
			Square s = new Square ("Square S");
			Shape shapeArray[] = {c,s};
			for(int i =0; i<shapeArray.length; i++){
				System.out.println("The area of " + shapeArray[i].getName()
						+ " is " + shapeArray[i].calculateArea() + " cm^2\n");
			}
		}
	}

