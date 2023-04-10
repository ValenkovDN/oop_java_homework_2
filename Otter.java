public class Otter extends Predator implements Swimming_speed {
    public Otter(String name) {
        super(name);
    }

    @Override
    public int swimming_Speed() {
        return 5;
    }

    @Override
    public String speak() {
        return "урр-урр";
    }
}
