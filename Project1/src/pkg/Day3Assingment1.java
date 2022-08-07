package pkg;

public class Day3Assingment1 {

	public Day3Assingment1() {
		this(2,3,4,5);
		System.out.println("default constructor");
	}
	
	Day3Assingment1(int a){
		this();
		System.out.println("1 parametrized constructor");
	}
	
	Day3Assingment1(int a, int b){
		this(2);
		System.out.println("2 parametrized constructor");
	}
	
	Day3Assingment1(int a, int b, int c){
		this(2,3);
		System.out.println("3 paramterized constructor");
	}
	
	Day3Assingment1(int a, int b, int c, int d){

	System.out.println("4 paramterized constructor");
	
	}
	
	
	public static void main(String[] args) {
	 Day3Assingment1 obj1= new Day3Assingment1(3,2,1);


	}

}
