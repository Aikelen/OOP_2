abstract class MotorVehicle implements Vehicle {
    private final String modelName;
    private final int wheelsCount;

    protected MotorVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    /** Проверить двигатель (общая логика для машин и грузовиков). */
    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}