package br.com.fabio.userapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "TB_USER")
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String password;
    private double hourlPrince;
}
