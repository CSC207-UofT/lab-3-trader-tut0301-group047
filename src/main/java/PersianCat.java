public class PersianCat implements Domesticatable, Tradable {

    public PersianCat(){}

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public String sound() {
        return "Meow!";
    }
}
