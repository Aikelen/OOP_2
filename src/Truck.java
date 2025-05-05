class Truck extends MotorVehicle {
    private final boolean hasTrailer; // для примера, влияет на проверку прицепа

    public Truck(String modelName, int wheelsCount, boolean hasTrailer) {
        super(modelName, wheelsCount);
        this.hasTrailer = hasTrailer;
    }

    private void checkTrailer() {
        if (hasTrailer) {
            System.out.println("Проверяем прицеп");
        }
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}