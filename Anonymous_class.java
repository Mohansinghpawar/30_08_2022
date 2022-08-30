public class Polygon {
	public static void main(String[] args) {
	       AnonymousDemo an = new AnonymousDemo();
	       an.createClass();   
	}
}
class Polygon1 {
	   public void display() {
	      System.out.println("Inside the Polygon class");
	   }
	}

	class AnonymousDemo {
	   public void createClass() {

	      // creation of anonymous class extending class Polygon
	      Polygon p1 = new Polygon() {
	         public void display() {
	            System.out.println("Inside an anonymous class.");
	         }
	      };
	   }
	}
