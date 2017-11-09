
public class Air extends Transport {
    private int wings;                              //размах крыльев
    private int runway;                             //длина ВПП

    public Air(int power, int speed, int weight, String marka, int wings, int runway) {
        super(power, speed, weight, marka);
        this.wings = wings;
        this.runway = runway;
    }

    public Air() {

    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getRunway() {
        return runway;
    }

    public void setRunway(int runway) {
        this.runway = runway;
    }

    public String toString() {
        return super.toString() + " " + wings + " " + runway;
    }
}
