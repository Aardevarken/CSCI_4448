/**
* Submission.java
*
* A representation of a Submission
*/

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Submission
{	
    private Random myRandom;
	private boolean lastErrorWasTimeout;

    // You may add attributes to this class if necessary
    private List<ReportObserver> reports = new ArrayList<ReportObserver>();
    private boolean lastTestPassed;

	public Submission()
	{
	    myRandom = new Random();
		lastErrorWasTimeout = false;
		lastTestPassed = false;
	}

    public void runTestCase()
	{
	    // For now, randomly pass or fail, possibly due to a timeout
		boolean passed = myRandom.nextBoolean();
		if(!passed)
		{
		    lastErrorWasTimeout = myRandom.nextBoolean();
		}
		
		// You can add to the end of this method for reporting purposes
		lastTestPassed = passed;
		updateReports();
	}
	
    public boolean wasTimeoutError()
	{
	    return lastErrorWasTimeout;
	}

	public void attach(ReportObserver report)
	{
		reports.add(report);
	}

	private void updateReports()
	{
		for (ReportObserver report : reports)
		{
			report.update();
		}
	}

	public boolean wasLastErrorTimeout()
	{
		return lastErrorWasTimeout;
	}

	public boolean didLastTestPass()
	{
		return lastTestPassed;
	}
}
