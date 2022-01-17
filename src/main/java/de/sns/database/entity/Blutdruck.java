package de.sns.database.entity;

import org.jetbrains.annotations.NotNull;

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

    @NotNull
    public Integer getId() {
        return id;
    }

    public void setId(@NotNull Integer id) {
        this.id = id;
    }

    @NotNull
    public Integer getSystole() {
        return systole;
    }

    public void setSystole(@NotNull Integer systole) {
        this.systole = systole;
    }

    @NotNull
    public Integer getDiastole() {
        return diastole;
    }

    public void setDiastole(@NotNull Integer diastole) {
        this.diastole = diastole;
    }

    @NotNull
    public Integer getPuls() {
        return puls;
    }

    public void setPuls(@NotNull Integer puls) {
        this.puls = puls;
    }
}
