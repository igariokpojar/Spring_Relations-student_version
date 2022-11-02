package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Invoice_Product extends BaseEntity{

    private int quantity;
    private double profit;

@JoinColumn (name = "invoice_id")
@ManyToOne
    private Invoice invoice;

@JoinColumn(name = "product_id")
@ManyToOne
    private Product product;


}
