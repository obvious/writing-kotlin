package in.obvious.ws.writingkotlin.nullsafety.java;

public class NullSafety {

    public static void main(String[] args) {
        String phoneNumber = loadPhoneNumber();
        callUser(phoneNumber);
    }

    static void callUser(String phoneNumber) {

    }

    static void showError() {

    }

    static String loadPhoneNumber() {
        // Getting phone number from DB
        return null;
//        return phoneNumber;
    }
}
