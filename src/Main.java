/*
 Project: Traffic Simulator
 Version: 1.0
 Start Day: 26/11/2020
 By: Nguyen Le Huy Bao
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(" Testing git connection");
        Car car = new Car("01");
        car.showOutPut();
        Bus bus = new Bus("02");
        bus.showOutPut();
        Motorbike motorbike = new Motorbike("03");
        motorbike.showOutPut();
    }
}
