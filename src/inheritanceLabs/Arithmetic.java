package inheritanceLabs;

	
	interface Calc{
	    double multiply(double a, double b);
	    double divide(double a, double b);
	}

	class Arith implements Calc {
	    
	    public double multiply(double a, double b) {
	        return a * b;
	    }

	    	
	    public double divide(double a, double b) {
	        if (b == 0) {
	            throw new IllegalArgumentException("Cannot divide by zero!");
	        }
	        return a / b;
	    }
	}

	public class Arithmetic {
	    public static void main(String[] args) {
	        Arith calc= new Arith();

	        double result1 = calc.multiply(2.5, 4.0);
	        System.out.println("Multiplication Result: " + result1);

	        double result2 = calc.divide(10.0, 2.5);
	        System.out.println("Division Result: " + result2);
	    }
	}



