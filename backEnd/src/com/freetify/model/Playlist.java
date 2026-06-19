package com.freetify.model;

import java.time.LocalDateTime;

public class Playlist {
  
  private int id;
  private String nome;
  private String caminhoImagem;
  private String descricao;
  private LocalDateTime dataCriacao;
  private Usuario usuario;

  public Playlist(int id, String nome, String caminhoImagem, String descricao, LocalDateTime dataCriacao, Usuario usuario) {
    this.id = id;
    this.nome = nome;
    this.caminhoImagem = caminhoImagem;
    this.descricao = descricao;
    this.dataCriacao = dataCriacao;
    this.usuario = usuario;
  }

  public void setID(int id) { this.id = id; }
  public void setNome(String nome) { this.nome = nome; }
  public void setCaminhoImagem(String caminhoImagem) { this.caminhoImagem = caminhoImagem; }
  public void setDescricao(String descricao) { this.descricao = descricao; }
  public void setDataCriacao(LocalDateTime dataCriacao) { this.dataCriacao = dataCriacao; }
  public void setUsuario(Usuario usuario) { this.usuario = usuario; }

  public int getID() { return id; }
  public String getNome(){  return nome; }
  public String getCaminhoImagem() { return caminhoImagem; }
  public String getDescricao() { return descricao; }
  public LocalDateTime getDataCriacao() { return dataCriacao; }
  public Usuario getUsuario() { return usuario; }


}
