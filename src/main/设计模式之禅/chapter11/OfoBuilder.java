package main.设计模式之禅.chapter11;

/**
 * @author cg
 * @description desc
 * @date 2020-10-31 20:30
 */
public class OfoBuilder extends Builder {
    private Bike bike = new Bike();

    @Override
    Builder buildFrame() {
        bike.setFrame("ofo支架");
        return this;
    }

    @Override
    Builder builderSeat() {
        bike.setSeat("ofo座椅");
        return this;
    }

    @Override
    Builder builderTire() {
        bike.setTire("ofo轮胎");
        return this;
    }

    @Override
    Bike builderBike() {
        return this.bike;
    }
}
