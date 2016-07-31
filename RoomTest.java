package ObjectManipulation;

import java.util.*;

public class RoomTest 
{

	public static void main ( String []  args)
	{
		Scanner scan = new Scanner(System.in);
		
		Room room1 = new Room (2  , "Tile" , "Green");
		testValues ( room1 );
		room1.setWindows ( 5 );
		room1.setFloorType ( "Carpet" );
		room1.setWallColor ( "Purple" );
		testValues ( room1 );
		
		
		Room room2 = new Room (9  , "Carpet" , "Blue");
		testValues ( room2 );
		room2.setWindows ( 3 );
		room2.setFloorType ( "Hardwood" );
		room2.setWallColor ( "Yellow" );
		testValues ( room2 );
		
		
		Room room3 = new Room (4  , "Hardwood" , "Red");
		testValues ( room3 );
		room3.setWindows ( 0 );
		room3.setFloorType ( "Carpet" );
		room3.setWallColor ( "Black" );
		testValues ( room3 );
		
	
	scan.close();	
	}//end method main

	public static void testValues ( Room room )
	{
		System.out.printf ( "Number of windows: %d \n" , room.getWindows() );
		
		System.out.printf ( "Floor Type: %s \n" ,  room.getFloorType() );
		
		System.out.printf ( "Wall Color : %s \n \n" , room.getWallColor() );
		
		
		
	}//end method test values
}
