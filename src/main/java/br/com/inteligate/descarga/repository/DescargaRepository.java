package br.com.inteligate.descarga.repository;

import br.com.inteligate.descarga.model.Descarga;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DescargaRepository extends MongoRepository<Descarga, String> {
}
