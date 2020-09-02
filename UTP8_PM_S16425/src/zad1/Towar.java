package zad1;


public class Towar {
	
	private String id;
	private double waga;
	
	public Towar(String id, double waga) {
		this.id = id;
		this.waga = waga;
	}

	public String getId() {
		return id;
	}

	public double getWaga() {
		return waga;
	}
}