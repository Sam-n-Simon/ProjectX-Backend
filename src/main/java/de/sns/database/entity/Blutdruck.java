package de.sns.database.entity;

import javax.persistence.*;

@Entity
@Table (name = "`Blutdruck`")
public class Blutdruck {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "`systole`", nullable = false)
    private Integer systole;

    @Column (name = "`diastole`", nullable = false)
    private Integer diastole;

    @Column (name = "`puls`", nullable = false)
    private Integer puls;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSystole() {
        return systole;
    }

    public void setSystole(Integer systole) {
        this.systole = systole;
    }

    public Integer getDiastole() {
        return diastole;
    }

    public void setDiastole(Integer diastole) {
        this.diastole = diastole;
    }

    public Integer getPuls() {
        return puls;
    }

    public void setPuls(Integer puls) {
        this.puls = puls;
    }
}
