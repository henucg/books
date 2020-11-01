package main.设计模式之禅.chapter11;

/**
 * @author cg
 * @description desc
 * @date 2020-10-31 20:28
 */
public abstract class Builder {

    abstract Builder buildFrame();

    abstract Builder builderSeat();

    abstract Builder builderTire();

    abstract Bike builderBike();
}
