package io.github.bruno.toshiaki.libraryap.repository;

import io.github.bruno.toshiaki.libraryap.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
}
