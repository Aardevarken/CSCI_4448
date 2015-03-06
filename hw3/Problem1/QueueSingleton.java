/** Created by Morgan Garske and Andrey Shprengel for HW3 CSCI 4448 Spring 2015 **/
import java.util.LinkedList;
public class QueueSingleton
{
	private static QueueSingleton queue;
	private static LinkedList<Submission> submissions;
	private QueueSingleton()
	{
		submissions = new LinkedList<Submission>();
	}
	public static QueueSingleton getQueueSingleton (){
	
		if( queue == null)
		{
			queue = new QueueSingleton();
		}
		return queue;
	}
	public void add(Submission s)
	{

		submissions.add(s);
	}
	public  Submission process()
	{
		if( submissions.isEmpty())
		{
			return null;
		}
		return submissions.removeFirst();
		
	}
}
