//: interfaces/filters/Waveform.java
package ua.max.pochercushki.interfaces.adapter;

public class Waveform {
  private static long counter;
  private final long id = counter++;
  public String toString() { return "Waveform " + id; }
} ///:~
