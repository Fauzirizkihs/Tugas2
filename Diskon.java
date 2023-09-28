public class Diskon { 
    public static void main (String[] args){ 
        int totalPrice = 150000;
        double discount = 0.3;
        double tax = 0.15;
        double finalPrice = (1-discount)*totalPrice;
        finalPrice += finalPrice*tax;
        System.out.println    ("Final Price :" + finalPrice); 
    }
}