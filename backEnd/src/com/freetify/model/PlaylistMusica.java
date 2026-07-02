package com.freetify.model;

import java.time.LocalDateTime;

public class PlaylistMusica {

  private Musica musica;
  private Playlist playlist;
  private int posicao;
  private LocalDateTime dataAdicao;

  public PlaylistMusica(Musica musica, Playlist playlist, int posicao, LocalDateTime dataAdicao){
    this.musica = musica;
    this.playlist = playlist;
    this.posicao = posicao;
    this.dataAdicao = dataAdicao;
  }

  public void setMusica(Musica musica){ this.musica = musica; }
  public void setPlaylist(Playlist playlist){ this.playlist = playlist; }
  public void setPosicao(int posicao){ this.posicao = posicao; }
  public void setDataAdicao(LocalDateTime dataAdicao){ this.dataAdicao = dataAdicao; }

  public Musica getMusica(){ return musica; }
  public Playlist getPlaylist(){ return playlist; }
  public int getPosicao(){ return posicao; }
  public LocalDateTime getDataAdicao(){ return dataAdicao; }
}
