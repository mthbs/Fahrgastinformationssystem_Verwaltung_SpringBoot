package com.maxcim.fahrgastinformationssystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
@Table(name = "abfahrt")
public class Abfahrt {

    @Id
    @Column(name = "abfahrt_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "abfahrt")
    private String abfahrt;

    @Column(name = "zugnr")
    private String linie;

    @Column(name = "gleis")
    private String gleis;

    @Column(name = "route_id")
    private String route_id;

}
