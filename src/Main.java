public class Main {
    public static void main(String[] args) {
        int replenishment = 3_200;
        int bonus =1;
        int count = 100;
        int amount = replenishment / (1000 + bonus);
        int ResultAmount = count + amount + replenishment;

        System.out.println(ResultAmount);

        }
    }

