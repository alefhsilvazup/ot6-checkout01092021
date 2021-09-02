package br.com.zupedu.orangetalents.casadocodigo.autor;

import org.springframework.data.repository.Repository;

public interface AutorRepository extends Repository<Autor, Long> {

    Autor save(Autor autor);
}
