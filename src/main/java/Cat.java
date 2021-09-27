public class Cat implements Domesticatable, Tradable {
    private String Breeds;

    public Cat(String breeds) {
        this.Breeds = breeds;
    }

    @Override
    public String sound() {return "Meow~";}

    @Override
    public int getPrice() {return 500;}

    @Override
    public String toString() {
        String id = super.toString();
        return id + " (Breeds: " + this.Breeds + ")";
    }
}
