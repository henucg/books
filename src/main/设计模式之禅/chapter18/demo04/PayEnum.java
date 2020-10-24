package main.设计模式之禅.chapter18.demo04;

public enum PayEnum {

    WECHAT_PAY(1){
        @Override
        public void pay(int money) {
            System.out.println("微信支付"+money+"元");
        }
    },
    ZHIFUBAO_PAY(2){
        @Override
        public void pay(int money) {
            System.out.println("支付宝支付"+money+"元");
        }
    };

    private int payType;

    PayEnum(int payType){
        this.payType = payType;
    }

    public abstract void pay(int money);

    public static PayEnum of(int payType){
        for(PayEnum e:PayEnum.values()){
            if(payType==e.payType){
                return e;
            }
        }
        return null;
    }
}
