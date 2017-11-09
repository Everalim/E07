
public class Run {
    public static void main(String[] args) {
        Legkovoj legkovoj = new Legkovoj(120, 240, 2100, "Opel", 4, 7.3, "wagon", 4);
        Gruzovoj gruzovoj = new Gruzovoj(360, 150, 8000, "Volvo", 6, 30, 7);
        Civil civil = new Civil(700, 950, 7000, "Boeng", 8, 1500, 270, true);
        Military military = new Military(400, 1100, 2000, "Su-37", 5, 400, true, 8);
//        System.out.println(legkovoj);
//        System.out.println(gruzovoj);
//        System.out.println(civil);
//        System.out.println(military);

//        legkovoj.distance(3);
//        gruzovoj.gruz(3);
//        gruzovoj.gruz(3);
//
        civil.person(200);
        civil.person(50);

        military.shot(4);
        military.shot(5);

        military.catapult(1);
        military.catapult(1);

    }
}
