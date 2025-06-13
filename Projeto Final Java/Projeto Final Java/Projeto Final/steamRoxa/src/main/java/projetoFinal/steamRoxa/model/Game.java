package projetoFinal.steamRoxa.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal; // Importe BigDecimal

@Data
@Entity
@Table(name = "jogos")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String desenvolvedora;
    private String plataforma;
    private String genero;

    // Use BigDecimal para campos que precisam de precisão decimal
    @Column(precision = 3, scale = 1)
    private BigDecimal nota; // Alterado de Double para BigDecimal

    @Column(precision = 10, scale = 2)
    private BigDecimal preco; // Alterado de Double para BigDecimal
}