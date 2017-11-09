
public class Nazemnyj extends Transport {
    private int wheels;                                 //кол-во колес
    private double rashod;                              //расход топлива

    public Nazemnyj(int power, int speed, int weight, String marka, int wheels, double rashod) {
        super(power, speed, weight, marka);
        this.wheels = wheels;
        this.rashod = rashod;
    }

    public Nazemnyj() {

    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getRashod() {
        return rashod;
    }

    public void setRashod(double rashod) {
        this.rashod = rashod;
    }

    public String toString() {
        return super.toString() + " " + wheels + " " + rashod;
    }

}
