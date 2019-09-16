package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Optional;

public class PaperTape {

  public static void main(String[] args){

    System.out.println(Arrays.toString(parseInts(args)));

    long total = sum(parseInts(args));
    System.out.printf("total = %,d%n", total);

  }


  private static int[] parseInts(String[] args){
    int[] values = new int[args.length];

    for (int i = 0; i < args.length; i++) {
      values[i] = tryParseInt(args[i]).get();
    }
    return values;
  }

  private static long sum(int[]data){
    long total = 0;

    for (int datum : data) {
      total += datum;
    }
    return total;
  }


  private static Optional<Integer> tryParseInt(String input){

    try {

      return Optional.of(Integer.parseInt(input));
    } catch (NumberFormatException e) {
      return Optional.of(0);
    }
  }
}
