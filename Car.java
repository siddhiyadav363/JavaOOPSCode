interface Drivable {
    void startEngine();
    void stopEngine();
}

class Car implements Drivable {

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();
    }
}
