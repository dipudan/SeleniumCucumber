package dataTemplate;

public class IsItFriday {
    public static String isItFriday(String today) {
        return today.equals("Friday") ? "TGIF" : "Nope";
    }
}
