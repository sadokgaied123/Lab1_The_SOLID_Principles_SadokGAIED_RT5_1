package com.directi.training.lsp.exercise;

public class Pool {
    public void run() {
        Quackable donaldDuck = new Duck();
        Quackable electricDuck = new ElectronicDuck();

        Swimmable swimmingDonaldDuck = (Swimmable) donaldDuck;
        Swimmable swimmingElectricDuck = (Swimmable) electricDuck;

        quack(donaldDuck, electricDuck);
        swim(swimmingDonaldDuck, swimmingElectricDuck);
    }

    private void quack(Quackable... quackers) {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }

    private void swim(Swimmable... swimmers) {
        for (Swimmable swimmer : swimmers) {
            swimmer.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
