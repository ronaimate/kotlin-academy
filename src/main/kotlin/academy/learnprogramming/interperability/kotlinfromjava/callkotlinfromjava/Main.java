package academy.learnprogramming.interperability.kotlinfromjava.callkotlinfromjava;

import academy.learnprogramming.interperability.kotlinfromjava.kotlincode.Car;
import academy.learnprogramming.interperability.kotlinfromjava.kotlincode.SingletonObj;
import academy.learnprogramming.interperability.kotlinfromjava.kotlincode.StaticCar;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StaticCar.topLevel();

        StaticCar.print("print this Java string");

        var car = new Car("blue", "BMW", 2011);


//        car.setColor("purple"); can't invoke private
        System.out.println(car.getColor());

//        System.out.println(car.getModel()); // con't: @JvmField
        System.out.println(car.model); // @JvmField

        Car.Companion.carComp(); // without @JvmStatic
        Car.carComp(); // with @JvmStatic

//        System.out.println("isAuto = " + Car.Companion.isAuto()); // without @JvmField
        System.out.println("isAuto = " + Car.isAuto); // with @JvmField

        System.out.println("Constant = " + Car.constant);

        SingletonObj.INSTANCE.doSomething(); // without @JvmStatic
        SingletonObj.doSomething(); // with @JvmStatic

//        car.printMe(null); // throws NPE

        try {
            StaticCar.doIO();
        } catch (IOException e) { // kotlin kod require @Throws(IOException::class) otherwise compile error
            System.out.println("IO Exception");
        }

        StaticCar.defaultArgs("The number is"); // required @JvmOverloads, that generate all versions of function
    }
}
