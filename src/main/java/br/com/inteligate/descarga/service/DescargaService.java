package br.com.inteligate.descarga.service;

import br.com.inteligate.descarga.model.Descarga;
import br.com.inteligate.descarga.repository.DescargaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DescargaService {

    @Autowired
    private DescargaRepository descargaRepository;

    public Descarga salvar(Descarga descarga) {
        descarga.setDataHora(LocalDateTime.now());
        descargaRepository.save(descarga);
        return descarga;
    }

    public Descarga findByPlaca(String placa) {
        return descargaRepository.findById(placa).orElse(null);
    }

    public void delete(String placa) {
        descargaRepository.deleteById(placa);
    }

    public List<Descarga> findAll() {
        return descargaRepository.findAll();
    }
}
