public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для входных данных и параметров программы
        int ticketPrice = 13676; // Стоимость билета в рублях
        int milesPerRubles = 20; // Количество рублей для одной бонусной мили

        // Рассчитываем количество бонусных миль
        int bonusMiles = ticketPrice / milesPerRubles;

        // Выводим результат на экран
        System.out.println("Количество начисленных миль: " + bonusMiles);
    }
}