package main.Java实战.chapter05;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 08:59
 */
public class DataList {
    // 菜单数据
    public static List<Dish> meau = new ArrayList<>();

    static{
        meau.add(new Dish("season fruit",true,120, Type.OTHER));
        meau.add(new Dish("prawns",false,300, Type.FISH));
        meau.add(new Dish("rice",true,350, Type.OTHER));
        meau.add(new Dish("chicken",false,400, Type.META));
        meau.add(new Dish("salmon",false,450, Type.FISH));
        meau.add(new Dish("fresh fries",true,530, Type.OTHER));
        meau.add(new Dish("pizza",true,550, Type.OTHER));
        meau.add(new Dish("pork",false,800, Type.META));
        meau.add(new Dish("beef",false,800, Type.META));
    }

    // 交易员交易数据
    public static List<Transaction> transactions = new ArrayList<>();

    static{
        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        transactions.add(new Transaction(brian,2011,300));
        transactions.add(new Transaction(raoul,2012,1000));
        transactions.add(new Transaction(raoul,2011,400));
        transactions.add(new Transaction(mario,2012,710));
        transactions.add(new Transaction(mario,2011,700));
        transactions.add(new Transaction(alan,2012,950));
    }
}
