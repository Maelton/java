package maelton.java_functional_programming.lambda_expressions;

@FunctionalInterface
interface A {
    void showA();
}

@FunctionalInterface
interface B {
    void showB(String s);
}

@FunctionalInterface
interface C {
    void showC(int n1, int n2);
}

@FunctionalInterface
interface Calculation {
    double operation(double a, double b);
}

public class LambdaWithFunctionalInterfaceExample {
    public static void main(String[] args) {
        //======= Instantiating functional interface with anonymous class by using lambda expression =======
        A example = new A() {
            public void showA() {
                System.out.println("Example 0 with A interface");
            }
        };

        //Functional interfaces are SAM interfaces, then it's not necessary to specify its method signature
        A example1 = () -> System.out.println("Previous example using lambda");
        example1.showA();

        //======= Lambda expression with arguments =======
        B example2 = userInput -> System.out.println("Lambda expression received: " + userInput);
        example2.showB("Example 2 with B interface");

        //======= Lambda expression with arguments with multiple lines of code =======
        C example3 = (var1, var2) -> {
            System.out.println("First value received: " + var1);
            System.out.println("Second value received: " + var2);
            System.out.println("Calculation performed: " + var1 + " + " + var2 + " = " + (var1 + var2));
        };
        example3.showC(3,2);

        //======= Returning values with lambda expressions =======
        Calculation example4 = (n1, n2) -> n1 + n2;
        System.out.println(example4.operation(1,1));
    }
}
