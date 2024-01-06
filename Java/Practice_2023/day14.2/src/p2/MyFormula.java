package p2;

public class MyFormula implements Formula, Formula2 {

	@Override
	public double calculate(double a) {
		// TODO Auto-generated method stub
		return a * a;
	}

	

//In case of dup def method imple. in a class : javac err
	// soln : MUST override dup def method
	@Override
	public double sqrt(double a, double b) {
		return 2.0;//Formula.super.sqrt(a, b) +Formula2.super.sqrt(a, b);
		 
	}

}
