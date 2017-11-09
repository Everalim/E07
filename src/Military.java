public class Military extends Air {
    private boolean catapult;
    private int rocket;

    public Military(int power, int speed, int weight, String marka, int wings, int runway, boolean catapult, int rocket) {
        super(power, speed, weight, marka, wings, runway);
        this.catapult = catapult;
        this.rocket = rocket;
    }

    public boolean isCatapult() {
        return catapult;
    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public int getRocket() {
        return rocket;
    }

    public void setRocket(int rocket) {
        this.rocket = rocket;
    }

    public String toString() {
        return super.toString() + " " + catapult + " " + rocket;
    }

    public void shot(int shot) {
        while (shot > 0 && rocket > 0) {
            System.out.println("Ракета пошла");
            rocket--;
            shot--;
            System.out.println("Осталось " + rocket + " ракет");
        }
        if (rocket == 0) {
            System.out.println("Боеприпасы закончились");
        }
    }

    public void catapult(double push) {
        if (catapult) {
            System.out.println("Катапультирование прошло успешно");
            catapult = false;
        } else {
            System.out.println("У Вас нет такой системы");
        }
    }
}
