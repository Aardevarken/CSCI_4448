/** Created by Morgan Garske and Andrey Shprengel for HW3 CSCI 4448 Spring 2015 **/

import java.util.LinkedList;
public class Queue
{
	private static Queue queue;
	private static LinkedList<Submission> submissions;
	private Queue()
	{
		submissions = new LinkedList<Submission>();
	}
	public static void add(Submission s)
	{
		if( queue == null)
		{
			queue = new Queue();
		}
		submissions.add(s);
	}
	public static Submission process()
	{
		if( queue == null || submissions.isEmpty())
		{
			return null;
		}
		return submissions.removeFirst();
		
	}

		
		
	}
