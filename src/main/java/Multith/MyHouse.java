package Multith;

public class MyHouse {
    private boolean pizzaArived = false;
    public void eatPizza() throws InterruptedException {
        synchronized (this){
            while (!pizzaArived){
                wait();
            }
        }
    }
    public void pizzaGuy(){
        synchronized (this){
            this.pizzaArived = true;
            notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyHouse myHouse = new MyHouse();
        myHouse.eatPizza();
        myHouse.pizzaGuy();
    }
}
