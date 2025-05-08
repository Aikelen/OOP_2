public interface Vehicle {

    String getModelName();

    int getWheelsCount();

    /** Заменяем одну покрышку. */
    void updateTyre();

    /**
     * Полная процедура обслуживания, уникальная для конкретного транспорта.
     * ServiceStation вызывает именно этот метод (полиморфизм).
     */
    void service();
}