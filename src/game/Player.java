package game;

public class Player {
	
	
	//player current position prop is not private
	//lazy to set getter and setter
//	it is good to make current position prop from player object private
	//so in the setter in player class we can add security check in setter method 
//	to make sure current position not greater than 3 since array room has only 4 room
//	so array wont go out of bound

	private int currentPosition;

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	
	
}
