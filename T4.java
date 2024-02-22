package T5;
import java.util.Random;
import java.util.Arrays;
public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5; 
		double Array[][] = null;
		try {
			Array = generateMatrix(N);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Arrays.deepToString(Array));

	}
	public static double[][] generateMatrix(int N) throws Exception{
		if ((N <= 0)) throw new Exception("Wrong input parameters");
		Random rand = new Random();
		double genArr[][] = new double[N][N];

		for(int i = 0; i < genArr.length; i++) {
			for(int j = 0; j < genArr[i].length; j++) {
				genArr[i][j] = rand.nextDouble();
			}
		}
		return genArr;
	}

}
