package ua.max.pochercushki.inititialize;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 03.11.13
 * Time: 1:03
 * To change this template use File | Settings | File Templates.
 */
class Person {
    public void eat(Apple apple) {
        Apple pealed = apple.getPialed();
        System.out.println("YAMMY");
    }
}
    class Pealer {
     static Apple peel(Apple apple) {
            return apple;
        }
    }

    class Apple {
        Apple getPialed(){return Pealer.peel(this);}
    }

   public class PassingThis{
       public static void main(String[] args) {
           new Person().eat(new Apple());
       }
   }
