public class Main {
    public static void main(String[] args) {

        int bonus = 1;
        int replenishment = 1505;
        int balance = 200;
        int bonuses = replenishment / 100 * bonus;
        int amount = bonuses + balance + replenishment;

        if (replenishment > 1000) {
            bonuses = replenishment / 100 * bonus;
        } else {
            bonuses = 0;
        }

        System.out.println(bonuses);
    }
}

