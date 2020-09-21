package com.company;

public class Main {

    public static void main(String[] args) {

//        Converting km to miles and reverse
        double km = 100d;
        double miles = 62.1371d;

        Neuron neuron = new Neuron();
        neuron.train(km, miles);

        System.out.println(neuron.processInputData(km) + " miles in 100 km");


//        Converting eur to usd and reverse
        double eur = 0.84d;
        double usd = 1d;

        neuron = new Neuron();
        neuron.train(eur, usd);

        System.out.println(neuron.processInputData(eur) + " dollars in 0.84 euros");
        System.out.println(neuron.processInputData(100d) + " dollars in 100 euros");
    }

}


