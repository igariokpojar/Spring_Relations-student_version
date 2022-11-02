package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Address extends BaseEntity {


    private String description;
    private String zipCode;

    @JoinColumn(name = "state_id")
    @ManyToOne
    private State state;



}
