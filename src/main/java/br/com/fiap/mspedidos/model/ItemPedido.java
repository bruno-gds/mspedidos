package br.com.fiap.mspedidos.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 07/03/2024
 * Project Name: mspedidos
 */

@Data
@AllArgsConstructor
public class ItemPedido {

    private Integer idProduto;
    private int quantidade;
}
