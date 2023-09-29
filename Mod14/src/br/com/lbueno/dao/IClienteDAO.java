package br.com.lbueno.dao;

import br.com.lbueno.domain.Cliente;

import java.util.Collection;

/**
 * @author l.bueno
 */
public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public Cliente excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
