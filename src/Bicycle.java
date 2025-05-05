class Bicycle implements Vehicle {
    private final String modelName;

    public Bicycle(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public int getWheelsCount() {
        return 2;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}