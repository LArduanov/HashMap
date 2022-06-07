import java.io.PrintWriter;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.util.Collections.list;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<HashMap<String,Menu>> list = new ArrayList<>();

        System.out.println(Menu.menu);

        String answer;

        AllGoods.addList(list);

        while ((answer = scanner.next()) == answer) {
            if (answer.equals("1")){
                System.out.println("Добавить товар");
                System.out.println("Введите название товара");
                String name = scanner.next();
                System.out.println("Введите цену товара, руб.");
                int price = parseInt(scanner.next());
                System.out.println("Введите количество товара, шт.");
                int amount = parseInt(scanner.next());
                HashMap<String,Menu> data = new HashMap<>();
                data.put(name, new Menu(price, amount));
                list.add(data);
                System.out.println("Добавлен товар " + data);
                System.out.println(Menu.menu);
            }
            if (answer.equals("2")) {
                System.out.println("Вывести все товары:");
                AllGoods.roster(list);
                System.out.println(Menu.menu);
            }

            if (answer.equals("3")) {
                System.out.println("Изменить количество товара");
                AllGoods.roster(list);
                System.out.println("Введите номер товара для изменения количества");
                int change = parseInt(scanner.next());
                System.out.println("Введите количество " + list.get(change - 1));
                String newAmount = scanner.next();
                //list.get(change - 1).replace();
                AllGoods.roster(list);
                System.out.println(Menu.menu);
            }
            if (answer.equals("4")){
                System.out.println("Удалить товар");
                AllGoods.roster(list);
                System.out.println("Введите номер товара для удаления");
                int delete = parseInt(scanner.next());
                System.out.println("Удален товар " + list.get(delete-1));
                list.remove(delete-1);
                AllGoods.roster(list);
                System.out.println(Menu.menu);
            }
            if (answer.equals("5")){
                System.out.println("Выход");
                return;
            }

        }
    }
}
