package JAVA1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EntryDatabase {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "Swati@123");
                while (true) {
                    System.out.println("Select the choice");
                    System.out.println("1 Insert");
                    System.out.println("2 Update");
                    System.out.println("3 Delete");
                    System.out.println("4 Search");
                    System.out.println("Enter the choice");

                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1: {
                            System.out.println("Enter the pid");
                            int pid = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter pname");
                            String pname = sc.nextLine();
                            System.out.println("Enter the color");
                            String color = sc.nextLine();
                            PreparedStatement ps = con.prepareStatement("INSERT INTO parts(pid, pname, color) VALUES (?, ?, ?)");

                            ps.setInt(1, pid);
                            ps.setString(2, pname);
                            ps.setString(3, color);
                            ps.executeUpdate();
                            System.out.println("1 record is inserted");
                            break;
                        }
                        case 2: {
                            System.out.println("Enter the pid");
                            int pid = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter pname");
                            String pname = sc.nextLine();
                            System.out.println("Enter the color");
                            String color = sc.nextLine();
                            PreparedStatement ps = con.prepareStatement("UPDATE parts SET pname = ?, color = ? WHERE pid = ?");

                            ps.setString(1, pname);
                            ps.setString(2, color);
                            ps.setInt(3, pid);

                            ps.executeUpdate();
                            System.out.println("1 row is updated");
                            break;
                        }
                        case 3: {
                            System.out.println("Enter the pid");
                            int pid = sc.nextInt();
                            PreparedStatement ps = con.prepareStatement("DELETE FROM parts WHERE pid = ?");

                            ps.setInt(1, pid);

                            ps.executeUpdate();
                            System.out.println("1 row is deleted");
                            break;
                        }
                        case 4: {
                            System.out.println("Enter the pid");
                            int pid = sc.nextInt();
                            PreparedStatement ps = con.prepareStatement("SELECT pid, pname, color FROM parts WHERE pid = ?");

                            ps.setInt(1, pid);
                            ResultSet res = ps.executeQuery();
                            while (res.next()) {
                                System.out.println("pid " + res.getInt(1));
                                System.out.println("pname " + res.getString(2));
                                System.out.println("color " + res.getString(3));
                            }
                            break;
                        }
                        default: {
                            System.out.println("Invalid choice.");
                            System.out.println("Exit.");
                            System.exit(0);
                            break;
                        }
                    }
                }
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
