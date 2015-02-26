public abstract class ReportObserver 
{
	public Submission subject;
	public abstract void update();
	public abstract void printReport();
}