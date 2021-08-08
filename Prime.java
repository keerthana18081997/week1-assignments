package Assignments;

public class Prime {
public static void main(String[] args)
{
	int input=12;
	boolean f=false;
	int j=input/2;
	int remainder;
	
	for(int i=2;i<j;i++) {
		remainder=input%i;
	if(remainder==0) {
		f=true;
	}
}
	if(f==false) {
		System.out.println("it is an prime number");
	}
	else {
		System.out.println("it is not an prime number");
	}
}
}
