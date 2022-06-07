import java.util.HashMap;
import java.util.List;

public class AllGoods {

    public static void roster(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public static void addList(List list) {
        HashMap<String, Menu> data1 = new HashMap<>();
        data1.put("Печенье", new Menu(100, 20));
        list.add(data1);
        HashMap<String, Menu> data2 = new HashMap<>();
        data2.put("Конфеты", new Menu(150, 80));
        list.add(data2);
        HashMap<String, Menu> data3 = new HashMap<>();
        data3.put("Мармелад", new Menu(80, 40));
        list.add(data3);
    }
}

