package dev.java10x.cadastro_ninja.Missoes;

import dev.java10x.cadastro_ninja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDaMissao;
    private String rank;
    @OneToMany(mappedBy = "missoes") //muitos ninjas só podem ter uma missao
    private List<NinjaModel> ninja;

}
