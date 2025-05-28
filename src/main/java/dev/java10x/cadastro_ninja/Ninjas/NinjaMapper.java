package dev.java10x.cadastro_ninja.Ninjas;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {
    public NinjaModel map(NinjaDTO ninjaDTO) {
        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjaModel.getId());
        ninjaModel.setName(ninjaDTO.getName());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setString(ninjaDTO.getString());
        ninjaModel.setRank(ninjaDTO.getRank());
        ninjaModel.setMissoes(ninjaDTO.getMissoes());

        return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel) {
        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setName(ninjaModel.getName());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setString(ninjaModel.getString());
        ninjaDTO.setRank(ninjaModel.getRank());
        ninjaDTO.setMissoes(ninjaModel.getMissoes());

        return ninjaDTO;
    }
}
