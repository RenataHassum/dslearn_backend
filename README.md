### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com

# Sobre o projeto DSLearn [![NPM](https://img.shields.io/npm/l/react)](https://github.com/RenataHassum/dslearn_backend/blob/main/LICENSE)

Utilizando um modelo de domínio complexo, o DSLearn é um projeto backend desenvolvido com Spring Boot que implementa uma plataforma de ensino online. Seguindo as melhores práticas, ele oferece uma solução abrangente para gerenciar cursos, turmas, alunos e um fórum de perguntas e respostas.

Os cursos são organizados em seções e incluem trilhas de aprendizado, bônus, links externos e aulas em diferentes formatos. O sistema possui funcionalidades essenciais, como autenticação, autorização e operações CRUD completas para gerenciar recursos.

Além disso, o DSLearn oferece recursos como matrícula, aulas com entrega e correção, e notificações de leitura. Este projeto foi desenvolvido como parte do Bootcamp Spring da instituição de ensino <a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a>

# Teste as requisições no Postman Collection
#### Siga o passo a passo:
1) Faça o clone do projeto
```bash
# Pré-requisitos: Java 17
# clonar repositório
git clone git@github.com:RenataHassum/dslearn_backend.git

# entrar na pasta do projeto back end
cd dslearn_backend
cd backend

# executar o projeto
./mvnw spring-boot:run
```
2) Clique no botão "Run in Postman"
3) Acesse a opção "View collection"
4) Teste as requisições conforme orientações abaixo
   
      [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/22138191-979c6818-ba5f-4099-a756-00d3a37c4704?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D22138191-979c6818-ba5f-4099-a756-00d3a37c4704%26entityType%3Dcollection%26workspaceId%3D971d952a-dbd9-4ab4-b24a-788c15b34916#?env%5Bbootcamp-DSLearn%5D=W3sia2V5IjoiaG9zdCIsInZhbHVlIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifSx7ImtleSI6ImNsaWVudC1pZCIsInZhbHVlIjoiZHNsZWFybiIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0In0seyJrZXkiOiJjbGllbnQtc2VjcmV0IiwidmFsdWUiOiJkc2xlYXJuMTIzIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifSx7ImtleSI6InVzZXJuYW1lIiwidmFsdWUiOiJhbGV4QGdtYWlsLmNvbSIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0In0seyJrZXkiOiJwYXNzd29yZCIsInZhbHVlIjoiMTIzNDU2IiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifSx7ImtleSI6InRva2VuIiwidmFsdWUiOiIiLCJlbmFibGVkIjp0cnVlLCJ0eXBlIjoiZGVmYXVsdCJ9LHsia2V5IjoicmVmcmVzaF90b2tlbiIsInZhbHVlIjoiIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifV0=)

## Login endpoints
#### Escolha o ambiente do projeto: "dsLearn" (lembre-se de substituir os emails para login)

`POST` Permite efetuar o login de um usuário. Utilize as seguintes credenciais para teste:
- maria@gmail.com
  - Funções: "ROLE_ADMIN"
  - Acesso: Liberado

- bob@gmail.com
  - Funções: "ROLE_INSTRUCTOR"
  - Acesso: Intermediário

- alex@gmail.com
  - Funções: "ROLE_STUDENT"
  - Acesso: Restrito

## User endpoints
`GET User by ID`
- Liberado para o próprio usuário com "ROLE_STUDENT" e para "ROLE_ADMIN" com acesso adicional
- Retorna informações de um usuário específico

## Deliver endpoints
`POST Save revision task`
- Restrito a usuários com função "ROLE_STUDENT"
- Liberado para usuários com função "ROLE_INSTRUCTOR" e "ROLE_ADMIN"
- Permite que o professor responsável atualize uma tarefa

## Notification endpoints
`GET Notifications for current user`
- Liberado para o usuário logado com função "ROLE_STUDENT"
- Permite visualizar notificações pessoais do usuário logado, sem informar o ID

# Tecnologias | Implantação em produção
- Java, Spring Boot, Spring Cloud, Spring Security, OAuth2, JWT, API REST, JPA, Hibernate, Maven, H2 Database, PostgreSQL, ORM, Git
- Implantação Backend: Até o presente momento, o projeto não conta com a implementação no backend em uma plataforma de hospedagem
- Implantação banco de dados: Postgresql

# Técnicas | Competências
- Programação Orientada a Objetos (POO) e Seed de Banco de Dados: Permite o desenvolvimento eficiente de um sistema orientado a objetos e a criação de um modelo conceitual representando entidades e relacionamentos.
- Arquitetura em Camadas: Utiliza uma estrutura organizada em camadas, proporcionando separação clara de responsabilidades e facilitando a manutenibilidade do sistema.
- Web Services RESTful: Implementa web services RESTful, seguindo o padrão DTO para transferência de dados.
- Tratamento de Exceções: Implementa mecanismos de tratamento de exceções, garantindo mensagens de erro claras para os usuários.
- Paginação de Dados: Implementa técnicas de paginação para otimizar o desempenho e viabilizar a navegação eficiente em conjuntos de dados extensos.
- Autenticação e Autorização: Implementa OAuth2 e JWT para autenticação e autorização segura dos usuários.
- Refresh Token e Password Token: Utiliza tokens para garantir a autenticação contínua e segura dos usuários, permitindo a renovação do acesso e a redefinição da senha de forma segura.
- Autorizações Personalizadas: Realiza pré-autorização de métodos sensíveis, restringindo o acesso apenas a usuários autorizados.
- Consultas ao Banco de Dados com JPQL: Realiza consultas ao banco de dados utilizando a linguagem de consulta JPQL.

## Figma Frontend
https://www.figma.com/file/p8Hawp1w5g0pCZ3h3ZsCUd/DSLearn-Bootcamp?type=design&node-id=0-1&mode=design&t=uQs8oG31lR6cXNqu-0

## Modelo conceitual
![Modelo Conceitual](https://github.com/RenataHassum/assets/blob/main/dslearn_assets/modelo%20conceitual.jpg?raw=true)

## Padrão camadas
![Padrão camadas](https://github.com/RenataHassum/assets/blob/main/padrao_camadas.jpg?raw=true)

# Agradecimentos
<a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> - Professor Nélio Alves

# Autora
### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com
Fico à disposição para qualquer esclarecimento, não hesite em me contatar
