public class Main {
    public static void main(String[] args) {
        int balance;
        int payment;
        int bonus;
        int amount;
        balance = 100;
        payment = 1200;

        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        amount = balance + payment + bonus;
        System.out.println("Теперь на вашем счете " + amount + " рублей, " + " в том числе " + bonus + "начисленных бонусов. ");

    }
}

