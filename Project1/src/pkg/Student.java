package pkg;

public class Student {
	int a=20; 
	int b;
	public void automation(){
		
		System.out.println("We know automation");		
			
		}
	public void java() {
		
		System.out.println("We know java");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj = new Student();
		obj.automation();
		obj.java();
		
		
		System.out.println(obj.a);
		obj.b=23;
		System.out.println(obj.b);
			
		}
			
		



}
