package seminar1;

import clase.Giraffe;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo z=new Zoo();
		Giraffe giraffe=new Giraffe("Girafa1");
		Giraffe giraffe2=new Giraffe("Girafa2");
		z.addAnimal(giraffe);
		z.addAnimal(giraffe2);
		
		z.feedAllAnimals();
	}

}
