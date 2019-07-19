package test2;

public class test28_1 {

		 double base = 5.0;
		 double height = 3.5;
		
		double getArea(){
			return (base*height)/2;
		}
		
		double getHypotenuse() {
			return Math.sqrt(base*base+height*height);
		}
		double getPerimeter() {
			return base+height+Math.sqrt(base*base+height*height);
		}
}
