public abstract class Report implements Observer
{
	public Submission subject;
	public abstract void printReport();
}