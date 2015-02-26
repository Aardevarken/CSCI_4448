import java.util.ArrayList;

public class Driver1{
	public static void main(String args[])
	{
		
		for( int i = 0; i < 5; i++)
		{
			
			Queue.add( new Submission());
		}
		for( int i = 0; i < 5; i++)
		{
			
			System.out.println(Queue.process().getId());
		}
		
	}
}
