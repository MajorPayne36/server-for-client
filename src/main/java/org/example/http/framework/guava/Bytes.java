package org.example.http.framework.guava;

/**
 * from Guava library
 */
public class Bytes {
  public static int indexOf(byte[] array, byte[] target, int start, int end) {
    if (target.length == 0) {
      return 0;
    }

    outer:
    for (int i = start; i < end - target.length + 1; i++) {
      for (int j = 0; j < target.length; j++) {
        if (array[i + j] != target[j]) {
          continue outer;
        }
      }
      return i;
    }
    return -1;
  }
}
