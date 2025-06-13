package projetoFinal.steamRoxa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetoFinal.steamRoxa.model.Game;
import projetoFinal.steamRoxa.repository.GameRepository;

import java.util.List;
import java.util.Optional;
import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/jogos")
public class GameController {

    private final GameRepository repository;

    public GameController(GameRepository repository) {
        this.repository = repository;
    }

    // 1. Listar todos os jogos
    @GetMapping
    public List<Game> listarTodos() {
        return repository.findAll();
    }

    // 2. Adicionar novo jogo
    @PostMapping
    public Game adicionarGame(@RequestBody Game game) {
        return repository.save(game);
    }

    // 3. Buscar jogo por ID
    @GetMapping("/{id}")
    public ResponseEntity<Game> buscarPorId(@PathVariable Long id) {
        Optional<Game> jogo = repository.findById(id);
        return jogo.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // 4. Atualizar jogo existente
    @PutMapping("/{id}")
    public ResponseEntity<Game> atualizarJogo(@PathVariable Long id, @RequestBody Game dadosAtualizados) {
        return repository.findById(id).map(game -> {
            game.setTitulo(dadosAtualizados.getTitulo());
            game.setDesenvolvedora(dadosAtualizados.getDesenvolvedora()); // Adicionado
            game.setPlataforma(dadosAtualizados.getPlataforma());
            game.setGenero(dadosAtualizados.getGenero());
            game.setNota(dadosAtualizados.getNota());
            game.setPreco(dadosAtualizados.getPreco()); // Adicionado
            return ResponseEntity.ok(repository.save(game));
        }).orElse(ResponseEntity.notFound().build());
    }

    // 5. Deletar jogo por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarJogo(@PathVariable Long id) {
        return repository.findById(id).map(game -> {
            repository.delete(game);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }

    // 6. Buscar jogos por plataforma
    @GetMapping("/plataforma/{plataforma}")
    public List<Game> buscarPorPlataforma(@PathVariable String plataforma) {
        return repository.findByPlataformaIgnoreCase(plataforma);
    }
}
