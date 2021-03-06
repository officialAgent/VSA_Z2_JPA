package sk.stuba.fei.vsa;

import com.sun.istack.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity

public class Osoba {
    private Long id;

    public Osoba() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Osoba(String meno, Date narodena, Float vaha) {
        this.meno = meno;
        this.narodena = narodena;
        this.vaha = vaha;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    private String meno;

    @Column(nullable = true)
@Basic
    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    private Date narodena;
    @Column(nullable = true)
    @Basic
    public Date getNarodena() {
        return narodena;
    }

    public void setNarodena(Date narodena) {
        this.narodena = narodena;
    }

    private Float vaha;
    @Column(nullable = true)
    @Basic
    public Float getVaha() {
        return vaha;
    }

    public void setVaha(Float vaha) {
        this.vaha = vaha;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "id=" + id +
                ", meno='" + meno + '\'' +
                ", narodena=" + narodena +
                ", vaha=" + vaha +
                '}';
    }
}
