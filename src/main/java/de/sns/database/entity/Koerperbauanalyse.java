package de.sns.database.entity;

import javax.persistence.*;

@Entity
@Table (name = "`Koerperbauanalyse`")
public class Koerperbauanalyse {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // TODO: Fragen und bearbeiten
    // TODO: Umbenennen
}
