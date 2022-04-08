package org.generation.lojadegames.repository;

import java.util.Optional;

import org.generation.lojadegames.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByUsuario(String usuario);
	// Optional - quando não sabemos a resposta que virá, para buscar usuário
}
