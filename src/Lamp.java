public class Lamp {
    private boolean battery;
    private LampType style;
    private int globRating;

    public Lamp(boolean battery, LampType style, int globRating){
        this.battery=battery;
        this.style=style;
        this.globRating=globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
