package lesson6;

/**
 * Created by SERGIO on 01.04.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Car carObject = new Car(10000, 2015, "Anton");

        System.out.println(carObject.color);
        System.out.println(carObject.horsePower);

        System.out.println(carObject.ownerName);

        carObject.horsePower = 100;

        System.out.println(carObject.horsePower);

        carObject.startRun();
        carObject.startRun();

        carObject.changeOwner("Test");

        System.out.println(carObject.ownerName);
    }
}