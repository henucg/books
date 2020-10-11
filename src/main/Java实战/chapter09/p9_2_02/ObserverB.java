package main.Java实战.chapter09.p9_2_02;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 20:32
 */
public class ObserverB implements Observer {
    @Override
    public void notify(String news) {
        if(news!=null && news.contains("queen")){
            System.out.println("push the news to the orders who pay attention to \'queen\':"+news);
        }
    }
}
