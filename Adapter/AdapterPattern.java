public class AdapterPattern{
	public static void main(String[] args) {

		ToyDuck toy1 = new PlasticToyDuck();
		toy1.squeak();

		ToyDuck toy2 = new BirdAdapter(new Sparrow());
		toy2.squeak();	

	}
}
interface ToyDuck{
	public void squeak();
}
class PlasticToyDuck implements ToyDuck{
	public void squeak(){
		System.out.println("Squeak");
	}
}
class BirdAdapter implements ToyDuck{
	Bird b;
	BirdAdapter(Bird b){
		this.b = b;
	}
	public void squeak(){
		b.makeSound();
	}
}

interface Bird{
	public void makeSound();
}
class Sparrow implements Bird{
	public void makeSound(){
		System.out.println("Chirp Chirp");
	}
}