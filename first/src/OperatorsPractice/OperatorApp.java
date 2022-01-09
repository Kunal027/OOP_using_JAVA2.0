package OperatorsPractice;

public class OperatorApp {
    public static void main(String[] args) {

        String carModel = "Dodge Challenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 100000;
        boolean isDamaged = true;

        System.out.println("Price of a" + carModel + ":" +  " $ " + price);

        int increasedPrice = price + 1000;
        System.out.println("The Increased price of a " + carModel + " $ " + increasedPrice);

        int decreasedPrice = price - 500;
        System.out.println("The decreased price of a " + carModel + " $ " + decreasedPrice);

        int twoCarsPrice = price * 2;
        System.out.println("The price of two " + carModel + " $ " + twoCarsPrice);

        System.out.println("--------------------------------------------------------------");

        int priceNegative =  -14999;
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("Negative price with plus sign : $ " + priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("Negative price with Minus sign : $ " + priceNegativeWithMinusSign);
        int priceOnceDollarIncrease = ++price;
        System.out.println("price after 1 $ price Increase : $ " + priceOnceDollarIncrease);


    }
}
