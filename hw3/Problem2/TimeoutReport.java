/** Created by Morgan Garske and Andrey Shprengel for HW3 CSCI 4448 Spring 2015 **/

public class TimeoutReport extends Report
{
	private int timeoutErrors;

	public TimeoutReport(Submission subject)
	{
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update()
	{
		if (subject.wasLastErrorTimeout())
		{
			timeoutErrors ++;
		}
	}

	@Override
	public void printReport()
	{
		System.out.println( "Errors due to timeout: " + Integer.toString(timeoutErrors));
	}
}