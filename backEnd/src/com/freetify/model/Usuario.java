package com.freetify.model;

public class Usuario {

  private int id;
  private String nome;
  private String biografia;
  private String caminhoFotoPerfil;

  public Usuario(int id, String nome, String biografia, String caminhoFotoPerfil) {

    this.id = id;
    this.nome = nome;
    this.biografia = biografia;
    this.caminhoFotoPerfil = caminhoFotoPerfil;

  }

  public Usuario() {

  }

  public void setID(int id) {
    this.id = id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setBiografia(String biografia) {
    this.biografia = biografia;
  }

  public void setCaminhoFotoPerfil(String caminhoFotoPerfil) {
    this.caminhoFotoPerfil = caminhoFotoPerfil;
  }

  public int getID() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getBiografia() {
    return biografia;
  }

  public String getCaminhoFotoPerfil() {
    return caminhoFotoPerfil;
  }

}
