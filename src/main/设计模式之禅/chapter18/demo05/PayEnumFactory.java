package main.设计模式之禅.chapter18.demo05;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 08:10
 */
public enum PayEnumFactory {

    WECHAT_PAY(1){
        @Override
        public PayStatregy buildPay() {
            return new WechatPay();
        }
    },

    ZHIFUBAO_PAY(2){
        @Override
        public PayStatregy buildPay() {
            return new ZhifubaoPay();
        }
    };

    private int payType;

    PayEnumFactory(int payType){
        this.payType = payType;
    }

    public abstract PayStatregy buildPay();

    public static PayEnumFactory of(int payType){
        for(PayEnumFactory e:PayEnumFactory.values()){
            if(e.payType==payType){
                return e;
            }
        }
        return null;
    }
}
