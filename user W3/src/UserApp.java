public class UserApp {
    public static void main(String[] args) throws Exception {
        // var user1 = new user();
        // user user2 = new user();
        // user user3;
        // user3 = new user();

        // System.out.println(user1);
        // System.out.println(user2);
        // System.out.println(user3);

        // var user = new user();
        // user.username = "Nasywa Kynda";
        // user.password = "nakyn123";
        // user.phoneNumber = "08163395967";
        // user.email = "nakyn.nattawin@gmail.com";
        // user.admin = true;

        // System.out.println("username :" +user.username);
        // System.out.println("password :" +user.password);
        // System.out.println("phone Number :" +user.phoneNumber);
        // System.out.println("country :" +user.country);

        // var user4 = new user();
        // user4.userMe();
        // user4.login("Nasywa Kynda", "nakyn123");

        // var user5 = new user("Nasywa Kynda", "nakyn213",true);
        // user5.username = "Nasywa Kynda";
        // user5.password = "nakyn123";
        // user5.admin = true;
        // user5.userMe();
        // user5.login("Nasywa Kynda", "nakyn123");

        // var user6 = new user("Nasywa Kynda", "nakyn123", "08163395967", true);
        // user6.userMe();
        // user6.login("Nasywa Kynda", null);

        var user7 = new user("Nasywa Kynda", "nakyn123");
        user7.userMe();
        user7.login("Nasywa Kynda", "nakyn123");

    }
}
