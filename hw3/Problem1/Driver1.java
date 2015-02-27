import java.util.ArrayList;

public class Driver1{
	public static void main(String args[])
	{
		Submission s;
		
		for( int i = 0; i < 5; i++)
		{
			s = new Submission(); 
			System.out.println("Adding Submission with id: " + s.getId());
			Queue.add( new Submission());
		}
		for( int i = 0; i < 5; i++)
		{
			
			System.out.println( "Proccessing submission with id: " + Queue.process().getId());
		}
		
	}
}
