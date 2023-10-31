package comdemo;

import java.util.HashMap;

public class UserDataBase {
    private static HashMap<String, String> users = new HashMap<>();
    private static HashMap<String, Integer> balances = new HashMap<>();

    static {
       
        users.put("Swati", "Swati");
        users.put("Java", "Jsp");
        users.put("Unknown", "known");
        balances.put("Swati", 30000);
        balances.put("Java", 40000);
        balances.put("Unknown", 3400);
    }

   
    public static boolean isValidUser(String username, String password) {
        String storedPassword = users.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

   
    public static int getUserBalance(String username) {
        Integer balance = balances.get(username);
        return balance != null ? balance : 0;
    }

    
    public static void updateUserBalance(String username, int newBalance) {
        balances.put(username, newBalance);
    }
}
