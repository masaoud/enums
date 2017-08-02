package GenericsTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by redi on 7/7/17.
 */
public class GenericsTest {

 /*   static void printNames(List<String> namesList) {
        namesList.stream().forEach(name -> System.out.println(name));
    }

    static void printNumber(List<Integer> numberList) {
        numberList.stream().forEach(number -> System.out.println(number));
    }

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("masod");
        name.add("alaa");
        name.add("mohamad");
        printlist(name);
        List<Integer> age = new ArrayList<>();
        age.add(11);
        age.add(33);
        age.add(22);
        printlist(age);
    }
}*/



     public static void main(String[] args) {

  StatsCalculatorIntef<Person> calc = new StatsCalculatorImp<Person>();
   Person per =new Person(40);

   int avg =calc.calculateAverageAge(per);
        System.out.println(avg);

    }

 static <T>void  printList(List<T>listOfAll){
     listOfAll.stream().forEach(element -> System.out.println(element));
         }
     }










