package main.设计模式之禅.chapter18.demo03;

public enum PayEnum {

    WECHAT_PAY(12){
        @Override
        public void pay(int money) {
            System.out.println("微信支付"+money+"元");
        }
    },

    ZHIFUBAO_PAY(3){
        @Override
        public void pay(int money) {
            System.out.println("支付宝支付"+money+"元");
        }
    },

    UNION_PAY(5){
        @Override
        public void pay(int money) {
            System.out.println("银联支付"+money+"元");
        }
    };

    private int money;

    PayEnum(int money){
        this.money = money;
    }

    public abstract void pay(int money);
}
