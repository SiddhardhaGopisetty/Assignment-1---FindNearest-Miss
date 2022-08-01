/*
 * SE-Assignment 1: Looking for Fermat's Last Theorem, Find Near Miss
 * No external file
 * No external Libraries
 * 
 * Group member: Sai Siddhardha Gopisetty and Sai Sandeep Gaddipati
 * 
 * Group Member Email Address: SaiSiddhardhaGopis@lewisu.edu, Saisandeepgaddipat@lewisu.edu
 * 
 * Course: SU22-CPSC-60500-002
 * 
 * 
 * 
 */
import java.util.Scanner;
import java.lang.Math;
public class FindNearestMiss {
	
	//Main Function to compute the results

	public static void main(String[] args) 
	{ 
	    int x=0;
	    int y = 0;
	    int z = 0;
	    int n = 0;
	    
	    // This lower limit is for K variable
	    int lower_limit = 10; 
	    // THis upper limit is for variable K
	    int upper_limit = 35;
	    
	    
	    
	    Scanner userinput = new Scanner(System.in);  // Create a Scanner object
	    
	    //Here taking user input, to solve the equations multiple times, and how many times it will solve, this we are taking from user
	    System.out.print("Please Enter the count(number of times near miss to find) ==> ");
	    int count = userinput.nextInt(); //Number of times equation will be solved
	    
	    double nearestmiss = 9999.99; 
	    
	    //for loop to solve the equation multiple times with different values of equation variables
	    for (int i =0; i<count; i++) 
	    {
	    	boolean check = false;
	    	
	    	//while loop if in any case user enter the value which is not according to condition, instead of terminating the program it will ask user to take the input again
	        while(check!=true)
	        {
	        	
	        	//for every variable user input range is mentioned
	            System.out.print("Please Enter x (from 10 - 35) ==> ");
	            x = userinput.nextInt();
	            System.out.print("Please Enter y (from 10 - 35) ==> ");
	            y = userinput.nextInt();
	            System.out.print("Please Enter n (from 3 - 11) ==> ");
	            n = userinput.nextInt();
	            
	            //if condition to check either values lie under the required condition
	            if((n > 2 && n < 12) && (x >= lower_limit && x <= upper_limit) && (y >= lower_limit && y <= upper_limit))
	            {
	                check = true;
	            }
	        }
	        
	        //First of all x power n and y power n and then adding both numbers and store into a variable,
	        int sum_xpowern_ypowern = (int)((Math.pow (x, n))+(Math.pow (y, n)));
	        
	        //taking n root so that the value of z can be in the form of fermat's mentioned equation
	        z = (int) Math.pow (sum_xpowern_ypowern, 1.0/n);
	        
	        //if we subtract z power n from sum of x power of n and y of power of n we get the near miss value
	        int nearmiss = (int)(sum_xpowern_ypowern - Math.pow (z, n));
	        //relative miss is calculated as mentioned in instructions
	        double relativemiss = 100. * nearmiss / sum_xpowern_ypowern;
	        System.out.println("     Near Miss ==> "+nearmiss+" \n     Relative Miss ==> "+relativemiss);
	        
	        //This if condition is checking the relative miss value in every iteration and set the minimum value in nearest miss
	        if(relativemiss<nearestmiss)
	        {
	        	nearestmiss=relativemiss;
	        }
	        System.out.println("  ======> Nearest Miss = "+nearestmiss+" <======");
	           
	    }
	}
}


