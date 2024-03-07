package br.com.fiap.mspedidos.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 07/03/2024
 * Project Name: mspedidos
 */

@Data
@Document(collection = "pedido")
public class Pedido {

    @Id
    private String id;
    private String nomeCliente;
    private List<ItemPedido> itensPedido;
    private double valorTotal;
}
