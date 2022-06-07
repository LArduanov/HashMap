import java.util.HashMap;

public class Menu {
    protected int price;
    protected int amount;

    public Menu (int price, int amount){
        this.price = price;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return " Цена = " + price + " руб., Количество = " + amount + " шт.";
    }
    static String menu = ("\n_________МЕНЮ_________\n" +
                            "1. Добавить товар\n" +
                            "2. Вывести все товары\n" +
                            "3. Изменить количество товара\n" +
                            "4. Удалить товар\n" +
                            "5. Выход");
}

