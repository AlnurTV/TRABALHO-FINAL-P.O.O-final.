package projetoFinal.steamRoxa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import projetoFinal.steamRoxa.model.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

    // Buscar jogos por plataforma (ignorando maiúsculas/minúsculas)
    List<Game> findByPlataformaIgnoreCase(String plataforma);
}
