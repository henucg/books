package main.Java实战.chapter09.p9_2_02;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 20:34
 */
public class ObserverC implements Observer {
    @Override
    public void notify(String news) {
        if(news!=null && news.contains("wine")){
            System.out.println("push the news to the orders who pay attention to \'wine\':"+news);
        }
    }
}
