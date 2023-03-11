import java.util.Scanner;
public class BookstoreManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] books = {"Book 1", "Book 2", "Book 3", "Book 4", "Book 5"};
        double[] prices = {10.99, 12.99, 9.99, 15.99, 8.99};
        int[] quantities = {10, 15, 20, 5, 25};
        double totalRevenue = 0.0;
        System.out.println("Welcome to the Book Store Management System!");
        
        while(true){
            System.out.println("What would you like to do?");
            for (int i = 0; i < books.length; i++) {
            System.out.println((i+1) + ". " + books[i] + " ($" + prices[i] + ")");
