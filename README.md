# Nxported

O Nxported é um projeto de estudo em Java para reunir, em um só lugar, o
download autorizado de vídeos públicos de diferentes redes sociais.

A primeira versão terá suporte a links públicos do TikTok e do Instagram. O
acesso a conteúdos privados e qualquer tentativa de contornar autenticação não
fazem parte do escopo do projeto.

## Estado atual

O núcleo inicial em Java já consegue:

- validar se uma URL foi informada;
- identificar links do Instagram;
- identificar links do TikTok;
- rejeitar plataformas não suportadas;
- verificar esses comportamentos com testes automatizados.

O download e o processamento dos vídeos ainda não foram implementados. A
evolução será incremental para que cada conceito possa ser estudado e testado.

## Tecnologias

- Java 21
- Maven
- JUnit 5
- Spring Boot em uma fase futura
- FFmpeg em uma fase futura

## Estrutura do projeto

```text
src/
├── main/java/br/com/nicolas/nxported/
│   ├── Main.java
│   ├── exception/  Erros de domínio
│   ├── extractor/  Contratos e integrações com as plataformas
│   ├── model/      Objetos e enums da aplicação
│   └── service/    Validações e regras da aplicação
└── test/java/br/com/nicolas/nxported/
    └── service/    Testes dos serviços
```

## Primeira etapa

- [x] Receber uma URL.
- [x] Rejeitar uma URL vazia.
- [x] Identificar TikTok ou Instagram.
- [x] Rejeitar plataformas não suportadas.
- [x] Cobrir o comportamento atual com testes automatizados.
- [ ] Validar a estrutura completa da URL.
- [ ] Criar exceções específicas do domínio.

Consulte o caminho completo de aprendizado em
[`docs/roadmap.md`](docs/roadmap.md).

## Como executar

Requisitos:

- JDK 21
- Maven 3.9 ou superior

Execute os testes:

```bash
mvn clean test
```

Compile e execute a aplicação:

```bash
mvn package
java -cp target/classes br.com.nicolas.nxported.Main
```

## Uso responsável

Use o Nxported somente com conteúdo próprio ou quando tiver autorização do
autor. Cada usuário é responsável por respeitar direitos autorais e os termos
de uso de cada plataforma.
