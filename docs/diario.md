18/06/2026

Modelo do Banco de Dados
Usuario (id, nome, foto_perfil, biografia)
Musica (id, nome, imagem, cantor, caminho_arquivo, duracao, id_usuario)
Playlist (id, nome, imagem, descricao, data_criacao, id_usuario)
PlaylistMusica(id_playlist, id_musica, posicao, data_adicao)

- Como o front-end Vue.js irá se comunicar com o back-end Java?
Será utilizado o protocolo HTTP com requisições GET, PUT, POST e PATCH para ter a comunicação entre o back-end 
e front-end
- Qual será o protocolo de comunicação (HTTP/REST)?
Protocolo HTTP
- Qual é o MVP do Freetify? Quais funcionalidades entram na primeira versão?
1. Precisa armazenar, tocar, parar, excluir e passar as músicas que os próprios usuários fazem upload
2. Musicas, playlists e historico devem ser salvos dentro da maquina do usuario. Sem utilizacao de banco de dados 
inicialmente.
3. Usuários devem conseguir navegar pelas suas músicas através de playlists altamente personalizáveis 
- Haverá autenticação de usuários?
No início não mas posteriormente sim para criar uma espécie de comunidade.
- Como as músicas serão armazenadas e servidas?
As músicas devem ser armazenadas localmente na máquina dos usuários utilizando SQLite.