package GenericsTest;

import java.util.Date;

/**
 * Created by redi on 7/7/17.
 */
public class Student extends Person {

    private String studentAttendenKurs;

    public String getStudentAttendenKurs(){

        return studentAttendenKurs;
    }

    public void setStudentAttendenKurs(String studentAttendenKurs){
        this .studentAttendenKurs = studentAttendenKurs;

    }

    public Student(String firstName, String lastName, Date dateOfBirth,String email,String studentAttendenKurs){



    }





}
