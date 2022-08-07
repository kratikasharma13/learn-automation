package pkg;


// (((10+2)+2)-2)*2)/2) 

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculation obj = new Calculation();
int sumResult = obj.sum(10, 2);
int sumResult1 = obj.sum(sumResult, 2);
int Subtraction = obj.sub(sumResult1, 2);
int multiresult = obj.mult(Subtraction, 2);
float div = obj.div(multiresult, 2);
System.out.println("Final result is " + div);
	}
	public int sum(int a, int b) {
		
		int c =a+b;
		return c;
								}
	public int sub(int d, int e) {
		
		int f = d-e; 
		return f;
								}
	
	public int mult(int g, int h) {
	int j= g*h; 
	return j; 
									}
	 
	public float div(int k , int l) {
	float m = k/l;
	return m;	
									}
	}
