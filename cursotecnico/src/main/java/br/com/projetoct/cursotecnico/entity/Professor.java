package br.com.projetoct.cursotecnico.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Professor {
    
    // Para a definição dos atributos relacionados a essa entidade

    @Id
    @GeneratedValue (strategy= GenerationType.AUTO)
        private Integer idProfessor;

    @Column (nullable=false, length=40)
        private String nomeProfessor;

    @Column (nullable=false, length=40)
        private String enderecoProfessor;

    @Column (nullable=false, length=120)
        private String graduacaoProfessor;

    @Column (nullable=false, length=40)
        private String categoriaProfessor;

}
