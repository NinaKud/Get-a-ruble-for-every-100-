public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int top_up = 900;
        int total;
        int bonus = 0;
        if (top_up >= 1100) {
            bonus = top_up / 100;
        }               
    total = balance + top_up + bonus;
    System.out.println("Bonus " + bonus);        
    System.out.println("Total " + total);
}
}