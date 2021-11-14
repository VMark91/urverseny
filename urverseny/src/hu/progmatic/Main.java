package hu.progmatic;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Varos alfapolisz = new Varos("Alfapolisz", 5);
    Varos betapolis = new Varos("Bétapolisz", 10);
    for (int i = 0; i < otUrhajoGeneralasa().length; i++) {
      alfapolisz.setUrhajo(i, otUrhajoGeneralasa()[i]);
    }
    for (int i = 0; i < tizUrhajoGeneralasa().length; i++) {
      betapolis.setUrhajo(i, tizUrhajoGeneralasa()[i]);
    }


  }


  static Urhajo[] otUrhajoGeneralasa() {
    Urhajo[] otUrhajo = new Urhajo[5];
    otUrhajo[0] = new Urhajo(2550, "Alfa-1", 3500, 3, 3, 3);
    otUrhajo[1] = new Urhajo(2552, "Béta-2", 2870, 5, 5, 5);
    otUrhajo[2] = new Urhajo(2470, "Gamma-3", 4012, 4, 4, 4);
    otUrhajo[3] = new Urhajo(2720, "Gamma-3", 1500, 1, 2, 3);
    otUrhajo[4] = new Urhajo(2610, "Alfa-1", 5000, 3, 2, 1);
    return otUrhajo;
  }

  static Urhajo[] tizUrhajoGeneralasa() {
    Urhajo[] tizUrhajo = new Urhajo[10];
    tizUrhajo[0] = new Urhajo(2345, "Alfa-1", 1200, 1, 1, 1);
    tizUrhajo[1] = new Urhajo(2543, "Béta-2", 8701, 2, 3, 1);
    tizUrhajo[2] = new Urhajo(2222, "Gamma-3", 100, 3, 4, 5);
    tizUrhajo[3] = new Urhajo(2434, "Alfa-1", 14, 6, 7, 8);
    tizUrhajo[4] = new Urhajo(2384, "Béta-2", 3456, 5, 4, 3);
    tizUrhajo[5] = new Urhajo(2656, "Gamma-3", 4567, 7, 6, 5);
    tizUrhajo[6] = new Urhajo(2930, "Alfa-1", 2121, 2, 1, 2);
    tizUrhajo[7] = new Urhajo(2589, "Béta-2", 4321, 12, 21, 3);
    tizUrhajo[8] = new Urhajo(2487, "Alfa-1", 8960, 3, 7, 9);
    tizUrhajo[9] = new Urhajo(2743, "Gamma-3", 2100, 5, 9, 2);
    return tizUrhajo;
  }
}
