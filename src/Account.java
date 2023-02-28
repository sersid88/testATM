import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Account {


    private String numberCard;
    private String pinCard;

    private int userID;

    public Account(String numberCard, String pinCard, int userID) {
        this.numberCard = numberCard;
        this.pinCard = pinCard;
        this.userID = userID;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getPinCard() {
        return pinCard;
    }

    public void setPinCard(String pinCard) {
        this.pinCard = pinCard;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public static void createAccountMenu () throws IOException {
        System.out.println();
        System.out.println("Let's create a new account");
        createNewAccount();
    }

    public static Account createNewAccount () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your card's number ");
        String numberCardInput = reader.readLine();
        if (numberCardInput.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}")) {
            String[] splitCardNumber = numberCardInput.split("-");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < splitCardNumber.length; i++) {
                sb.append(splitCardNumber[i]);

            }
        } return new Account("222", "www", 66);
    }
}
