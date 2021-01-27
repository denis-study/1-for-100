public class Main {
    public static void main(String[] args) {

        int bonus = 1;
        int replenishment = 1000;
        int balance = 200;
        int bonuses = replenishment / 100 * bonus;
        int amount = bonuses + balance + replenishment;

        if (replenishment < 1000) {
            bonuses = 0;

        } else {
            bonuses = replenishment / 100 * bonus;;
            System.out.println(bonuses);
        }

    }
}

