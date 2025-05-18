package dev.java10x.cadastro_ninja.Ninjas;

import dev.java10x.cadastro_ninja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String name;
    @Column(unique = true) //não pode ter dois ninjas com o mesmo email
    private String email;
    @Column(name = "idade")
    private int idade;
    @Column(name = "img_url")
    private String string;
    @ManyToOne ////ManyToOne um ninja tem uma unica missao
    @JoinColumn(name = "missoes_id") //chave estrangeira
    private MissoesModel missoes;
}
