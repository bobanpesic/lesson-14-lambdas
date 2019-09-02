package exercises;

public class Planet {
	
	private int distanceFromSun; //Average distance in millions of kilometers
	private String name;
	private double volume; // Relative to Earth which is 1.0
	private int satellites;
	
	public Planet(String name, int distanceFromSun, double volume,
			int satellites) {
		super();
		this.name = name;
		this.distanceFromSun = distanceFromSun;
		this.volume = volume;
		this.satellites = satellites;
	}
	
}