package day8;

import java.util.ArrayList;

public class Problem814 {
  public static void main(String[] args) {
    int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
    ArrayList<Integer> factors = new ArrayList<>();

    int num = (int)(Math.random() * 99 ) + 2;

    int rest = num;

    while ( rest > 1 ) {
      for ( int prime : primes) {
        if ( rest % prime == 0 ) {
          rest = rest / prime;
          factors.add(prime);
          break;
        }
      }
    }

    System.out.print(num + " = ");
    for ( int i = 0; i < factors.size() - 1; i++ ) {
      System.out.print(factors.get(i) + " x " );
    }
    System.out.println(factors.get(factors.size() - 1));
  }
}
