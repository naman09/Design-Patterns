class FacadePattern{
	public static void main(String[] args) {
		ShapeMaker s = new ShapeMaker();
		s.drawCircle();
		s.drawRectangle();
		s.drawSquare();		
	}
}
interface Shape{
	void draw();
}
class Circle implements Shape{
	public void draw(){
		System.out.println("A circle is drawn");
	}
}
class Rectangle implements Shape{
	public void draw(){
		System.out.println("A rectangle is drawn");
	}
}
class Square implements Shape{
	public void draw(){
		System.out.println("A square is drawn");
	}
}

class ShapeMaker{
	Shape circle;
	Shape rectangle;
	Shape square;

	ShapeMaker(){
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	void drawCircle(){
		circle.draw();
	}
	void drawRectangle(){
		rectangle.draw();
	}
	void drawSquare(){
		square.draw();
	}
}