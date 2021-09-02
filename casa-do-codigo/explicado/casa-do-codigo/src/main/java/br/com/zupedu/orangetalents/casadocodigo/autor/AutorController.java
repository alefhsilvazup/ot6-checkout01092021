package br.com.zupedu.orangetalents.casadocodigo.autor;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import javax.validation.Valid;
import java.util.Map;
import java.util.Optional;

@RequestMapping("/autores")
@RestController
public class AutorController {

    private final AutorRepository autorRepository;

    @Autowired
    public AutorController(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody @Valid AutorRequest autorRequest) {
        Autor autor = autorRepository.save(autorRequest.paraModelo());

        return Optional.of(autor)
                .map(autor1 -> ResponseEntity.ok(autor))
                .orElse(ResponseEntity.notFound().build());
        //return ResponseEntity.ok(new AutorResponse(autor));
    }

    @GetMapping
    public ResponseEntity<?> buscaInformacao() {
        return ResponseEntity.ok(Map.of("nome", "Alefh", "curso", "OTˆ"));
    }
}
