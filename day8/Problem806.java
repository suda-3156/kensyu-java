package day8;

public class Problem806 {

  public static void main(String[] args) {
    // init
    int nume1 = (int)(Math.random() * 10) + 1;
    int deno1 = (int)(Math.random() * 9 ) + 2;
    int nume2 = (int)(Math.random() * 10) + 1;
    int deno2 = (int)(Math.random() * 9 ) + 2;

    System.out.print(String.format("%d/%d + %d/%d = ", nume1, deno1, nume2, deno2));
    System.out.println(calc(nume1, nume2, deno1, deno2));  
  }

  private static String calc(int nume1, int nume2, int deno1, int deno2) {
    // calc
    int nume3 = nume1 * deno2 + nume2 * deno1;
    int deno3 = deno1 * deno2;
    int gcd = gcd(nume3, deno3);
    
    int resNume = nume3 / gcd;
    int resDeno = deno3 /gcd;

    if ( resDeno == 1) {
      return String.valueOf(resNume);
    }
    if ( resNume - resDeno > 0) {
      return String.format("%d.%d/%d", (int)(resNume/resDeno) ,resNume%resDeno, resDeno);
    }
    return String.format("%d/%d", resNume, resDeno);
  }

  private static int gcd(int a, int b) {
    if ( b == 0 ) {
      return a;
    }
    return gcd( b, a % b );
  }
}
