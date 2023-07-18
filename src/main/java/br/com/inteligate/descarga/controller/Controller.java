package br.com.inteligate.descarga.controller;

import br.com.inteligate.descarga.model.Descarga;
import br.com.inteligate.descarga.service.DescargaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/descarga")
public class Controller {

    @Autowired
    private DescargaService descargaService;

    @PostMapping
    public Descarga criarDescarga(@RequestBody Descarga descarga){
        return descargaService.salvar(descarga);
    }

    @GetMapping
    public List<Descarga> findAll(){
        return descargaService.findAll();
    }

    @GetMapping("/{placa}")
    public Descarga findByPlaca(@PathVariable("placa") String placa){
        return descargaService.findByPlaca(placa);
    }
}
