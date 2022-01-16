package de.sns.database.entity;

import javax.persistence.*;

@Entity
@Table (name = "`Ziele`")
public class Ziele {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // TODO: String einfügen
}
