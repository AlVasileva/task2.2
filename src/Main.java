public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1200;
        int bonus;

        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int amount = balance + payment + bonus;
        System.out.println("Теперь на вашем счете " + amount + " рублей, " + "в том числе " + bonus + " начисленных бонусов. ");

    }
}

