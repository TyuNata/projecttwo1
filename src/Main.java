public class Main {
    public static void main(String[] args) {
        int balance = 500; // сумма баланса
        int deposit = 1500; // сумма пополнения
        int total = balance + deposit; // баланс + пополнение
        int bonus; // бонус
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Ваш счет: " + total + " бонус: " + bonus);
    }
}
