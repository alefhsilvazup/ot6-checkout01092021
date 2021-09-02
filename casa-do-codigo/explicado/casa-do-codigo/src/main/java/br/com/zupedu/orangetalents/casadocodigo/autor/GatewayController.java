package br.com.zupedu.orangetalents.casadocodigo.autor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GatewayController {

    @GetMapping("/cdc-banana/autores")
    public ResponseEntity<?> buscaInformacao() {
        return ResponseEntity.ok(Map.of("nome", "Alefh", "curso", "OTˆ"));
    }

}
