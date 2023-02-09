package it.develhope.whileloop;
import java.util.concurrent.TimeUnit;

public class Start {

    public static void main(String[] args) {

        while (true) {
            System.out.println("I am in loop");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }
}