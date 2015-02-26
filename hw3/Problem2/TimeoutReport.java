public class TimeoutReport extends ReportObserver
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