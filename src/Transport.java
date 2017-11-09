
public class Transport {
    private int power;
    private int speed;
    private int weight;
    private String marka;

    public Transport(int power, int speed, int weight, String marka) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.marka = marka;
    }

    public Transport() {

    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int maxSpeed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String toString() {
        return getPower() + "лс "+powerKw()+ "kw " + getSpeed() + " " + getWeight() + " " + getMarka();
    }

    private double powerKw(){
        return power*0.74;
    }




}
