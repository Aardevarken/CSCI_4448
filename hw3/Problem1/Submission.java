/**
* Submission.java
*
* A basic dummy Submission object for use with the auto-grader
* Modified by Morgan Garske and Andrey Shprengel for HW3 CSCI 4448 Spring 2015 
*
*/

import java.util.Random;

public class Submission
{
    private static Random rand = new Random();
    private int id;

    public Submission()
    {
        // Give this submission a unique(ish) id
        id = rand.nextInt(10000000);
    }
    public int getId()
    {
		return this.id;
	}
}
