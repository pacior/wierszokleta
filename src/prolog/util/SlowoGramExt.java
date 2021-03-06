/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prolog.util;

/**
 *
 * @author Grzegorz
 */
public class SlowoGramExt {
    public String wartosc;
    public String flaga;
    public int kolejnosc;
    public String bezok;

    public SlowoGramExt(String wartosc, String flaga, int kolejnosc, String bezok) {
        this.wartosc = wartosc;
        this.flaga = flaga;
        this.kolejnosc = kolejnosc;
        this.bezok = bezok;
    }

    @Override
    public boolean equals(Object obj) {
        SlowoGramExt s = (SlowoGramExt)obj;

        return this.bezok.equals(s.bezok);
    }

    public String getBezok() {
        return bezok;
    }

    public void setBezok(String bezok) {
        this.bezok = bezok;
    }

    public String getFlaga() {
        return flaga;
    }

    public void setFlaga(String flaga) {
        this.flaga = flaga;
    }

    public int getKolejnosc() {
        return kolejnosc;
    }

    public void setKolejnosc(int kolejnosc) {
        this.kolejnosc = kolejnosc;
    }

    public String getWartosc() {
        return wartosc;
    }

    public void setWartosc(String wartosc) {
        this.wartosc = wartosc;
    }

}
