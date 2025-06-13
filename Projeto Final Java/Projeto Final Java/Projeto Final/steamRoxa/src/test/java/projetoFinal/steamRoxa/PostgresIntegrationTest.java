package projetoFinal.steamRoxa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import projetoFinal.steamRoxa.model.Game;
import projetoFinal.steamRoxa.repository.GameRepository;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PostgresIntegrationTest {

    @Autowired
    private GameRepository repository;

    @Test
    void deveSalvarJogoNoPostgres() {
        Game game = new Game();
        game.setTitulo("Cyberpunk 2077");
        game.setDesenvolvedora("CD Projekt Red");
        game.setPlataforma("PC");
        game.setGenero("RPG");
        game.setNota(8.5);
        game.setPreco(149.90);

        Game saved = repository.save(game);

        assertThat(saved.getId()).isNotNull();
        assertThat(repository.count()).isGreaterThan(0);
    }
}