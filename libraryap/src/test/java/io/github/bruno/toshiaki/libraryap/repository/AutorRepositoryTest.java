package io.github.bruno.toshiaki.libraryap.repository;

import io.github.bruno.toshiaki.libraryap.model.Autor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class AutorRepositoryTest {

    @Autowired
    private AutorRepository autorRepository;

    @Test
    void salvarAutor() {
        var autor = new Autor();
        autor.setNome("José");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of(1990, 1, 1));
        var autorSavlo = autorRepository.save(autor);
        System.out.println("Autor salvo com sucesso! " + autorSavlo);
      assertNotNull(autorSavlo.getId());
    }
}