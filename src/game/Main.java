package game;
import java.util.*;


public class Main {


	
	  public static void main(String [] args) {
		int direction = 0;
		int index ;
	 @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
		  

	  
	  //collect input
	  //try catch block is to handle when user input a string. we will throw exeption message
	 //force user to enter integer not string
	  
	  try {
	 	  RoomManager manager = new  RoomManager();
	 	  //create array rooms and set each room in the room array in manager.rooms property 
		  manager.init();	
//	set current position for player to index 1; which is the living room  
	  	  	Player player = new Player();
			player.setCurrentPosition(1);
	  
		while(direction != 3 && direction < 4) {
	   

		
//			System.out.print(player.getCurrentPosition());
	  	System.out.print("This house has 4 rooms; first room is first bedroom, second room is living room, third room is kitchen room, last room is second bedroom" + "\n" );
	  	  System.out.print("Please Choose Directions.You can only choose two directions left and right. You are currently in the " + manager.rooms[player.getCurrentPosition()].getName()   + "\n" );
		  System.out.print("1. Left, 2.Right, 3. Quit Game " + "\n");
	  		
		  direction = in.nextInt();
		  
	
		  //manager create rooms and store in array of room objects
		  //and set current position for player object from player class to 1 which is the kitchen
	
			
		  //get a room index based on user input	  
		//direction	
	
			
	

	
		 
			
			switch ( direction) {
//			handle the left direction
			case 1:
				index =   manager.getARoomIndex(player.getCurrentPosition(),-1 );
				 //update current position (index) prop in player object from player class 
				 player.setCurrentPosition(index);
     			 manager.printToConsoleAroom(player.getCurrentPosition());
//				 System.out.println("--------------"  + "\n");
//				 System.out.print(index + "\n" );
		
				break;
				
				
			case 2:
//				handle the right direction
       			 index =	manager.getARoomIndex( player.getCurrentPosition(), 1 );
       			 player.setCurrentPosition(index);
				 manager.printToConsoleAroom(player.getCurrentPosition());
				
				index =   manager.getARoomIndex(index,1 );
//				 System.out.println("--------------"  + "\n");
//				 System.out.print(index + "\n" );
		
				break;
				
			case 3:
				System.out.println("Bye Bye " + "\n");
				break;
			default:
				System.out.println("Dude choose option 1 to 3 only; So mad, program quit " + "\n");
				break;
			}	

		  	
	  	}
	  	
	  	
	  	 
//	  must set current position in player class
	  	  
	  	  
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Invalid input you make me mad dude. You can only put number. Program quit!!!");
		
	}
	 
		  

	  }








	

		  
		  
		  
	   
}

