package hu.progmatic;

public class Varos {
  private final String nev;
  private final Urhajo[] urhajok;
  public static int sebesseghatar;

  public Varos(String nev, int regisztraltUrhajokSzama) {
    this.nev = nev;
    this.urhajok = new Urhajo[regisztraltUrhajokSzama];

  }

  public void urhajoLista() {
    System.out.println("==============================");
    System.out.println(this.nev);
    System.out.println("==============================");
    if (urhajok != null && urhajok.length > 0) {
      for (int i = 0; i < urhajok.length; i++) {
        if (urhajok[i] != null) {
          System.out.println("Építési év: " + urhajok[i].getEpitesiEv());
          System.out.println("Típus: " + urhajok[i].getTipus());
          System.out.println("Aktuális sebesség: " + urhajok[i].getAktualisSebesseg());
          System.out.println("Magasság: " + urhajok[i].getMagassag());
          System.out.println("Szélesseg: " + urhajok[i].getSzelesseg());
          System.out.println("Hosszúság: " + urhajok[i].getHosszusag());
          System.out.println("Térfogat: " + urhajok[i].getTerfogat());
          System.out.println("------------------------------");
        }
      }
    } else {
      System.out.println("Nincsnek űrhajók a városban!");
    }
  }

  public void leggyorsabbUrhajo() {
    if (urhajok != null && urhajok.length > 0) {
      int idx = 0;
      while (urhajok[idx] == null) {
        idx++;
      }
      Urhajo max = urhajok[idx];
      for (int j = 0; j < urhajok.length; j++) {
        if (urhajok[j] != null && max.getAktualisSebesseg() < urhajok[j].getAktualisSebesseg()) {
          max = urhajok[j];
        }
      }
      System.out.println("==============================");
      System.out.println(this.nev + "(leggyorsabb űrhajó)");
      System.out.println("==============================");
      System.out.println("Építési év: " + max.getEpitesiEv());
      System.out.println("Típus: " + max.getTipus());
      System.out.println("Aktuális sebesség: " + max.getAktualisSebesseg());
      System.out.println("Magasság: " + max.getMagassag());
      System.out.println("Szélesseg: " + max.getSzelesseg());
      System.out.println("Hosszúság: " + max.getHosszusag());
      System.out.println("Térfogat: " + max.getTerfogat());
      System.out.println("------------------------------");
    } else {
      System.out.println("Nincsnek űrhajók a városban!");
    }
  }

  public void gyorshajtok() {
    System.out.println("==============================");
    System.out.println(this.nev + " (gyorshajtó űrhajók listája)");
    System.out.println("==============================");
    if (urhajok != null && urhajok.length > 0) {
      for (Urhajo urhajo : urhajok) {
        if (urhajo != null && sebesseghatar > 0 && urhajo.getAktualisSebesseg() > sebesseghatar) {
          System.out.println("Építési év: " + urhajo.getEpitesiEv());
          System.out.println("Típus: " + urhajo.getTipus());
          System.out.println("Aktuális sebesség: " + urhajo.getAktualisSebesseg());
          System.out.println("Magasság: " + urhajo.getMagassag());
          System.out.println("Szélesseg: " + urhajo.getSzelesseg());
          System.out.println("Hosszúság: " + urhajo.getHosszusag());
          System.out.println("Térfogat: " + urhajo.getTerfogat());
          System.out.println("------------------------------");
        }
      }
    }
  }

  public void tipusLista(String tipus) {
    System.out.println("==============================");
    System.out.println(this.nev + "(" + tipus + " típusú űrhajók listája)");
    System.out.println("==============================");
    if (urhajok != null && urhajok.length > 0) {
      for (Urhajo urhajo : urhajok) {
        if (urhajo != null && urhajo.getTipus().equals(tipus)) {
          System.out.println("Építési év: " + urhajo.getEpitesiEv());
          System.out.println("Típus: " + urhajo.getTipus());
          System.out.println("Aktuális sebesség: " + urhajo.getAktualisSebesseg());
          System.out.println("Magasság: " + urhajo.getMagassag());
          System.out.println("Szélesseg: " + urhajo.getSzelesseg());
          System.out.println("Hosszúság: " + urhajo.getHosszusag());
          System.out.println("Térfogat: " + urhajo.getTerfogat());
          System.out.println("------------------------------");
        }
      }
    }
  }

  public void setUrhajo(int index, Urhajo urhajo) {
    if (index < 0 || index > this.urhajok.length - 1) {
      throw new RuntimeException();
    }
    this.urhajok[index] = urhajo;
  }

  public Urhajo getUrhajo(int index) {
    if (index < 0 || index > this.urhajok.length - 1) {
      throw new RuntimeException();
    }
    return this.urhajok[index];
  }

  public String getNev() {
    return nev;
  }
}
