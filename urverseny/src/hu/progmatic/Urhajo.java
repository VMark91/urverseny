package hu.progmatic;

public class Urhajo {
  private int aktualisSebesseg;
  private int szelesseg;
  private int magassag;
  private int hosszusag;
  private final int epitesiEv;
  private String tipus;



  public int getSzelesseg() {
    return szelesseg;
  }

  public void setSzelesseg(int szelesseg) {
    this.szelesseg = szelesseg;
  }

  public int getMagassag() {
    return magassag;
  }

  public void setMagassag(int magassag) {
    this.magassag = magassag;
  }

  public int getHosszusag() {
    return hosszusag;
  }

  public void setHosszusag(int hosszusag) {
    this.hosszusag = hosszusag;
  }



  public Urhajo(int epitesiEv, String tipus) {
    this.epitesiEv = epitesiEv;
    this.tipus = tipus;
  }

  public Urhajo(int epitesiEv, String tipus, int aktualisSebesseg, int szelesseg, int hosszusag, int magassag) {
    this.epitesiEv = epitesiEv;
    this.tipus = tipus;
    this.aktualisSebesseg = aktualisSebesseg;
    this.szelesseg = szelesseg;
    this.hosszusag = hosszusag;
    this.magassag = magassag;
  }

  public int getEpitesiEv() {
    return epitesiEv;
  }

  public String getTipus() {
    return tipus;
  }

  public void setTipus(String tipus) {
    this.tipus = tipus;
  }

  public int getAktualisSebesseg() {
    return aktualisSebesseg;
  }

  public void setAktualisSebesseg(int aktualisSebesseg) {
    if (leszabalyozva) {
      if (aktualisSebesseg > 2500) {
        System.out.println("Leszabályozva!");
      }
    }
    this.aktualisSebesseg = aktualisSebesseg;
  }

  public boolean isLeszabalyozva() {
    return leszabalyozva;
  }

  public void setLeszabalyozva(boolean leszabalyozva) {
    this.leszabalyozva = leszabalyozva;
  }

  private boolean leszabalyozva;

  public Urhajo(int epitesiEv) {
    this.epitesiEv = epitesiEv;
  }

  public int getTerfogat() {
    return hosszusag * magassag * szelesseg;

  }

  public void adatlap() {
    System.out.println("==============================");
    System.out.println("AZ ŰRHAJÓ ADATLAPJA");
    System.out.println("==============================");
    System.out.println("Építési év: " + epitesiEv);
    System.out.println("Típus: " + tipus);
    System.out.println("Aktuális sebesség: " + aktualisSebesseg);
    System.out.println("Magasság: " + magassag);
    System.out.println("Szélesseg: " + szelesseg);
    System.out.println("Hosszúság: " + hosszusag);
    System.out.println("Térfogat: " + getTerfogat());
    System.out.println();
  }


}
