package io.github.bruno.toshiaki.libraryap.repository;

import io.github.bruno.toshiaki.libraryap.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;


public interface AutorRepository extends JpaRepository<Autor, UUID> {
}
