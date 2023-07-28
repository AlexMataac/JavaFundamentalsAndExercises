package Exercises;



public class PairedArrayByIndex {
    public static void main(String[] args) {


/*        Instruction: Create 3 arrays that will hold 5
        user's credentials:
            * Email
            * Username
            * Password

        We will output the user's credentials by using an int variable as an index.

        Sample Output
        Index: 0
        Email: ace@gmail.com
        Password: acelangmalakas*/



        String email[] = {
                "ace@yahoo.com",
                "king@yahoo.com",
                "flowers@gmail.com",
                "denim@gmail.com",
                "love@gmail.com"};
        String userName[] = {
                "MidnightDishwasher",
                "king",
                "flowers",
                "denim",
                "love"};
        String password[] = {
                "acelangmalakas",
                "akobudoy",
                "akosinatoynamahalka",
                "hellooubre",
                "wazzup"};

        int i = 3;

        System.out.println("Index : " + i);
        System.out.println("Email : " + email[i]);
        System.out.println("Username : " + userName[i]);
        System.out.println("Password : " + password[i]);

    }
}
