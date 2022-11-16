package Homework_13_11.LocalInner;

import java.util.Random;

class Process extends Thread {
    private int randomNumber = 0;
    @Override
    public void run() {
        final int bound = 100;
        class NumberGenerator {
            void setRandomNumber() {
                Random random = new Random();
                randomNumber = random.nextInt(bound);
            }
            void printRandomNumber() {
                System.out.println("Random Number: " + randomNumber);
            }
        }
        NumberGenerator generator = new NumberGenerator();
        generator.setRandomNumber();
        generator.printRandomNumber();
    }
}