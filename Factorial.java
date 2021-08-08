package Assignments;

public class Factorial {
public static void main(String args[]) {
	int input=6;
	int result=1;
	
	for(int i=1;i<=input;i++)
	{
		result=result*i;
	}
	System.out.println(result);
}
}