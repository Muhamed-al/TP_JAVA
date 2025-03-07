package Ex_Classes_Scellées_Heritage_Java_17;



public class Main {

    public static void main(String[] args){
        Car car = new Car("Toyota");
        car.startEngine();
        car.drive();

        MotoCycle moto = new MotoCycle("Yamaha");
        moto.startEngine();
        moto.wheelie();

        SportBike bike = new SportBike("Ducati");
        bike.startEngine();
        bike.turboBoost();
        bike.wheelie();

        ElectricTruck eTruck = new ElectricTruck("Tesla");
        eTruck.startEngine();
        eTruck.chargeBattery();
    }
}
