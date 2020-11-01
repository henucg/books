package main.设计模式之禅.chapter11;

/**
 * @author cg
 * @description desc
 * @date 2020-10-31 20:35
 */
public class Director {

    private Builder builder = null ;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Bike construct(){
        return builder.buildFrame().builderSeat().builderTire().builderBike();
    }
}
