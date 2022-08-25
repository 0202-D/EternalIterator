/**
 * @author Dm.Petrov
 * DATE: 25.08.2022
 */
public class Main {
    public static void main(String[] args) {
      //  Randoms randoms = new Randoms(5,10);
        for (int r : new Randoms(10, 101)) {
            System.out.println("Случайное число: " + r);
            if (r == 77) {
                System.out.println("Выпало число 77, давайте на этом закончим");
                break;
            }
        }
    }

}
