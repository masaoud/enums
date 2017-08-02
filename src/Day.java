/**
 * Created by redi on 6/30/17.
 */
public enum Day {
    MONDAY("is the first day",1,false),
    TEUSDAY("is the second day",2,false),
    WENSDAY("is the third day",3,false),
    THURSDAY("is the fourth day",4,false),
    FRIDAY("is the five day",5,false),
    SATUDAY("is the sixth day",6,true),
    SUNDAY("is the seven day",7,true);

    private String description;
    private int order;
    private boolean isweekend;

    Day(String s,int i,boolean b){
        description =s;
        order = i;
        isweekend = b;

    }
    public String getDescription(){
        return this.description;
    }
    public int getOrder(){
        return this.order;
    }

    public boolean getBoolean(){
        return  this.isweekend;

    }









}
