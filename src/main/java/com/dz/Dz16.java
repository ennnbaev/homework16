package com.dz;

import org.apache.commons.math3.primes.Primes;

public class Dz16 {
    public static void main(String[] args) {
        for (String arg : args) {
            try {
                if (Primes.isPrime(Integer.parseInt(arg))) {
                    System.out.println(arg+"-prime");
                } else {
                    System.out.println(arg+"-not prime");
                }
            } catch (NumberFormatException exc) {
                System.out.println(arg+" NOT A NUMBER");
            }
        }
    }
}
