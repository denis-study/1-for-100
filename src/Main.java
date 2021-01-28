public class Main {
    public static void main(String[] args) {

        int bonus = 1;

        int replenishment = 999;
        int balance = 100;
        int bonuses = replenishment / 100 * bonus;
        int bonusAmount = bonuses + balance + replenishment;
        int nobonusAmount = replenishment + balance;

        if (replenishment <= 1000) {
            bonuses = 0;
            System.out.println(nobonusAmount);
            System.out.println(bonuses);
        } else
        {
            bonuses = replenishment / 100 * bonus;
            System.out.println(bonusAmount);
            System.out.println(bonuses);
        }

    }
}