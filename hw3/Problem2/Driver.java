

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

		passed.printReport();
		timeout.printReport();
	}
}