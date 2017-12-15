import Present.GiftBox;
import Sweets.Cake;
import Sweets.Candy;
import Sweets.Cookie;

/**
 * Основной модуль программы
 */
public class MakePresent {
    public static void main(String[] args) {
        GiftBox box = new GiftBox();
        box.addItem(new Cake("Клубничный тортик", 120, 0.250f));
        box.addItem(new Candy("Алёнка", 60, 0.100f));
        box.addItem(new Cookie("Юбелейное", 30, 0.150f));
        box.addItem(new Candy("Халва в шоколаде", 100, 0.200f));
        box.addItemInd(new Candy("Гусиные лапки", 175, 1.0f), 3);
        box.delItemInd(2);
        box.printItems();
        System.out.println("Общий вес подарка: " + box.getiTotalWeight() + " кг. Стоимость: " + box.getfTotalCost() + " рублей. В подарке " + box.getiItemCount() + " сладостей.");
    }
}
