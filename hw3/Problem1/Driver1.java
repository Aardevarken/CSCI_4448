import java.util.ArrayList;

public class Driver1{
	public static void main(String args[])
	{
		Submission s;
		QueueSingleton queue1 = QueueSingleton.getQueueSingleton();
		QueueSingleton queue2 = QueueSingleton.getQueueSingleton();
		
		for( int i = 0; i < 3; i++)
		{
			s = new Submission(); 
			System.out.println("Adding Submission with id: " + s.getId() + " from queue1");
			queue1.add( s);
			s = new Submission(); 
			System.out.println("Adding Submission with id: " + s.getId() + " from queue2");
			queue2.add( s);
			
		}
		for( int i = 0; i < 6; i++)
		{
			
			System.out.println( "Proccessing submission with id: " + queue1.process().getId());
		}
		
	}
}
