package sitaram_Adarkar_Lab.q2;

import java.util.Scanner;

public class traffic{

	public static void main(String[] args) {
		  
		System.out.println("traffic");  
		
		System.out.println("press 1 for RED"); 
		System.out.println("press 2 for YELLOW"); 
		System.out.println("press 3 for GREEN"); 

		Scanner sc = new Scanner(System.in);   
		int choice = sc.nextInt();  
		traffic a= new traffic();
		switch(choice) {
		case 1:
			a.Red();
			break;
			
		case 2:
			a.Yellow();
			break;
			
		case 3:
			a.Green();
			break;
						
			default:System.out.println("Wrong Choice");
		}
		}
	
	public void Red()
	{
		System.out.println("Stop");
	}
	
	public void Yellow()
	{
		System.out.println("Warning");
	}
	
	public void Green()
	{
		System.out.println("Go");
	}
}