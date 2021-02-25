package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper ingrijitor;
	private List<Animal> animale;
	public Zoo(Zookeeper ingrijitor, List<Animal> animale) {
		super();
		this.ingrijitor = ingrijitor;
		this.animale = animale;
	}
	
	public Zoo() {
		super();
		this.ingrijitor=new Zookeeper("GIGI");
		this.animale=new ArrayList<>();
		
	}
	public void addAnimal(Animal a) {
		animale.add(a);
	}
	public void feedAllAnimals() {
		for(Animal a:animale) {
			ingrijitor.feed(a);
		}
		
	}
	
}
