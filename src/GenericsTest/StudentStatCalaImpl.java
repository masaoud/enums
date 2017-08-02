package GenericsTest;

/**
 * Created by redi on 7/7/17.
 */
public class StudentStatCalaImpl <T extends Person> implements StatsCalculatorIntef<T>{

    public int calculateAverageAge(T t){
        return t.getAge();
    }


}
