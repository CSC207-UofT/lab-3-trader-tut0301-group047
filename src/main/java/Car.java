public class Car implements Tradable, Drivable {
    private int maxspeed;
    private int price;

    public Car() {
        this.maxspeed = 100;
        this.price = 1000;
    }
    @Override
    public void upgradeSpeed() {
        this.maxspeed += 10;
        this.price += 100;
    }

    @Override
    public void downgradeSpeed() {
        this.maxspeed -= 10;
        this.price -= 100;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxspeed;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        String id = super.toString();
        return id + " (Max speed: " + this.maxspeed +")";
    }
}
