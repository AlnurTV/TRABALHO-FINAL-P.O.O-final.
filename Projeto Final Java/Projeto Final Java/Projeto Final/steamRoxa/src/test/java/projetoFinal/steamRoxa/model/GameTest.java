package projetoFinal.steamRoxa.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @BeforeEach
    void setUp() {
        System.out.println("\n=== Preparando novo teste ===");
    }

    @Test
    void testDefaultConstructorAndSettersGetters() {
        System.out.println("Testando construtor padrão, setters e getters...");

        Game game = new Game();

        // Inicialmente, todos os campos devem ser null
        assertNull(game.getId());
        assertNull(game.getTitulo());
        System.out.println("✔ Campos nulos inicializados corretamente");

        // Agora setamos valores
        game.setId(42L);
        game.setTitulo("Crono Trigger");
        game.setDesenvolvedora("Square");
        game.setPlataforma("SNES");
        game.setGenero("RPG");
        game.setNota(9.5);
        game.setPreco(79.90);

        // Verificamos via getters
        assertEquals(42L, game.getId());
        assertEquals("Crono Trigger", game.getTitulo());
        assertEquals("Square", game.getDesenvolvedora());
        assertEquals("SNES", game.getPlataforma());
        assertEquals("RPG", game.getGenero());
        assertEquals(9.5, game.getNota());
        assertEquals(79.90, game.getPreco());

        System.out.println("✔ Valores atribuídos e verificados com sucesso!");
    }

    @Test
    void testEqualsAndHashCode() {
        System.out.println("Testando equals() e hashCode()...");

        Game g1 = new Game();
        Game g2 = new Game();

        // Damos os mesmos valores a g1 e g2
        g1.setId(1L);
        g1.setTitulo("Hollow Knight");
        g2.setId(1L);
        g2.setTitulo("Hollow Knight");

        // equals() e hashCode() devem considerar esses campos
        assertEquals(g1, g2, "Objetos com mesmos campos devem ser iguais");
        assertEquals(g1.hashCode(), g2.hashCode(), "hashCode também deve ser igual");

        System.out.println("✔ equals() e hashCode() funcionam corretamente");
    }

    @Test
    void testToStringContainsAllFields() {
        System.out.println("Testando toString()...");

        Game game = new Game();
        game.setId(7L);
        game.setTitulo("Celeste");
        game.setDesenvolvedora("Matt Makes Games");
        game.setPlataforma("PC");
        game.setGenero("Plataforma");
        game.setNota(10.0);
        game.setPreco(29.99);

        String asString = game.toString();

        // Verifica se o toString contém os valores esperados
        assertTrue(asString.contains("id=7"), "toString deve conter id=7");
        assertTrue(asString.contains("titulo=Celeste"), "toString deve conter titulo=Celeste");
        assertTrue(asString.contains("desenvolvedora=Matt Makes Games"), "toString deve conter desenvolvedora");
        assertTrue(asString.contains("plataforma=PC"), "toString deve conter plataforma");
        assertTrue(asString.contains("genero=Plataforma"), "toString deve conter genero");
        assertTrue(asString.contains("nota=10.0"), "toString deve conter nota");
        assertTrue(asString.contains("preco=29.99"), "toString deve conter preco");

        System.out.println("✔ toString() contém todos os campos esperados");
        System.out.println("Conteúdo de toString(): " + asString); // Opcional: Mostra o toString() gerado
    }
}