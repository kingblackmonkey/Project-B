package game;
import java.util.Arrays;

import fixtures.Room;


public class RoomManager {

	Room [] rooms = new Room[4];
	public void init() {
		


		
		//create a room and store in the rooms arrays which is a prop of manager
		//create directions array to pass in room constructor of Room class to store it in room directions property of room object
		int [] firstBeadroomDirections = {0,1};
	
	    Room firstBedrom = new Room("First Bedroom", "For you to sleep", "Long Description:This bedroom is big ... squarefeet blah blah blah", firstBeadroomDirections );
	    this.rooms[0]= firstBedrom;
	    
	    
	   int [] livingRoomDirections = {1,1};		
	   Room livingRoom = new Room("Living Room", "For you to chill ", "Long Description:This Living room is big ... squarefeet blah blah blah", livingRoomDirections );
	    this.rooms[1]=  livingRoom;
	    
	    int [] kitchenDirections = {1,1};		
		   Room kitchenRoom = new Room("Kitchen Room", "For you to cook ", "Long Description:This kitchen is big ... squarefeet blah blah blah", kitchenDirections );
		    this.rooms[2]=  kitchenRoom;
		    
		    
		    int [] secondBedroomDirections = {1,0};		
			   Room secondBedroom = new Room("Second  Room", "For you to sleep ", "Long Description:This kitchen is big ... squarefeet blah blah blah", secondBedroomDirections );
			    this.rooms[3]=  secondBedroom;    
		    
		    
		    
	
	}
	

//method to receive user current position and check for directions  and get the room  index in the room array
	


	public int  getARoomIndex( int currentPosition, int direction) {
	
		//get current position prop from player object from player class 
		 System.out.println("--------------"  + "\n");
//		 System.out.print(currentPosition + "\n" );
	
		//get array of directions from current room object
		int [] roomDirection = this.rooms[currentPosition].getDirections();
		


	
		
		
		//just for demonstration; this has only 2 rooms. but the program actually has 4 rooms objects in  manager rooms property
		//if not equal zero , it is way to go to the left or right 
		// [  {name: room1 ; directions: [0,1]} ; {name:living room; directions:[1,1]} ]  
		//                 ^^ index 0                              ^^ index 1
		
		
	
		
		//if first index in room directions array is 0 then no way  to go to  the left , or second index is zero then no way to go to the right

		//		to the left and no exit
		//return the first room index to show first room has no exit to the left
		//room directions[0,1] and current position is index  which is the first room in the rooms array
		if (roomDirection[0] == 0 && direction == -1 && currentPosition == 0) {
			
			 return 0;
			//			to the right and no exit
			//return the last room index to show last bed room second room has no exit to the right
			//room directions[1,0] and current position is index 3 which is the last room in the rooms array
		} else if (roomDirection[1] == 0 && direction == 1 &&  currentPosition== 3){

			 return 3;
		}
		
		//if there is exit for left and right(room directions [1,1]) , then get the next room which become the current room
		//if currentPosition is  index 0 and direction passed in is 1 which move to the right
				//will be 0 + 1 ; so currentPosition is 1 ; the return object at index 1 which is the living room.
				
		
		else {
			
			  currentPosition = currentPosition + direction;
			  
			  return   currentPosition ;
			 

		}
	
	
		
	}

	
	//method to print out to console the current room after being moved
	
	
	public void  printToConsoleAroom(int index) {
		
		switch (index) {
		case 0:
			System.out.println(this.rooms[index].getName() + "\n");
			System.out.println(this.rooms[index].getShortDescription() + "\n");
			System.out.println(this.rooms[index].getLongDescription() + "\n");
			System.out.println(" This first Bedroom does not have exit to the left " + "\n" );
			break;
		case 1:
			System.out.println(this.rooms[index].getName() + "\n");
			System.out.println(this.rooms[index].getShortDescription() + "\n");
			System.out.println(this.rooms[index].getLongDescription() + "\n");
			
			break;	
		case 2:
			System.out.println(this.rooms[index].getName() + "\n");
			System.out.println(this.rooms[index].getShortDescription() + "\n");
			System.out.println(this.rooms[index].getLongDescription() + "\n");
			break;
		case 3:
			System.out.println(this.rooms[index].getName() + "\n");
			System.out.println(this.rooms[index].getShortDescription() + "\n");
			System.out.println(this.rooms[index].getLongDescription() + "\n");
			System.out.println(" This second Bedroom does not have exit to the right. This second bedroom is the last room in this house" + "\n");
			break;
		}
		
	}


}


//String name, String shortDescription, String longDescription, Arrays directions