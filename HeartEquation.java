import java.util.Arrays;

public class HeartEquation {
	
	//the equations are the function in terms of x 
	// there are two because since you take the root while simplifying
	// you have to take into account the positive and negatives 

	
	public static double HeartTop(double x1) {
		double A=2-Math.pow(x1,2);
		double B= Math.sqrt(A);
		double C= Math.sqrt(Math.abs(x1));
		return B + C;
	}
	
	public static double HeartBottom(double x1) {
		double A=2-Math.pow(x1,2);
		double B= Math.sqrt(A);
		double C= Math.sqrt(Math.abs(x1));
		return -B + C ;
	}
	
	
	public static double rectangleTop(double x, double y, double n) {
		 double w = (y - x) / n;
		//starting midpoint//
		double total = 0.0;
		
		for (int a = 0 ; a < n; a++) {
			double midpoint =x + (w / 2.0) + a * w;
			//next midpoint//
			total = total + (HeartTop(midpoint)) ;
			// height of current midpoint//
		}
		
		//for loop goes through all the n's (aka the sections)
		return total *  w ;
		
	}
	//same but for the bottom portion of the heart
	public static double rectangleBottom(double x, double y, double n) {
		 double w = (y - x) / n;
		//starting midpoint//
		double total = 0.0;
		
		for (int a = 0 ; a < n; a++) {
			double midpoint =x + (w / 2.0) + a * w;
			//next midpoint//
			total = total + (HeartBottom(midpoint)) ;
			//change function used to the HeartBottom in terms of X
			// height of current midpoint//
		}
		
		//for loop goes through all the n's (aka the sections)
		return total *  w ;
		
	}
	
	
	
	public static double circle (double z){
		//(x)^2 + (y-k)^2 = r^2
		//0+(1.4142-k)^2=r^2
		double radius = 0;
		double max = 0;
	
		for(double i = -1.4142; i <= 1.4142 ; i= i+ 0.001) {
		
		for (double theta = 0 ; theta <Math.PI; theta = theta + 0.01) {
			double r = 1.4142-i;
			double x = r * Math.cos(theta);
			double y = r * Math.sin(theta) + (r-1.4142);
				
			if (x*x + Math.pow(y - Math.sqrt(Math.abs(x)),2) < 2.0000){
				if (r > max) {
					max = r;
				}
			}
		}
			
		}
		return max;
		
	}

	public static void main(String[] args) {
		//System.out.println(HeartTop(0)); Result : 1.4142
		//(where the circle meets the heart)
		double x=rectangleTop(-1.4142,1.4142,10.0);
		double y=rectangleBottom(-1.4142,-1.4142,10.0);
		double TotalArea=x+(-y);
		System.out.printf("Total area of the Heart = %.4f %n",TotalArea);
		double TotalDisc=circle(2.0);
		System.out.printf("Total area of the Max Disc = %.4f %n",TotalDisc);
		System.out.printf("Total area of the Remaining Heart= %.4f %n", TotalArea-TotalDisc);
		
	}

}