package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumAll(int start, int end) {
    int result = 0;
    for (int i = start; i <= end; i++) {
      result += i;
    }
    return result;
  }

  public int sumOdd(int start, int end) {
    int result = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 1) {
        result += i;
      }
    }
    return result;
  }

  public int sumEven(int start, int end) {
    int result = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        result += i;
      }
    }
    return result;
  }
}
