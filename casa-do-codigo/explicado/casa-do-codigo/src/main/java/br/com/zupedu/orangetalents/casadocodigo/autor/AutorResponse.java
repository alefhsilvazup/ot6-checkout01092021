package br.com.zupedu.orangetalents.casadocodigo.autor;


import java.time.LocalDateTime;

public class AutorResponse {

    private final String nome, descricao, email;
    private final LocalDateTime criadoEm;
    private final Long id;

    public AutorResponse(Autor autor) {
        this.nome = autor.getNome();
        this.descricao = autor.getDescricao();
        this.email = autor.getEmail();
        this.criadoEm = autor.getCriadoEm();
        this.id = autor.getId();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public Long getId() {
        return id;
    }
}
