package br.com.zupedu.orangetalents.casadocodigo.autor;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AutorRequest {

    @NotBlank
    @Email
    private final String email;
    @NotBlank
    private final String nome;
    @NotBlank
    @Size(max = 400)
    private final String descricao;

    public AutorRequest(String email, String nome, String descricao) {
        this.email = email;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Autor paraModelo() {
        return new Autor(this.nome, this.email, this.descricao);
    }
}
