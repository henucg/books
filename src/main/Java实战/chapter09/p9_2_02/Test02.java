package main.Java实战.chapter09.p9_2_02;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 20:43
 */
public class Test02 {
    public static void main(String[] args) {
        // Lambda表达式实现观察者模式
        Feed feed = new Feed();

        feed.registerObserver((String news)->{
            if(news!=null && news.contains("money")){
                System.out.println("push the new to the orders who pay attention to \'money\':"+news);
            }
        });

        feed.registerObserver((String news)->{
            if(news!=null && news.contains("queen")){
                System.out.println("push the new to the orders who pay attention to \'queen\':"+news);
            }
        });

        feed.registerObserver((String news)->{
            if(news!=null && news.contains("wine")){
                System.out.println("push the new to the orders who pay attention to \'wine\':"+news);
            }
        });

        feed.registerObserver((String news)->{
            if(news!=null && news.contains("book")){
                System.out.println("push the new to the orders who pay attention to \'book\':"+news);
            }
        });

        feed.notifyObservers("The queen said her favourite book is Modern Java In Action");
    }
}
