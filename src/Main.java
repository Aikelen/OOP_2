class Main {
    public static void main(String[] args) {
        // создаём транспорт
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");

        Truck truck1 = new Truck("truck1", 6, true);
        Truck truck2 = new Truck("truck2", 8, true);

        Bicycle bike1 = new Bicycle("bicycle1");
        Bicycle bike2 = new Bicycle("bicycle2");

        // сервис
        ServiceStation station = new ServiceStation();
        station.check(car1);
        station.check(car2);
        station.check(bike1);
        station.check(bike2);
        station.check(truck1);
        station.check(truck2);
    }
}