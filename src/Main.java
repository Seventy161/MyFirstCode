public class Main {
    public static void main(String[] args) {
        // Создаем объект сервиса
        BonusMilesService service = new BonusMilesService();

        // Задаем цену билета
        int price = 10_000;

        // Вызываем метод calculate и сохраняем результат
        int miles = service.calculate(price);

        // Выводим результат на экран
        System.out.println("Количество начисленных миль: " + miles);
    }
}