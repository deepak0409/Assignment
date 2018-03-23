package com.bonzai.assigment;

public class MaximunActivityProblem {

	    public static void main(String[] args)
	    {
	    int startingTime[] =  {1, 3, 0, 5, 8, 5};
	    int finishingTime[] =  {2, 4, 6, 7, 9, 9};
	    int count=0;
        for (int i = 0; i < startingTime.length; i++) {
        	if(i==startingTime.length-1)
        		break;
        	count++;
	        for (int j = i+1; j < startingTime.length; j++)
		    {
		         if (startingTime[j] >= finishingTime[i])
		         {
		        	 count++;
		              i = j;
		          }
		     }
		}
	        System.out.println("Maximun activities which can be performed are: "+count);
	    }

}
