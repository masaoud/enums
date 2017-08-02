package GenericsTest;

/**
 * Created by redi on 7/7/17.
 */
public interface StatsCalculatorIntef<T extends Person> {


        public int calculateAverageAge(T t);
    }

