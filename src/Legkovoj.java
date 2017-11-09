
public class Legkovoj extends Nazemnyj {
    private String body;
    private int passengers;

    public Legkovoj(int power, int speed, int weight, String marka, int wheels, double rashod, String body, int passengers) {
        super(power, speed, weight, marka, wheels, rashod);
        this.body = body;
        this.passengers = passengers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }


    public String toString() {
        return super.toString()+" "+body+" "+passengers;
    }

    private double toplivo(int rast, double rashod){
        return rashod*rast/100;
    }

    public void distance(int time) {
        int result = getSpeed() * time;
        double toplivo = toplivo(result, getRashod());
        System.out.println("За время "+time+" ч, автомобиль "+getMarka()+", двигаясь с максимальной скоростью "+getSpeed()+" км/ч, проедет "+result+" км и израсходует "+toplivo+" литров топлива");
    }
}
