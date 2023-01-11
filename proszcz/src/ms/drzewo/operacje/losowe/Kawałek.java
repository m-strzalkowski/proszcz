package ms.drzewo.operacje.losowe;

import ms.drzewo.Węzeł;

import java.util.function.Function;

public final class Kawałek {

    public Kawałek(Function<Double, Węzeł> generator, String nazwa, double waga, int dziecimin, int dziecimax, Rozkład rozkład) {
        this.generator = generator;
        this.nazwa = nazwa;
        this.waga = waga;
        this.dziecimin = dziecimin;
        this.dziecimax = dziecimax;
        this.rozkład = rozkład;
    }

    public void wewn_zakres(double wewn_min, double wewn_max, Integer wewn_zaokr_exp) {
        this.wewn_min = wewn_min;
        this.wewn_max = wewn_max;
        this.wewn_zaokr_exp = wewn_zaokr_exp;
    }

    public Function<Double, Węzeł> getGenerator() {
        return generator;
    }

    public void setGenerator(Function<Double, Węzeł> generator) {
        this.generator = generator;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public int getDziecimin() {
        return dziecimin;
    }

    public void setDziecimin(int dziecimin) {
        this.dziecimin = dziecimin;
    }

    public int getDziecimax() {
        return dziecimax;
    }

    public void setDziecimax(int dziecimax) {
        this.dziecimax = dziecimax;
    }

    public Rozkład getRozkład() {
        return rozkład;
    }

    public void setRozkład(Rozkład rozkład) {
        this.rozkład = rozkład;
    }
    public boolean terminal(){return dziecimin==0 && dziecimax==0;}

    Function<Double, Węzeł> generator;
    String nazwa;
    double waga;
    int dziecimin=0;
    int dziecimax=0;
    double wewn_min=-1;
    double wewn_max=1;
    Integer wewn_zaokr_exp = null;
    Rozkład rozkład = Rozkład.JEDNOSTAJNY;
    @Override
    public String toString()
    {
        return "["+nazwa+" ["+dziecimin+","+dziecimax+"]"+" ["+wewn_min+","+wewn_max+"|10e"+wewn_zaokr_exp+"] w:"+waga+"]";
    }

    public Kawałek(Kawałek k) {
        this.generator = k.generator;
        this.nazwa = k.nazwa;
        this.waga = k.waga;
        this.dziecimin = k.dziecimin;
        this.dziecimax = k.dziecimax;
        this.wewn_min = k.wewn_min;
        this.wewn_max = k.wewn_max;
        this.wewn_zaokr_exp = k.wewn_zaokr_exp;
        this.rozkład = k.rozkład;
    }
}
