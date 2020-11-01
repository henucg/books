package main.设计模式之禅.chapter11;

/**
 * @author cg
 * @description desc
 * @date 2020-10-31 20:33
 */
public class MobikeBuilder extends Builder {
    private Bike bike = new Bike();

    @Override
    Builder buildFrame() {
        bike.setFrame("摩拜支架");
        return this;
    }

    @Override
    Builder builderSeat() {
        bike.setSeat("摩拜座椅");
        return this;
    }

    @Override
    Builder builderTire() {
        bike.setTire("摩拜轮胎");
        return this;
    }

    @Override
    Bike builderBike() {
        return this.bike;
    }
}
