package br.com.fiap.mspedidos.repository;

import br.com.fiap.mspedidos.model.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 07/03/2024
 * Project Name: mspedidos
 */

@Repository
public interface PedidoRepository extends MongoRepository<Pedido, String> {
}
