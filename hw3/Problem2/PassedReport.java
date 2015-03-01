/** Created by Morgan Garske and Andrey Shprengel for HW3 CSCI 4448 Spring 2015 **/

public class PassedReport extends Report
{
	private int testsPassed;

	public PassedReport(Submission subject)
	{
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update()
	{
		if (subject.didLastTestPass())
		{
			testsPassed ++;
		}
	}

	@Override
	public void printReport()
	{
		System.out.println( "Tests passed: " + Integer.toString(testsPassed));
	}
}