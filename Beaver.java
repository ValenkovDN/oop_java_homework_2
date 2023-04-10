public class Beaver extends Mammal implements Swimming_speed{
    public Beaver(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "ХР-ХР";
    }

    @Override
    public String feed() {
        return "Кора/Трава";
    }

    @Override
    public int swimming_Speed() {
        return 6;
    }
}
