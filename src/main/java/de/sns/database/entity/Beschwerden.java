package de.sns.database.entity;

import javax.persistence.*;

@Entity
@Table (name = "`Beschwerden`")
public class Beschwerden {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "akuteBeschwerden", nullable = false)
    private String akuteBeschwerden;

    // TODO: Alle booleans hinzufügen, die für beschwerden stehen

    @Column (name = "hauptBeschwerden", nullable = false)
    private String hauptBeschwerden;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAkuteBeschwerden() {
        return akuteBeschwerden;
    }

    public void setAkuteBeschwerden(String akuteBeschwerden) {
        this.akuteBeschwerden = akuteBeschwerden;
    }

    public String getHauptBeschwerden() {
        return hauptBeschwerden;
    }

    public void setHauptBeschwerden(String hauptBeschwerden) {
        this.hauptBeschwerden = hauptBeschwerden;
    }
}
