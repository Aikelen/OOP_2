class ServiceStation {
    /**
     * Полиморфный метод: принимает любой транспорт, у которого реализован Vehicle.
     */
    public void check(Vehicle vehicle) {
        vehicle.service();
    }

    /*
     * Перегрузка: по требованиям домашки добавим отдельные входы,
     * но внутри всё равно делегируем на общий метод.
     */
    public void check(Car car) {
        check((Vehicle) car);
    }

    public void check(Truck truck) {
        check((Vehicle) truck);
    }

    public void check(Bicycle bicycle) {
        check((Vehicle) bicycle);
    }
}