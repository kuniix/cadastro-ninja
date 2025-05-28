package dev.java10x.cadastro_ninja.Ninjas;

import dev.java10x.cadastro_ninja.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private Long id;
    private String name;
    private String email;
    private int idade;
    private String string;
    private MissoesModel missoes;
    private String rank;
}
