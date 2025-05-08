class Car extends MotorVehicle {

    public Car(String modelName) {
        super(modelName, 4);
    }

    /**
     * Обслуживание автомобиля: меняем все колёса и проверяем двигатель.
     */
    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}