package main.Java实战.chapter09.p9_2_03;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 20:56
 */
public abstract class ProcessingObject<T> {

    protected ProcessingObject<T> successor;

    public void setSuccessor(ProcessingObject<T> successor){
        this.successor = successor;
    }

    public T handle(T input){
        T r = handleWork(input);
        if(successor!=null){
            return successor.handle(r);
        }
        return r;
    }

    abstract protected T handleWork(T input);
}
