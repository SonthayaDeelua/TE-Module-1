package com.techelevator;

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denomenator) {
		int gcdAns = 0;
		if (numerator != 0 && denomenator != 0)
			//;
		{
			gcdAns = gcd(numerator, denomenator);
		}
		if (gcdAns > 1) {
			this.numerator = numerator / gcdAns;
			this.denominator = denomenator / gcdAns;
		} else {
			this.numerator = numerator;
			this.denominator = denomenator;
		}
	}

	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}

	public static Fraction multiply(Fraction a, Fraction b) {
		int numerator = a.numerator * b.numerator;
		int denominator = a.denominator * b.denominator;
		Fraction answer = new Fraction(numerator, denominator);
		return answer;
	}

	@Override
	public boolean equals(Object o) {
		Fraction f = (Fraction) o;
		if (this.numerator == f.numerator && this.denominator == f.denominator) {
			return true;
		}
		return false;
	}

	public static int gcd(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

}