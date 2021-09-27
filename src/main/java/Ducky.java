public class Ducky implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Ducky() {
        this.maxSpeed = 1;
    }

    @Override
    public String sound() {
        return "Ga!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 2000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
