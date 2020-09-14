package main.Java实战.chapter03;

/**
 * @author cg
 * @description desc
 * @date 2020-09-15 06:45
 */
public class Apple {
    private Integer size;
    private Integer weight;

    public Apple(Integer size, Integer weight) {
        this.size = size;
        this.weight = weight;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
