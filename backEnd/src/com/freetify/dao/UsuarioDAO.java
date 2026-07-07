package com.freetify.dao;

import com.freetify.config.ConnectionFactory;
import java.sql.Connection;

public class UsuarioDAO {

  private Connection conexao;

  public UsuarioDAO() {

    this.conexao = ConnectionFactory.getConnection();

  }

}