package laba4;

public class PyramideCalculation extends Calculation {
	
	PyramideCalculation(String a, String b){
		super.setSquare(Double.parseDouble(a));
		super.setHeight(Double.parseDouble(b));
	}
	
	
	@Override
	public double calculate(double a, double b) {
		  return (a*b)/3;
	}
	
}
