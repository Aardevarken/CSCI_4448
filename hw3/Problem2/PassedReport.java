public class PassedReport extends ReportObserver
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