package teinehomework;

import java.util.List;

public class Utils {
    public static void prindiTudengiteNimed (List<Student> tudengid) {
        for (Student s : tudengid) {
            System.out.println(tudengid.getNimi());
            //System.out.println(tudengid.getFirstName());
        }
    }
}