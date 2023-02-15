package SpaceShip;

public enum Condition {
    FRESH("Воздух Чистый"),
    POLLUTED("Воздух загрязнен");

    private String air;

    private Condition(String air) {
        this.air = air;
    }

    public String getAir() {
        return this.air;
    }
}
