import java.util.Random;

public class prob2 {
	
	public static double RandomNorm (double mean, double sd) {
		Random r = new Random();
		double val = (r.nextGaussian() * sd + mean);
		return val;
	}
	
	static double[] normalmatrix = new double [89];
	

	static double x;
	
	public static void DailyInfection1(double t1){
		for (int i = 0; i < 89; i++) {
        	normalmatrix[i] = RandomNorm(0.18,0.08);
        }
		
			
		for(int a = 1; a < 46; a++) {
			
			if(a == 1) {
				System.out.print("Patients at Day: " + 1 + " is " + 10);
				x = t1;
			}
			else
			System.out.printf("Patients at Day: " + a + " is " + "%.0f",x);
			System.out.println("");
			int random = (int) (Math.random() * 88 + 1);
			x = x * (1 + normalmatrix[random]);
		}
	}
	public static void DailyInfection2(double t1){
		for (int i = 0; i < 89; i++) {
        	normalmatrix[i] = RandomNorm(-0.24,0.04);
        }
		
			
		for(int a = 46; a < 91; a++) {
			
			if(a == 1) {
				System.out.println("Patients at Day: " + 46 + " is " + 10);
				x = t1;
			}
			else
			System.out.printf("Patients at Day: " + a + " is " + "%.0f",x);
			System.out.println("");
			int random = (int) (Math.random() * 88 + 1);
			x = x * (1 + normalmatrix[random]);
		}
	}
		
	
	
	
	public static void main( String args[] ) {
		
		DailyInfection1(10);
		DailyInfection2(x);
			
		}
		
	
}


