package dev.java10x.cadastro_ninja.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {

        this.ninjaRepository = ninjaRepository;
    }
    @Autowired
    private NinjaMapper ninjaMapper;

    // Listar todos os ninjas
    public List<NinjaDTO> listarTodosNinjas() {
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    // Listar todos os meus ninjas por ID
    public NinjaDTO listarNinjaPorID(Long id) {
        Optional<NinjaModel> ninjaId = ninjaRepository.findById(id);
        return ninjaId.map(ninjaMapper::map)
                .orElse(null);
    }

    // Criar Ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    // deletar Ninja
    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }

    // Atualizar Ninja
    public NinjaDTO atualizarNinja(Long id, NinjaDTO ninjaDTO) {
        Optional<NinjaModel> ninjaExistente = ninjaRepository.findById(id);
        if (ninjaExistente.isPresent()){
            NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
            ninjaAtualizado.setId(id);
            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtualizado);
            return ninjaMapper.map(ninjaSalvo);
        }
        return null;
    }

}
