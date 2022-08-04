package com.api.sorter.models.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "user")
@Entity
@Setter
@Getter
public class User implements Serializable {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @Column(name="name" ,length = 50 ,nullable = false)
   private String name;

   @Column(name="email" ,unique = true ,nullable = false)
   private String email;

   @Column(name = "password" ,nullable = false ,length = 255)
   private String password;

}
