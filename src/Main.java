public class Main {
    public static void main(String[] args) {

        int check = 100;//количество денег на счету.
        int invest = 1100; //количество внесенных денег.

        int bonus;

        if (invest > 1000) {
            bonus = invest / 100;//расчет бонусных рублей за каждые внесенные 100р на счет.
        } else {
            bonus = 0;
        }
        int balance = check + invest + bonus;
        System.out.println("Ваш итоговый счет: " + balance + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");
    }
}