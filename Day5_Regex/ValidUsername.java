package Day5_Regex;
import java.util.regex.*;
public class ValidUsername {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);
        //\d{2,4} → Matches 12, 1234, but not 1

        String[] username = {"us_12", "123user", "user_12345698745"};


        for (String email : username) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " is valid: " + matcher.matches());
        }
    }

}
