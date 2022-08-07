package pkg;

public class Day2Assingment2 {

	
//	((((10-2)+2)-2)*2)/2)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day2Assingment2 obj1= new Day2Assingment2();
	int Subresult=	obj1.sub(10, 2);
	int Sumresult=	obj1.sum(Subresult,2);
	int Subresult1=	obj1.sub(Sumresult,2);
	int multresult= obj1.mult(Subresult1, 2);
	float divresult = obj1.div(multresult, 2);
	System.out.println("final result is "+divresult);

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

