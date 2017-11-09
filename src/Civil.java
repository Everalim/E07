
public class Civil extends Air {
    private int passengers;
    private boolean businessClass;

    public Civil(int power, int speed, int weight, String marka, int wings, int runway, int passengers, boolean businessClass) {
        super(power, speed, weight, marka, wings, runway);
        this.passengers = passengers;
        this.businessClass = businessClass;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public String toString() {
        return super.toString() + " " + passengers + " " + businessClass;
    }

    int result = 0;
    public void person(int person) {
        if (person <= passengers) {
            System.out.println("Пассажиры загружены");
            passengers = passengers - person;
            result += person;
            System.out.println("На борту "+result+" пассажиров");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
