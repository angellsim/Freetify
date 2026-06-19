# 📋 Spec-Kit — Freetify

> **Documento vivo.** Deve ser atualizado a cada decisão arquitetural relevante.  
> **Para IAs:** Leia este documento inteiro antes de responder qualquer pergunta sobre o projeto.

---

## 🎯 Visão do Produto

**Freetify** é um aplicativo de streaming de música inspirado no Spotify, desenvolvido como projeto pessoal de aprendizado de Engenharia de Software.

> ⚠️ O projeto é o **veículo de aprendizado**, não o objetivo final. A prioridade é o desenvolvimento da desenvolvedora, não a entrega do produto.

---

## 👩‍💻 Contexto de Aprendizado

- **Estudante:** Alice (ADS — Análise e Desenvolvimento de Sistemas)
- **Nível atual:** Iniciante com experiência prévia em Java (JDBC, DAO, MVC), MySQL e Vue.js
- **Objetivo de aprendizado:** Tornar-se uma engenheira capaz de projetar, construir, manter e evoluir qualquer software de forma autônoma
- **Mentora/IA:** Atua como professora universitária + desenvolvedora sênior + Tech Lead + mentora de carreira
- **Método:** Socrático — a IA **nunca** escreve código, pseudocódigo ou algoritmos. Apenas explica conceitos, faz perguntas, sugere pesquisas e orienta raciocínio.

---

## 🏗️ Stack Tecnológica

| Camada | Tecnologia | Justificativa |
|---|---|---|
| Front-End | Vue.js 3 + TypeScript + Vite | Já iniciado; familiaridade da desenvolvedora |
| Back-End | Java (puro, sem framework) | Familiaridade com Java via projetos acadêmicos |
| Banco de Dados | SQLite (via JDBC) | Simplicidade para fase inicial; local-first |
| Comunicação | A definir | API REST provável; não decidida ainda |

---

## 📁 Estrutura do Repositório

```
Freetify/
├── Freetify/          ← Front-End (Vue.js + Vite + TypeScript)
├── backEnd/           ← Back-End (Java puro + JDBC + SQLite)
│   ├── src/
│   │   └── com/freetify/
│   │       ├── Main.java
│   │       └── config/
│   │           └── ConnectionFactory.java
│   └── lib/
└── docs/
    ├── spec-kit.md    ← este arquivo
    └── diario.md      ← diário de engenharia da Alice
```

---

## ✅ Requisitos

### Funcionais (MVP 1.0)
- [x] Fazer upload de músicas locais
- [x] Player básico: tocar, parar, pular, voltar
- [x] Gerenciar playlists (criar, editar, excluir)
- [x] Adicionar e remover músicas de playlists

### Não Funcionais
- [x] Local-first: Dados e arquivos ficam na máquina do usuário
- [x] Autenticação adiada: Início sem login, foco apenas na experiência local

---

## 🏛️ Decisões Arquiteturais

| Data | Decisão | Alternativas Consideradas | Justificativa |
|---|---|---|---|
| 2026-06-17 | Back-end em Java puro (sem Spring) | Spring Boot | Familiaridade; aprendizado gradual sem abstração excessiva |
| 2026-06-17 | Banco de dados SQLite | MySQL, PostgreSQL | Simplicidade local-first; sem necessidade de servidor de banco |
| 2026-06-18 | Documentação em `docs/` na raiz | Wiki do GitHub, site externo | Viaja junto com o código; acessível a qualquer dev/IA |

---

## ⚠️ Riscos Conhecidos

- Comunicação Front-End ↔ Back-End ainda não definida (REST? GraphQL? outro?)
- Ausência de testes automatizados até o momento
- Estrutura de pacotes do back-end ainda em estágio inicial
- Requisitos funcionais não foram formalmente levantados

---

## 🗄️ Modelo de Dados (MVP)

> Documentado no detalhe no `diario.md`.

- **Usuario** (1:N com Playlist)
- **Playlist** (N:N com Musica)
- **Musica**
- **PlaylistMusica** (Tabela associativa com posição e data de adição)

---

## ❓ Dúvidas em Aberto

- Em qual pasta específica do computador os arquivos de áudio físicos (`.mp3`, etc) serão salvos quando o usuário fizer upload?
A pasta deve ser nomeada apenas como audio para ser bem facil de identificar
- Como será a organização dos pacotes do Java (Arquitetura em Camadas, MVC, Clean Architecture)?
- Como rodar e testar os endpoints da API Java antes do Front-End estar pronto?

---

## 🗺️ Trilha de Aprendizado (Progressão Adaptativa)

### Nível 1 — Fundamentos (atual)
- [x] Estrutura de projetos
- [x] Persistência de dados (JDBC/SQLite)
- [x] Orientação a objetos básica
- [ ] Levantamento e análise de requisitos
- [ ] Modelagem de dados

### Nível 2 — Arquitetura e Integração
- [ ] Arquitetura em camadas (MVC, DAO)
- [ ] APIs REST
- [ ] Comunicação Front-Back
- [ ] Testes automatizados
- [ ] Modelagem UML

### Nível 3 — Qualidade e Evolução
- [ ] Escalabilidade
- [ ] Segurança
- [ ] Performance
- [ ] Refatoração

### Nível 4 — Sistemas Avançados
- [ ] Sistemas distribuídos
- [ ] Observabilidade
- [ ] Design avançado de software

---

## 📌 Próximos Passos

1. Alice define a **visão do produto** (o que é o Freetify, para quem, qual o MVP)
2. Levantar e documentar os **requisitos funcionais e não funcionais**
3. Modelar o **banco de dados** (entidades, relacionamentos)
4. Definir o **protocolo de comunicação** entre front-end e back-end
5. Estruturar os **pacotes do back-end** seguindo boas práticas

---

## 📜 Histórico de Conversas Relevantes

| ID | Título | Resumo |
|---|---|---|
| b1128637 | Planning The Freetify Application | Primeira definição do projeto; stack inicial discutida |
| b5bde7df | Setting Up BackEnd Environment | Estrutura do back-end criada; ConnectionFactory com SQLite |
| a6d64af6 | Onboarding da Mentora | Regras de mentoria estabelecidas; docs/ criada |

---

*Última atualização: 2026-06-18*
