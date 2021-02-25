package clase;

public class Zookeeper {
 private String nune;

public String getNune() {
	return nune;
}

public void setNune(String nune) {
	this.nune = nune;
}

public Zookeeper(String nune) {
	super();
	this.nune = nune;
}
 
 public void feed(Animal a) {
	 System.out.println(nune+" feeds the animal "+a.getName());
 }
}
