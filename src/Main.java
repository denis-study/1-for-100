public class Main {
    public static void main(String[] args) {

        int bonus = 1;
        int replenishment = 3100;
        int balance = 200;
        int bonuses = replenishment / 1000 * bonus;
        int amount = bonuses + balance + replenishment;


        System.out.println(bonuses);
    }
}

