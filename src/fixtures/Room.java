package fixtures;



public class  Room extends Fixture{

	 private int [] directions;

	public Room(String name, String shortDescription, String longDescription, int [] directions) {
		super(name, shortDescription, longDescription);
		this.directions = directions;
	}

	public int[] getDirections() {
		return directions;
	}

	public void setDirections(int[] directions) {
		this.directions = directions;
	}


	
	
	

}
