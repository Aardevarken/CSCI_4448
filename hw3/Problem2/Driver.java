/** Created by Morgan Garske and Andrey Shprengel for HW3 CSCI 4448 Spring 2015 **/

class Driver
{
	public static void main(String[] args)
	{
		Submission sub = new Submission();

		PassedReport passed = new PassedReport(sub);
		TimeoutReport timeout = new TimeoutReport(sub);

		for (int i = 0; i < 5; i++)
		{
			System.out.println("Running test " + Integer.toString(i));
			sub.runTestCase();
			System.out.println("\tTest passed: " + Boolean.toString(sub.didLastTestPass()));
			System.out.println("\tError timeout: " + Boolean.toString(sub.wasLastErrorTimeout()));
		}
		System.out.println("Printing reports...");
		System.out.println("From PassedReport:");
		passed.printReport();
		System.out.println("From TimeoutReport:");
		timeout.printReport();
	}
}