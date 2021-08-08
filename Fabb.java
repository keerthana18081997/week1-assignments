package Assignments;

public class Fabb {
public static void main(String[] args) {
	int firstnum=0;
	int secondnum=1;
	int range=8;

	
	System.out.println(firstnum);
	for(int i=1;i<range;i++) {
		
		int sum=firstnum+secondnum;
		System.out.println(sum);
		firstnum=secondnum;
		secondnum=sum;
		
		}
}
}
