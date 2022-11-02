package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Role extends BaseEntity{


   // private Long id;
    private String name;
}
