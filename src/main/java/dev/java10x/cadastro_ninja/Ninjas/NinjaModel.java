package dev.java10x.cadastro_ninja.Ninjas;

import dev.java10x.cadastro_ninja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int idade;
    @ManyToOne ////ManyToOne um ninja tem uma unica missao
    @JoinColumn(name = "missoes_id") //chave estrangeira
    private MissoesModel missoes;


}
