package SimpleFraction;
import java.lang.String;
public class Fraction {
	double num;
	double den;
	public Fraction(double num, double den)
	{
		this.num = num;
		this.den = den;
	}
	public String toString()
	{
		return this.num + "/" + this.den;
	}
}
