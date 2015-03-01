/**
* Submission.java
*
* A representation of a Submission
* Modified by Morgan Garske and Andrey Shprengel for HW3 CSCI 4448 Spring 2015
*
*/

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Submission
{	
    private Random myRandom;
	private boolean lastErrorWasTimeout;

    // You may add attributes to this class if necessary
    private List<Observer> reports = new ArrayList<Observer>();
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
		update();
	}
	
    public boolean wasTimeoutError()
	{
	    return lastErrorWasTimeout;
	}

	public void attach(Observer report)
	{
		reports.add(report);
	}

	public void detatch(Observer report)
	{
		reports.remove(report);
	}

	private void update()
	{
		for (Observer report : reports)
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
