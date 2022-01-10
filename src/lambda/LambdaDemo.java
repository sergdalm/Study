// Demonstrate two simple lambda expressions.

package lambda;

// A function interface
interface MyValue {
    double getValue();
}

// Another functional interface
interface MyParamValue {
    double getValue(double v);
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myVal; // declare an interface reference

        myVal = () -> 98.6;

        System.out.println("A constant value: " + myVal.getValue());

        MyParamValue myParamValue = (n) -> 1.0 / n;

        System.out.println("Reciprocal of 4 is " + myParamValue.getValue(4.0));
        System.out.println("Reciprocal of 8 is " + myParamValue.getValue(8.0));


    }
}
