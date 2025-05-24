package dev.java10x.cadastro_ninja.Ninjas;

import dev.java10x.cadastro_ninja.Ninjas.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}