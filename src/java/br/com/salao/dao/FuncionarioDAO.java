/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salao.dao;

import br.com.salao.vo.Funcionario;

/**
 *
 * @author Gabs
 */
public class FuncionarioDAO extends DAOGenerico <Funcionario>{
    public FuncionarioDAO(){
	super (Funcionario.class);
}
}
