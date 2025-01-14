package academy.learnprogramming.challenge6.kotlinfromjava;

import academy.learnprogramming.challenge6.kotlinfromjava.kotlincode.Challenge;
import academy.learnprogramming.challenge6.kotlinfromjava.kotlincode.Employee;
import academy.learnprogramming.challenge6.kotlinfromjava.kotlincode.KotlinStuff;

public class Main {

    public static void main(String[] args) {

        KotlinStuff.sayHelloToJava("Student");

        var employee = new Employee("John", "Smith", 2010);
        employee.startYear = 2009;

        Challenge.doMath(5, 4);

        employee.takesDefault("arg1");
        employee.takesDefault(null);

    }

}
