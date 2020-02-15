
public class BisectionMethod {

	
	//original function
	public static double function(double x) {
		double A= Math.pow(2.020,Math.pow(-x,3));
		double B= (Math.pow(x,3));
		double C= Math.cos(Math.pow(x,4));
		return A-(B*C)-1.984;
		
	}

	public static double bisection(double left, double right,double TOL) {
		double Midpoint = (left + right)/2 ;
		// original midpoint
		double Counter = 0;
		// counter to count the number of iterations aka TOL
		while (Counter < TOL ) {
		if (function(Midpoint) == 0.0) {
			 return Midpoint;
			 //base case aka the Root
		}
		// figures out which side the root is on so you can replace
		// the opposing side with the last found midpoint
		else if (function(left)*function(Midpoint) < 0.0){
			Midpoint = bisection(left,Midpoint,Counter);
		}
		else if (function(right)*function(Midpoint) < 0.0) {
			Midpoint = bisection(Midpoint,right,Counter);
		}
		//next iteration
		Counter++;
}
		return Midpoint;
	}
	//change the left/right numbers based on whatever root you want to find
	public static void main(String[] args) {
		 double left = 1.92;
		 double right = 1.98;
		 double Root = bisection(left,right,10);
		 System.out.printf("The root is %.4f %n",Root);
		}
}
