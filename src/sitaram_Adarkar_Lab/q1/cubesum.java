package sitaram_Adarkar_Lab.q1;

import java.util.Scanner;

public class cubesum {
	public static void main(String[] args) {
		int num;
		int num1;
		int num2;
		int sum=0;
		System.out.println("Please enter the number");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		
		while(num>0) {
		 num1= num%10;
		  num2=num1*num1*num1;
		  sum=sum+num2;
		  num=num/10;
			System.out.println(num1+ " cube is"+num2);	
		}
		System.out.println(" Sum of cube is"+sum);
}
}

