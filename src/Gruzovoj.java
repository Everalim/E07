
public class Gruzovoj extends Nazemnyj {
    private double carrying;                                    //грузоподъемность

    public Gruzovoj(int power, int speed, int weight, String marka, int wheels, double rashod, double carrying) {
        super(power, speed, weight, marka, wheels, rashod);
        this.carrying = carrying;
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    public String toString() {
        return super.toString() + " " + carrying;
    }

    int result = 0;
    public void gruz(double gruz) {
        if (gruz <= carrying) {
            System.out.println("Грузовик загружен");
            carrying = carrying - gruz;
            result +=gruz;
            System.out.println("В грузовике "+result+" тонн");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
