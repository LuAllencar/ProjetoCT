package br.com.projetoct.cursotecnico.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "professores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProfessor;

    @Column(nullable = false, length = 80)
    private String nomeProfessor;

    @Column(nullable = false, length = 40)
    private String enderecoProfessor;

    @Column(nullable = false, length = 120)
    private String graduacaoProfessor;

    @Column(nullable = false, length = 40)
    private String categoriaProfessor;
}
