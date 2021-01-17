package zamowieniePackage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Zawmowienie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idZamowienia;
    private int nrZamowienia;
    private Date data;
    private double suma;

    public Zawmowienie() {
        this.nrZamowienia = 0;
        this.data = null;
        this.suma = 0;
    }

    public Zawmowienie(int nrZamowienia, Date data, double suma) {
        this.nrZamowienia = nrZamowienia;
        this.data = data;
        this.suma = suma;
    }

    public int getIdZamowienia() {
        return idZamowienia;
    }

    public void setIdZamowienia(int idZamowienia) {
        this.idZamowienia = idZamowienia;
    }

    public int getNrZamowienia() {
        return nrZamowienia;
    }

    public void setNrZamowienia(int nrZamowienia) {
        this.nrZamowienia = nrZamowienia;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "Zawmowienie{" +
                "idZamowienia=" + idZamowienia +
                ", nrZamowienia=" + nrZamowienia +
                ", data=" + data +
                ", suma=" + suma +
                '}';
    }
}