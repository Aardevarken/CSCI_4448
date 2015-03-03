/** Created by Morgan Garske and Andrey Shprengel for HW3 CSCI 4448 Spring 2015 **/

public abstract class Report implements Observer
{
	public Submission subject;
	public abstract void printReport();
}