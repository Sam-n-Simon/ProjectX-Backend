package de.sns.database.entity;

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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMuskeltrockenmasseKG_1() {
        return muskeltrockenmasseKG_1;
    }

    public void setMuskeltrockenmasseKG_1(Double muskeltrockenmasseKG_1) {
        this.muskeltrockenmasseKG_1 = muskeltrockenmasseKG_1;
    }

    public Double getMuskeltrockenmasseKG_2() {
        return muskeltrockenmasseKG_2;
    }

    public void setMuskeltrockenmasseKG_2(Double muskeltrockenmasseKG_2) {
        this.muskeltrockenmasseKG_2 = muskeltrockenmasseKG_2;
    }

    public Double getMuskeltrockenmasseKG_3() {
        return muskeltrockenmasseKG_3;
    }

    public void setMuskeltrockenmasseKG_3(Double muskeltrockenmasseKG_3) {
        this.muskeltrockenmasseKG_3 = muskeltrockenmasseKG_3;
    }

    public Double getMuskeltrockenmassePR_1() {
        return muskeltrockenmassePR_1;
    }

    public void setMuskeltrockenmassePR_1(Double muskeltrockenmassePR_1) {
        this.muskeltrockenmassePR_1 = muskeltrockenmassePR_1;
    }

    public Double getMuskeltrockenmassePR_2() {
        return muskeltrockenmassePR_2;
    }

    public void setMuskeltrockenmassePR_2(Double muskeltrockenmassePR_2) {
        this.muskeltrockenmassePR_2 = muskeltrockenmassePR_2;
    }

    public Double getMuskeltrockenmassePR_3() {
        return muskeltrockenmassePR_3;
    }

    public void setMuskeltrockenmassePR_3(Double muskeltrockenmassePR_3) {
        this.muskeltrockenmassePR_3 = muskeltrockenmassePR_3;
    }

    public Double getKoerperfettKG_1() {
        return koerperfettKG_1;
    }

    public void setKoerperfettKG_1(Double koerperfettKG_1) {
        this.koerperfettKG_1 = koerperfettKG_1;
    }

    public Double getKoerperfettKG_2() {
        return koerperfettKG_2;
    }

    public void setKoerperfettKG_2(Double koerperfettKG_2) {
        this.koerperfettKG_2 = koerperfettKG_2;
    }

    public Double getKoerperfettKG_3() {
        return koerperfettKG_3;
    }

    public void setKoerperfettKG_3(Double koerperfettKG_3) {
        this.koerperfettKG_3 = koerperfettKG_3;
    }

    public Double getKoerperfettPR_1() {
        return koerperfettPR_1;
    }

    public void setKoerperfettPR_1(Double koerperfettPR_1) {
        this.koerperfettPR_1 = koerperfettPR_1;
    }

    public Double getKoerperfettPR_2() {
        return koerperfettPR_2;
    }

    public void setKoerperfettPR_2(Double koerperfettPR_2) {
        this.koerperfettPR_2 = koerperfettPR_2;
    }

    public Double getKoerperfettPR_3() {
        return koerperfettPR_3;
    }

    public void setKoerperfettPR_3(Double koerperfettPR_3) {
        this.koerperfettPR_3 = koerperfettPR_3;
    }

    public Double getKoerperwasserKG_1() {
        return koerperwasserKG_1;
    }

    public void setKoerperwasserKG_1(Double koerperwasserKG_1) {
        this.koerperwasserKG_1 = koerperwasserKG_1;
    }

    public Double getKoerperwasserKG_2() {
        return koerperwasserKG_2;
    }

    public void setKoerperwasserKG_2(Double koerperwasserKG_2) {
        this.koerperwasserKG_2 = koerperwasserKG_2;
    }

    public Double getKoerperwasserKG_3() {
        return koerperwasserKG_3;
    }

    public void setKoerperwasserKG_3(Double koerperwasserKG_3) {
        this.koerperwasserKG_3 = koerperwasserKG_3;
    }

    public Double getKoerperwasserPR_1() {
        return koerperwasserPR_1;
    }

    public void setKoerperwasserPR_1(Double koerperwasserPR_1) {
        this.koerperwasserPR_1 = koerperwasserPR_1;
    }

    public Double getKoerperwasserPR_2() {
        return koerperwasserPR_2;
    }

    public void setKoerperwasserPR_2(Double koerperwasserPR_2) {
        this.koerperwasserPR_2 = koerperwasserPR_2;
    }

    public Double getKoerperwasserPR_3() {
        return koerperwasserPR_3;
    }

    public void setKoerperwasserPR_3(Double koerperwasserPR_3) {
        this.koerperwasserPR_3 = koerperwasserPR_3;
    }
}
