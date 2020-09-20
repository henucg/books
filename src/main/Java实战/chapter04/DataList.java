package main.Java实战.chapter04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 08:59
 */
public class DataList {
    // 菜单
    public static List<Dish> meau = new ArrayList<>();

    static{
        meau.add(new Dish("pork",false,800,Type.META));
        meau.add(new Dish("beef",false,800,Type.META));
        meau.add(new Dish("chicken",false,400,Type.META));
        meau.add(new Dish("fresh fries",true,530,Type.OTHER));
        meau.add(new Dish("rice",true,350,Type.OTHER));
        meau.add(new Dish("season fruit",true,120,Type.OTHER));
        meau.add(new Dish("pizza",true,550,Type.OTHER));
        meau.add(new Dish("prawns",false,300,Type.FISH));
        meau.add(new Dish("salmon",false,450,Type.FISH));
    }
}
