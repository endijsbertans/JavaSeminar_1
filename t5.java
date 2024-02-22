package T5_1;
import java.util.Random;
import java.util.Arrays;
public class t5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(Arrays.toString(coinFlip(100)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static double[] coinFlip(int N) throws Exception {
		if ((N <= 0)) throw new Exception("Wrong input parameters");
		Random rand = new Random();
		double[] result = new double[3];
		for(int i = 1; i <= N; i++) {
			boolean isHead = rand.nextBoolean();
			if(isHead) result[0] = result[0] + 1;
			else result[1] = result[1] + 1;
		}
		result[2] = result[0]/result[1];
		return result;
	}
}
