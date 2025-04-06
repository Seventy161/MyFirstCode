public class BonusMilesService {
    public int calculate(int price) {
        // Рассчитываем количество миль (целочисленное деление)
        return price / 20;
    }
}