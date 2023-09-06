package tvz.hr.projekt;

import java.security.MessageDigest;
import java.util.Base64;

public class MainHashing {
    public static void main(String[] args) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest("admin".getBytes("UTF-8"));
            String hashedAdminPassword = Base64.getEncoder().encodeToString(hash);
            System.out.println("Hashed 'admin' password: " + hashedAdminPassword);

            hash = messageDigest.digest("jedan".getBytes("UTF-8"));
            String hashedUserPassword = Base64.getEncoder().encodeToString(hash);
            System.out.println("Hashed 'user' password: " + hashedUserPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}