package com.techelevator;

public class HomeworkAssignment
{
	/* Data member are
	 * earnedMarks - int
	 * possibleMarks - int
	 * submitterName - String
	 * letterGrade -String
	 */
	
	
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;

	
	public HomeworkAssignment(int possibleMarks)
	{
		this.possibleMarks = possibleMarks;
	}

	public int getEarnedMarks() 
	{
		return earnedMarks;
	}

	public void setEarnedMarks(int earnedMarks) 
	{
		this.earnedMarks = earnedMarks;
	}

	public int getPossibleMarks() 
	{
		return possibleMarks;
	}	

	public String getSubmitterName() 
	{
		return submitterName;
	}

	public void setSubmitterName(String submitterName) 
	{
		this.submitterName = submitterName;
	}

	public String getLetterGrade() 
	{
		double grade = ((double) earnedMarks/possibleMarks) * 100;
		
		String gradeGiven = "";
		
		if(grade >= 90)
			{
			gradeGiven = gradeGiven + "A";
			}else if(grade >=80 && grade <90)
				{
				gradeGiven = gradeGiven + "B";
				}else if(grade >= 70 && grade <80)
					{
					gradeGiven = gradeGiven + "C";
					}else if(grade >=60 && grade <70)
						{
						gradeGiven = gradeGiven + "D";
						}else
							{
							gradeGiven = gradeGiven + "F";
							}	
	return gradeGiven;
	}
}
