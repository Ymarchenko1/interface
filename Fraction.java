class Fraction extends Number{
    final int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) throw new ArithmeticException("Division by zero");
        if (denominator < 0) throw new IllegalArgumentException(denominator + " is illegal");
        this.denominator = denominator;
    }

    public Fraction sum(Fraction f) {
        int numerator = f.numerator * this.denominator + f.denominator * this.numerator;
        int denominator = this.denominator * f.denominator;
        return new Fraction(numerator, denominator);
    }

    public Fraction sum(int x) {
        return sum(new Fraction(x, 1));
    }

    public Fraction minus(Fraction f) {
        int numerator = f.denominator * this.numerator - f.numerator * this.denominator;
        int denominator = this.denominator * f.denominator;
        return new Fraction(numerator, denominator);
    }

    public Fraction minus(int x) {
        return minus(new Fraction(x, 1));
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public int intValue() {
        return numerator/denominator;
    }

    @Override
    public long longValue() {
        return numerator/denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator /denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator /denominator;
    }
}

