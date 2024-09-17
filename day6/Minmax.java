package day6;

public class Minmax {
  public int max(int n1, int n2, int n3) {
    int max = n1;
    if ( n2 > max ) {
      max = n2;
    }
    if ( n3 > max ) {
      max = n3;
    }
    
    return max;
  }

  public int min (int n1, int n2, int n3) {
    int min = n1;
    if ( n2 < min ) {
      min = n2;
    }
    if ( n3 < min ) {
      min = n3;
    }
    
    return min;
  }
}
