import java.time.LocalDate;

public class Oops {
    public static void main(String[] args) {
        Creating youngUser = new Creating();
        youngUser.name = "Pratik gautam";
        youngUser.birthday = LocalDate.parse("2001-10-25");
        System.out.printf("%s was born in %s", youngUser.name, youngUser.birthday.toString());
    }

}
