package dev.java10x.cadastro_ninja.Missoes;

import dev.java10x.cadastro_ninja.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDaMissao;
    private String rank;
    @OneToMany(mappedBy = "missoes") //muitos ninjas só podem ter uma missao
    private List<NinjaModel> ninja;

    public MissoesModel() {
    }

    public MissoesModel(String nomeDaMissao, String rank) {
        this.nomeDaMissao = nomeDaMissao;
        this.rank = rank;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nomeDaMissao;
    }

    public void setNome(String nome) {
        this.nomeDaMissao = nome;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
