package de.sns.database.entity;

import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

@Entity
@Table (name = "`Koerperaufbauanalyse`")
public class Koerperaufbauanalyse {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;



    @Column (name = "`muskeltrockenmasseKG_1`")
    private Double muskeltrockenmasseKG_1;

    @Column (name = "`muskeltrockenmasseKG_2`")
    private Double muskeltrockenmasseKG_2;

    @Column (name = "`muskeltrockenmasseKG_3`")
    private Double muskeltrockenmasseKG_3;

    @Column (name = "`muskeltrockenmassePR_1`")
    private Double muskeltrockenmassePR_1;

    @Column (name = "`muskeltrockenmassePR_2`")
    private Double muskeltrockenmassePR_2;

    @Column (name = "`muskeltrockenmassePR_3`")
    private Double muskeltrockenmassePR_3;

    @Column (name = "`koerperfettKG_1`")
    private Double koerperfettKG_1;

    @Column (name = "`koerperfettKG_2`")
    private Double koerperfettKG_2;

    @Column (name = "`koerperfettKG_3`")
    private Double koerperfettKG_3;

    @Column (name = "`koerperfettPR_1`")
    private Double koerperfettPR_1;

    @Column (name = "`koerperfettPR_2`")
    private Double koerperfettPR_2;

    @Column (name = "`koerperfettPR_3`")
    private Double koerperfettPR_3;

    @Column (name = "`koerperwasserKG_1`")
    private Double koerperwasserKG_1;

    @Column (name = "`koerperwasserKG_2`")
    private Double koerperwasserKG_2;

    @Column (name = "`koerperwasserKG_3`")
    private Double koerperwasserKG_3;

    @Column (name = "`koerperwasserPR_1`")
    private Double koerperwasserPR_1;

    @Column (name = "`koerperwasserPR_2`")
    private Double koerperwasserPR_2;

    @Column (name = "`koerperwasserPR_3`")
    private Double koerperwasserPR_3;


    @NotNull
    public Integer getId() {
        return id;
    }

    public void setId(@NotNull Integer id) {
        this.id = id;
    }

    @NotNull
    public Double getMuskeltrockenmasseKG_1() {
        return muskeltrockenmasseKG_1;
    }

    public void setMuskeltrockenmasseKG_1(@NotNull Double muskeltrockenmasseKG_1) {
        this.muskeltrockenmasseKG_1 = muskeltrockenmasseKG_1;
    }

    @NotNull
    public Double getMuskeltrockenmasseKG_2() {
        return muskeltrockenmasseKG_2;
    }

    public void setMuskeltrockenmasseKG_2(@NotNull Double muskeltrockenmasseKG_2) {
        this.muskeltrockenmasseKG_2 = muskeltrockenmasseKG_2;
    }

    @NotNull
    public Double getMuskeltrockenmasseKG_3() {
        return muskeltrockenmasseKG_3;
    }

    public void setMuskeltrockenmasseKG_3(@NotNull Double muskeltrockenmasseKG_3) {
        this.muskeltrockenmasseKG_3 = muskeltrockenmasseKG_3;
    }

    @NotNull
    public Double getMuskeltrockenmassePR_1() {
        return muskeltrockenmassePR_1;
    }

    public void setMuskeltrockenmassePR_1(@NotNull Double muskeltrockenmassePR_1) {
        this.muskeltrockenmassePR_1 = muskeltrockenmassePR_1;
    }

    @NotNull
    public Double getMuskeltrockenmassePR_2() {
        return muskeltrockenmassePR_2;
    }

    public void setMuskeltrockenmassePR_2(@NotNull Double muskeltrockenmassePR_2) {
        this.muskeltrockenmassePR_2 = muskeltrockenmassePR_2;
    }

    @NotNull
    public Double getMuskeltrockenmassePR_3() {
        return muskeltrockenmassePR_3;
    }

    public void setMuskeltrockenmassePR_3(@NotNull Double muskeltrockenmassePR_3) {
        this.muskeltrockenmassePR_3 = muskeltrockenmassePR_3;
    }

    @NotNull
    public Double getKoerperfettKG_1() {
        return koerperfettKG_1;
    }

    public void setKoerperfettKG_1(@NotNull Double koerperfettKG_1) {
        this.koerperfettKG_1 = koerperfettKG_1;
    }

    @NotNull
    public Double getKoerperfettKG_2() {
        return koerperfettKG_2;
    }

    public void setKoerperfettKG_2(@NotNull Double koerperfettKG_2) {
        this.koerperfettKG_2 = koerperfettKG_2;
    }

    @NotNull
    public Double getKoerperfettKG_3() {
        return koerperfettKG_3;
    }

    public void setKoerperfettKG_3(@NotNull Double koerperfettKG_3) {
        this.koerperfettKG_3 = koerperfettKG_3;
    }

    @NotNull
    public Double getKoerperfettPR_1() {
        return koerperfettPR_1;
    }

    public void setKoerperfettPR_1(@NotNull Double koerperfettPR_1) {
        this.koerperfettPR_1 = koerperfettPR_1;
    }

    @NotNull
    public Double getKoerperfettPR_2() {
        return koerperfettPR_2;
    }

    public void setKoerperfettPR_2(@NotNull Double koerperfettPR_2) {
        this.koerperfettPR_2 = koerperfettPR_2;
    }

    @NotNull
    public Double getKoerperfettPR_3() {
        return koerperfettPR_3;
    }

    public void setKoerperfettPR_3(@NotNull Double koerperfettPR_3) {
        this.koerperfettPR_3 = koerperfettPR_3;
    }

    @NotNull
    public Double getKoerperwasserKG_1() {
        return koerperwasserKG_1;
    }

    public void setKoerperwasserKG_1(@NotNull Double koerperwasserKG_1) {
        this.koerperwasserKG_1 = koerperwasserKG_1;
    }

    @NotNull
    public Double getKoerperwasserKG_2() {
        return koerperwasserKG_2;
    }

    public void setKoerperwasserKG_2(@NotNull Double koerperwasserKG_2) {
        this.koerperwasserKG_2 = koerperwasserKG_2;
    }

    @NotNull
    public Double getKoerperwasserKG_3() {
        return koerperwasserKG_3;
    }

    public void setKoerperwasserKG_3(@NotNull Double koerperwasserKG_3) {
        this.koerperwasserKG_3 = koerperwasserKG_3;
    }

    @NotNull
    public Double getKoerperwasserPR_1() {
        return koerperwasserPR_1;
    }

    public void setKoerperwasserPR_1(@NotNull Double koerperwasserPR_1) {
        this.koerperwasserPR_1 = koerperwasserPR_1;
    }

    @NotNull
    public Double getKoerperwasserPR_2() {
        return koerperwasserPR_2;
    }

    public void setKoerperwasserPR_2(@NotNull Double koerperwasserPR_2) {
        this.koerperwasserPR_2 = koerperwasserPR_2;
    }

    @NotNull
    public Double getKoerperwasserPR_3() {
        return koerperwasserPR_3;
    }

    public void setKoerperwasserPR_3(@NotNull Double koerperwasserPR_3) {
        this.koerperwasserPR_3 = koerperwasserPR_3;
    }
}
