package de.sns.database.entity;

import javax.persistence.*;

@Entity
@Table (name = "`Koerperaufbauanalyse`")
public class Koerperaufbauanalyse {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // TODO: Fragen und bearbeiten
    // TODO: Umbenennen
}
