package ua.max.pochercushki.inititialize;
/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 03.11.13
 * Time: 0:51
 * To change this template use File | Settings | File Templates.
 */
public class Leaf {
    int i = 0;

    Leaf increment() {
        i++;
        return this;

    }
    public  void print(){
        System.out.println("i"+i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().increment().print();
    }
}
