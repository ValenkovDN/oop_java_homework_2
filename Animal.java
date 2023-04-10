public abstract class Animal implements Speakable{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Кличка животного: %s\n", this.name))
                .append(String.format("Корм: %s\n", feed()))
                .append(String.format("Голос: %s\n", speak()));

        return res.toString();

    }
}