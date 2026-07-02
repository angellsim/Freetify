package com.freetify.model;

public class Musica {

  private int id;
  private String nome;
  private String caminhoImagem;
  private String cantor;
  private String caminhoArquivo;
  private Usuario usuario;
  private int duracao;

  public Musica(int id, String nome, String caminhoImagem, String cantor, String caminhoArquivo, Usuario usuario, int duracao){
    this.id = id;
    this.nome = nome;
    this.caminhoImagem = caminhoImagem;
    this.cantor = cantor;
    this.caminhoArquivo = caminhoArquivo;
    this.usuario = usuario;
    this.duracao = duracao;
  }

  public void setID(int id){ this.id = id; }
  public void setNome(String nome){ this.nome = nome; }
  public void setCaminhoImagem(String caminhoImagem){ this.caminhoImagem = caminhoImagem; }
  public void setCantor(String cantor){ this.cantor = cantor; }
  public void setCaminhoArquivo(String caminhoArquivo){ this.caminhoArquivo = caminhoArquivo; }
  public void setUsuario(Usuario usuario){ this.usuario = usuario; }
  public void setDuracao(int duracao){ this.duracao = duracao; }

  public int getID(){ return id; }
  public String getNome() { return nome; }
  public String getCaminhoImagem() { return caminhoImagem; }
  public String getCantor() { return cantor; }
  public String getCaminhoArquivo() { return caminhoArquivo; }
  public Usuario getUsuario() { return usuario; }
  public int getDuracao() { return duracao; }
}
