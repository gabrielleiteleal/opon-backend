# 🛠 OPON — Operários Online (Em Aprimoramento)

<p align="center">
  <img src="https://img.shields.io/badge/Status-Em%20Aprimoramento-blue" />
  <img src="https://img.shields.io/badge/Java-17%2B-orange" />
  <img src="https://img.shields.io/badge/Spring%20Boot-API-green" />
  <img src="https://img.shields.io/badge/Tests-Parcialmente%20Implementados-yellow" />
  <img src="https://img.shields.io/badge/License-MIT-green" />
  <img src="https://img.shields.io/badge/GitHub-Portfólio-black" />
</p>

> API REST do projeto **OPON — Operários Online**: uma plataforma para cadastro e contratação de profissionais de serviços (pedreiros, pintores e encanadores.) com orçamentos automatizados e fluxo transacional.

O backend é responsável por **serivr os dados, aplicar regras de negócios, autenticar e gerenciar transações de serviços**, apoiando um frontend ou aplicativo consumirem a API.

---
<img src="https://github.com/gabrielleiteleal/opon-backend/blob/main/src/main/resources/static/images/preview-opon.png" alt="" width="100%">

---


## 📌 Visão Geral do Projeto

O **OPON Backend** é a parte server-side da plataforma OPON, um sistema que conecta clientes a profissionais autônomos de serviços gerais. O projeto é estruturado como uma API REST escalável, utilizando boas práticas de desenvolvimento e padrões de mercado para facilitar manutenção e evolução.

➡️ Este projeto foi idealizado com foco em **aprendizado contínuo**, organização de código e preparação para desafios reais do mercado.

🔎 Funcionalidades principais:
- 🛠️ **Cadastro e autenticação de usuários**
- 📄 **CRUD de profissionais e serviços**
- 💲 **Orçamentos automáticos para serviços baseados em parâmetros**
- 🔐 **Controle de acesso e validações de segurança**
- 🔄 **Endpoints RESTful para integração com frontend e apps móveis**

---

## 🚀 Tecnologias Utilizadas

- **Linguagem:** Java 17+  
- **Framework:** Spring Boot
- **Banco de dados:** MySQL / H2 (test)
- **Build:** Maven
- **Versionamento:** Git e GitHub  
- **Testes:** JUnit / Mockito

---

## 🛠️ Requisitos

Antes de executar o projeto, é necessário ter instalado:

- 🧰 **Java JDK 17 ou superior**
- 🐬 **MySQL** (ou use H2 em modo dev)
- 📦 **Maven**
- 🧑‍💻 **IDE (IntelliJ, Eclipse, VS Code)**

---

## 📥 Como Executar o Projeto

### 🔹 Clonar o repositório

```bash
git clone https://github.com/gabrielleiteleal/opon-backend.git
cd opon-backend
```

### 🔹 Executar a aplicação

```bash
mvn clean install
mvn spring-boot:run
```

---

## 🧪 Testes

✔️ **Testes automatizados já foram implementados**, cobrindo partes importantes das regras de negócio.  
🚧 **Novos testes estão em desenvolvimento**, com o objetivo de aumentar a cobertura e garantir maior confiabilidade do sistema.

A evolução dos testes faz parte do processo contínuo de melhoria do projeto.

---

## 🔄 Status do Projeto

🚧 **Em desenvolvimento contínuo**

O NexumBank está em constante evolução, recebendo melhorias frequentes como:
- Novas rotas adicionadas
- Melhorias de performance
- Aumento de cobertura de testes
- Refinamento de regras de negócio

---

## 📂 Estrutura do Projeto

```
📦 opon-backend
 ┣ 📂 src
 ┃ ┣ 📂 main
 ┃ ┃ ┣ 📂 java
 ┃ ┃ ┗ 📂 resources
 ┃ ┗ 📂 test
 ┣ 📄 .gitignore
 ┣ 📄 pom.xml
 ┣ 📄 README.md
```

---

## 🤝 Contribuições

Contribuições são bem-vindas!  
Este projeto também serve como ambiente de aprendizado colaborativo.

1. Faça um fork do projeto  
2. Crie uma branch para sua feature  
   ```bash
   git checkout -b minha-feature
   ```
3. Commit suas alterações  
   ```bash
   git commit -m "Implementa nova funcionalidade"
   ```
4. Push para o repositório  
   ```bash
   git push origin minha-feature
   ```
5. Abra um Pull Request  

---

## 📄 Licença

Este projeto está sob a licença **MIT**.

---

## 💻 Autor

**Gabriel Leal**  
Desenvolvedor Java | Estudante de Sistemas para Internet  

📌 Projeto desenvolvido com foco em aprendizado prático, evolução técnica e construção de portfólio profissional.
