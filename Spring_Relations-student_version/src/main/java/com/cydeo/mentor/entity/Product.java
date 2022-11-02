package com.cydeo.mentor.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Product extends BaseEntity {

    private String name;
    private double price;

     @ManyToOne
    private Category category;


}
