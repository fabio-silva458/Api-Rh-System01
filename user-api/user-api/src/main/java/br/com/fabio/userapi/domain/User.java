package br.com.fabio.userapi.domain;

import lombok.*;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.EqualsAndHashCode.Include;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "TB_USER")
public class User {


    @Include
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String password;
    private double hourlyPrince;


}
