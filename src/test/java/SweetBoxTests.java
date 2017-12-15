import Present.GiftBox;
import Sweets.Cake;
import Sweets.Candy;
import Sweets.Cookie;
import org.junit.Assert;
import org.junit.Test;

/**
 * Набор тестов для коробки сладостей
 */
public class SweetBoxTests {

    @Test
    public void emptyBoxShouldBeZeroWeight(){
        GiftBox box = new GiftBox();
        Assert.assertEquals("Вес пустой коробки должен быть равен нулю", 0, box.getiTotalWeight(), 0);
    }

    @Test
    public void emptyBoxShouldHaveZeroCost(){
        GiftBox box = new GiftBox();
        Assert.assertEquals("Стоимсть пустой коробки должна быть равна нулю", 0, box.getfTotalCost(), 0);
    }

    @Test
    public void countOfItemsEquals(){
        GiftBox box = new GiftBox();
        box.addItem(new Candy("A", 1, 1));
        box.addItem(new Cookie("Б", 1, 1));
        box.addItem(new Cake("В", 1, 1));
        box.addItem(new Candy("Г", 1, 1));
        Assert.assertEquals("Проверка на количество создаваемых сладостей", 4, box.getiItemCount(), 0);
    }

    @Test
    public void sumOfCostEquals(){
        GiftBox box = new GiftBox();
        box.addItem(new Candy("A", 1, 1));
        box.addItem(new Cookie("Б", 1, 1));
        box.addItem(new Cake("В", 1, 1));
        box.addItem(new Candy("Г", 1, 1));
        Assert.assertEquals("Проверка на подсчет суммы создаваемых сладостей", 4, box.getfTotalCost(), 0);
    }

    @Test
    public void sumOfWeightEquals(){
        GiftBox box = new GiftBox();
        box.addItem(new Candy("A", 1, 0.1f));
        box.addItem(new Cookie("Б", 1, 0.1f));
        box.addItem(new Cake("В", 1, 0.1f));
        box.addItem(new Candy("Г", 1, 0.1f));
        Assert.assertEquals("Проверка на подсчет веса создаваемых сладостей", 0.4, box.getiTotalWeight(), 0.001);
    }

}
