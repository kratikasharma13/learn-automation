package pkg;

public class Day3Assingment2 {

	public void a() {
		this.c(1, 2, 3);
		System.out.println("default method");	
					 }
	
	public void a1(int a) {
		this.d(5, 6, 7, 8);
		System.out.println("1 parameterized method");		
						  }
	
	public void b(int a, int b) {
		this.a1(4);
		System.out.println("2 parameterized method");	
								}
	
	public void c(int a, int b, int c) {
		System.out.println("3 parameterized method");	
										}
	
	public void d(int a, int b, int c, int d) {
		this.a();
		System.out.println("4 parameterized method");	
											  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day3Assingment2 obj1= new Day3Assingment2();
		obj1.b(2,3);
											}


								}
