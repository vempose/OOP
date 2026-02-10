package Lab1;

public class Problem3 {
    static void main() {
        Temperature temp = new Temperature();
        System.out.println("Initial values:\n" + temp);

//        temp.setScale('b'); // Falls in error
        temp.setScale('f'); // work even with small letters
        temp.setDegrees(60);
        System.out.println("After 1st change:\n" + temp);

        temp.setBoth(10, 'c');
        System.out.println("After 2nd change:\n" + temp);

        System.out.println("Get Fahrenheit: " + temp.getFahrenheit() + " F");
    }
}

class Temperature {
    private double degrees;
    private char scale;

    public Temperature() {
        degrees = 0;
        scale = 'C';
    }

    public Temperature(double degrees) {
        this.degrees = degrees;
        scale = 'C';
    }

    public Temperature(char scale) {
        this.scale = scale;
        degrees = 0;
    }

    public Temperature(double degrees, char scale) {
        this.degrees = degrees;
        this.scale = scale;
    }

    public double getCelsius() {
        if (scale == 'C') {
            return degrees;
        } else {
            return 5 * (degrees - 32) / 9;
        }
    }

    public double getFahrenheit() {
        if (scale == 'F') {
            return degrees;
        } else {
            return (9 * (degrees / 5)) + 32;
        }
    }

    public double getDegrees() {
        return degrees;
    }

    public char getScale() {
        return scale;
    }

    public String getScaleFull() {
        return (scale == 'C') ? "Celsius" : "Fahrenheit";
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public void setScale(char scale) {
        var unifiedScale = Character.toUpperCase(scale);
        if (!(unifiedScale == 'C' || unifiedScale == 'F')) {
            throw new IllegalArgumentException("Invalid argument: only 'C' and 'F' are allowed!");
        }
        this.scale = unifiedScale;
    }

    public void setBoth(double degrees, char scale) {
        setDegrees(degrees);
        setScale(scale);
    }

    @Override
    public String toString() {
        return String.format("Degrees: %.2f\nScale: %s\n",
                getDegrees(),
                getScaleFull()
        );
    }
}