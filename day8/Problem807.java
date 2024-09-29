package day8;

public class Problem807 {
  public static void main(String[] args) {
    // init
    int nume1 = (int)(Math.random() * 10) + 1;
    int deno1 = (int)(Math.random() * 10) + 1;
    int nume2 = (int)(Math.random() * 10) + 1;
    int deno2 = (int)(Math.random() * 10) + 1;

    int[] input1 = { nume1, deno1 };
    int[] input2 = { nume2, deno2 };

    System.out.println(
      formatter(input1) + " + "
      + formatter(input2) + " = "
      + formatter(calc(nume1, nume2, deno1, deno2))
    );
  }

  private static String formatter(int[] input) {
    int gcd = gcd(input[0], input[1]);
    int resNume = input[0] / gcd;
    int resDeno = input[1] / gcd;

    int integerPart = resNume / resDeno;
    int remainder = resNume % resDeno;

    if (resDeno == 1) {
      return String.valueOf(resNume);
    }
    if (integerPart > 0) {
      return String.format("%d.%d/%d", integerPart, remainder, resDeno);
    }
    return String.format("%d/%d", resNume, resDeno);
  }

  private static int[] calc(int nume1, int nume2, int deno1, int deno2) {
    int nume3 = nume1 * deno2 + nume2 * deno1;
    int deno3 = deno1 * deno2;
    return new int[] { nume3, deno3 };
  }

  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}

