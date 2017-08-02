/**
 * Created by redi on 6/30/17.
 */
public class Test {
    public static void main(String[] args) {
        Day holiday;
        holiday = Day.TEUSDAY;
        System.out.println("the hollyday is=" + holiday);

        if (holiday == Day.FRIDAY) {
            //CALL SPECIAL METHODS
            System.out.println("hello friday");

        }
        if (holiday == Day.THURSDAY) {

            System.out.println("hello theusday");


        }
        if (holiday == Day.SUNDAY) {

            System.out.println("hello sunday");


        }
        switch (holiday) {
            case TEUSDAY:
                System.out.println("tomorrow is weekend");

                break;
            case MONDAY:
                System.out.println("tomorrow is weekend");
                break;
            case FRIDAY:
                System.out.println("tomorrow is weekend");
                break;


        }

        String dayDescription =Day.FRIDAY.getDescription();


        int dayOder =Day.THURSDAY.getOrder();


        boolean dayBoolean =Day.SATUDAY.getBoolean();


        System.out.println(dayDescription+" "+dayOder+" "+dayBoolean+" ");

        int num = 4 ;

        for (Day day : Day.values()){
            if (day.getOrder()==num){
                System.out.println(day.getBoolean());
            }
        }



    }
}

