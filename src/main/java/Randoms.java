import java.util.Iterator;
import java.util.Random;

/**
 * @author Dm.Petrov
 * DATE: 25.08.2022
 */
public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.ints(1, min, max).findFirst().getAsInt();

            }
        };
    }

}
