# Roadmap de aprendizado do Nxported

Este roadmap mantém o projeto útil enquanto introduz um grupo de conceitos por
vez. Cada fase deve ser compreendida e testada antes do avanço para a próxima.

## Fase 1 — Núcleo Java

- [x] Modelar as plataformas suportadas com um enum.
- [x] Rejeitar URLs vazias.
- [x] Detectar a plataforma a partir de uma URL.
- [x] Rejeitar plataformas não suportadas.
- [x] Adicionar testes unitários com JUnit.
- [ ] Validar a estrutura completa da URL.
- [ ] Criar exceções específicas do domínio.

**Foco do aprendizado:** classes, métodos, enums, exceções, pacotes e testes.

## Fase 2 — Limite de extração

- [ ] Definir um contrato comum para os extratores.
- [ ] Implementar um extrator para cada plataforma.
- [ ] Manter isoladas as regras específicas de cada plataforma.
- [ ] Representar os metadados do vídeo no domínio.

**Foco do aprendizado:** interfaces, polimorfismo, coesão e baixo acoplamento.

## Fase 3 — Processos externos e HTTP

- [ ] Fazer requisições HTTP quando autorizadas.
- [ ] Integrar a ferramenta de mídia escolhida.
- [ ] Usar FFmpeg nas conversões suportadas.
- [ ] Gerenciar arquivos temporários com segurança.

**Foco do aprendizado:** HTTP, JSON, processos, arquivos e tratamento de erros.

## Fase 4 — API REST

- [ ] Adicionar Spring Boot.
- [ ] Criar controllers, DTOs e services.
- [ ] Retornar erros consistentes.
- [ ] Documentar a API.

**Foco do aprendizado:** REST, injeção de dependência e camadas da aplicação.

## Fase 5 — Interface web

- [ ] Criar o formulário para receber a URL.
- [ ] Exibir os estados de validação e processamento.
- [ ] Mostrar os metadados do vídeo.
- [ ] Disponibilizar o download autorizado.

**Foco do aprendizado:** integração com o front-end e experiência do usuário.

## Fase 6 — Preparação para produção

- [ ] Adicionar limitação de requisições.
- [ ] Criar uma fila de processamento, se necessário.
- [ ] Apagar automaticamente os arquivos temporários.
- [ ] Adicionar monitoramento e documentação de implantação.
