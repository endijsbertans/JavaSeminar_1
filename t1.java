package service;

public class t1 {
	double positionCalc(double gravity, double initialVelocity, double, initialPosition, double fallingTime) {
		return(0.5*)
	}
	public static void main(String[] args) {
		System.out.println("Hello WOrld");
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron","Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393,299, 343, 317, 265 };
		
		for (int i = 0; i < names.length; i++) {
			  System.out.println(names[i] + " :"  + times[i]);
			}

	
		double gravity = -9.81; // Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		finalPosition = positionCalc(gravity, initialVelocity, initialPosition, fallingTime);
		System.out.println("Pos in "+fallingTime+"sec :"+finalPosition);
		// x(t) = 0.5 × a*t^2 + v_0*t + x_0

	}
}
