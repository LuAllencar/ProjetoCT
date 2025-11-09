# 👨‍🏫 ProjetoCT - Sistema de Gestão de Professores

![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![H2](https://img.shields.io/badge/H2-0000BB?style=for-the-badge&logo=h2&logoColor=white)

> API REST simples para gerenciamento de professores de cursos técnicos

## 📋 Sobre o Projeto

**ProjetoCT** (Projeto Curso Técnico) é minha primeira API REST desenvolvida individualmente como exercício prático na disciplina de Sistemas Web da ETEC Fernandópolis. O projeto implementa um CRUD completo para gerenciamento de professores, servindo como base de aprendizado para conceitos fundamentais de APIs RESTful.

### 🎯 Contexto

Este projeto foi desenvolvido **depois do [SistWeb](https://github.com/LuAllencar/SistWeb)**, porém o **[SistWeb](https://github.com/LuAllencar/SistWeb)** segue tendo atualizações, sendo minha primeira experiência individual criando uma API do zero. Cada aluno da turma criou sua própria API com um tema diferente - o meu ficou focado em **Cursos Técnicos**, especificamente no cadastro de professores.

## ✨ Funcionalidades

- ✅ **Cadastrar Professor** - Adicionar novos professores ao sistema
- ✅ **Listar Professores** - Visualizar todos os professores cadastrados
- ✅ **Buscar por ID** - Consultar dados de um professor específico
- ✅ **Atualizar Professor** - Editar informações de professores existentes
- ✅ **Deletar Professor** - Remover professores do sistema

## 🛠️ Tecnologias Utilizadas

- **Java 17** - Linguagem de programação
- **Spring Boot 3.x** - Framework para desenvolvimento da API
- **Spring Data JPA** - Abstração para acesso ao banco de dados
- **H2 Database** - Banco de dados em memória
- **Maven** - Gerenciamento de dependências

## 📁 Estrutura do Projeto

```
ProjetoCT/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/projetoct/
│   │   │       ├── controller/
│   │   │       │   └── ProfessorController.java
│   │   │       ├── model/
│   │   │       │   └── Professor.java
│   │   │       ├── repository/
│   │   │       │   └── ProfessorRepository.java
│   │   │       └── ProjetoCTApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

## 🚀 Como Executar

### Pré-requisitos

- Java 17 ou superior
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse, VS Code)

### Instalação

1. **Clone o repositório**
```bash
git clone https://github.com/LuAllencar/ProjetoCT.git
cd ProjetoCT
```

2. **Configure o banco de dados H2**

O H2 é um banco em memória, então não precisa instalar nada! As configurações já estão no `application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

3. **Execute o projeto**
```bash
mvn spring-boot:run
```

4. **Acesse a API e o Console H2**
```
API: http://localhost:8080/api/professores
Console H2: http://localhost:8080/h2-console
```

**Login no H2 Console:**
- JDBC URL: `jdbc:h2:mem:testdb`
- User: `sa`
- Password: (deixe em branco)

## 📡 Endpoints da API

### Professores

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| **GET** | `/api/professores` | Lista todos os professores |
| **GET** | `/api/professores/{id}` | Busca professor por ID |
| **POST** | `/api/professores` | Cadastra novo professor |
| **PUT** | `/api/professores/{id}` | Atualiza dados do professor |
| **DELETE** | `/api/professores/{id}` | Remove professor |

## 📝 Modelo de Dados

### Professor

```json
{
  "id": 1,
  "nome": "João Silva",
  "endereco": "Jardim das Flores",
  "graduacao": "Programação Web",
  "categoria": "Efetivo"
}
```

### Exemplo de Requisição (POST)

```json
{
  "nome": "Maria Santos",
  "endereco": "Rua dos Anjos",
  "graduacao": "Banco de Dados",
  "categoria": "Temporário"
}
```

## 🎓 Aprendizados

Este projeto me proporcionou experiência prática em:

- ✅ Estruturação básica de APIs REST
- ✅ Operações CRUD completas
- ✅ Spring Boot e suas annotations
- ✅ Persistência de dados com JPA/Hibernate
- ✅ Banco de dados em memória (H2)
- ✅ Console H2 para visualização de dados
- ✅ Padrão MVC (Model-View-Controller)
- ✅ Testagem de endpoints com Postman/Insomnia
- ✅ Versionamento com Git

## 🔗 Projetos Relacionados

Este projeto serviu como base para o desenvolvimento de APIs mais complexas:

- **[SistWeb](https://github.com/LuAllencar/SistWeb)** - API mais elaborada com múltiplas entidades e integração com API externa

## 💡 Possíveis Melhorias

- [ ] Adicionar validações de entrada
- [ ] Implementar tratamento de exceções personalizado
- [ ] Criar relacionamento com entidade Curso
- [ ] Adicionar paginação nas listagens
- [ ] Documentação Swagger/OpenAPI
- [ ] Testes unitários e de integração
- [ ] Sistema de autenticação

## 📚 Referências

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [H2 Database Documentation](https://www.h2database.com/html/main.html)

## 📄 Licença

Projeto desenvolvido para fins educacionais na ETEC Fernandópolis.

## 👩‍💻 Autora

**Luana Alencar Menezes**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/luana-alencar-menezes-2a6045364)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/LuAllencar)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:luana.amenezes06@gmail.com)

---

<div align="center">
  
  📚 **Projeto desenvolvido durante a disciplina de Sistemas Web - ETEC Fernandópolis** 📚
  
  *Primeira API REST individual • Fundamentos de Spring Boot • CRUD Completo*

</div>
