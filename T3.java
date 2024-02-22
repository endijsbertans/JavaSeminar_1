package T4;
import java.util.Random;
import java.util.Arrays;
public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		double lower = 1;
		double upper = 10;
		
		double Array[] = null;
		try {
			Array = generateArray(N, lower, upper);
			printArray(Array);
			System.out.println("Mean: " + getMean(Array));
			System.out.println("Max: " + getMax(Array));
			System.out.println("Min: " + getMin(Array));
			System.out.println("Array sorted");
			Arrays.sort(Array);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	public static double[] generateArray(int N, double lower, double upper) throws Exception { 
		if ((N <= 0) || (upper < lower) ) throw new Exception("Wrong input parameters");
		Random rand = new Random();
		double[] Arr = new double[N];
		for(int i = 0; i< Arr.length; i++) {
			Arr[i] = rand.nextDouble(upper - lower) + lower;
		}
		return Arr;
	
	}
	public static void printArray(double[] Arr) throws Exception {
		if(Arr == null) throw new Exception("Array null");
		for(int i = 0; i< Arr.length; i++) {
			System.out.print(Arr[i] + " , ");
		}
		System.out.println();
	}
	
	public static double getMean(double[] Arr) {
		double mean = 0;
		for(int i = 0; i < Arr.length; i++) {
			mean += Arr[i];
		}
		return (mean / Arr.length);
	}
	public static double getMax(double[] Arr) {
		double currMax = Arr[0];
		for(int i = 1; i < Arr.length; i++) {
			if(currMax < Arr[i])
				currMax = Arr[i];
		}
		return currMax;
	}
	public static double getMin(double[] Arr) {
		double currMin = Arr[0];
		for(int i = 1; i < Arr.length; i++) {
			if(currMin > Arr[i])
				currMin = Arr[i];
		}
		return currMin;
	}

}
