package main.Java实战.chapter05;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 08:54
 */
public class Dish {
    private String name ;
    private Boolean vegetarain ;
    private Integer calories ;
    private Type type;

    public Dish(String name, Boolean vegetarain, Integer calories, Type type) {
        this.name = name;
        this.vegetarain = vegetarain;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVegetarain() {
        return vegetarain;
    }

    public void setVegetarain(Boolean vegetarain) {
        this.vegetarain = vegetarain;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegetarain=" + vegetarain +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
