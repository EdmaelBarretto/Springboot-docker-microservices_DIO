# Spring Boot Docker Microservices - DIO

Projeto desenvolvido como evolução do desafio **Docker: Utilização prática no cenário de Microsserviços**, proposto na plataforma **Digital Innovation One (DIO)**.

Nesta versão, o projeto foi **reimplementado e aprimorado utilizando Java e Spring Boot**, aplicando boas práticas de arquitetura, containerização e comunicação entre serviços.

---

## 📌 Objetivo

Demonstrar na prática:

* Arquitetura baseada em microsserviços
* Comunicação entre containers
* Uso de Docker para isolamento de aplicações
* Integração entre aplicação backend e banco de dados
* Utilização de Nginx como gateway/reverse proxy

---

## 🧰 Tecnologias utilizadas

* Java 17
* Spring Boot
* Docker
* Docker Compose
* Nginx
* MySQL
* Maven

---

## 🏗 Arquitetura do Projeto

A aplicação segue uma arquitetura simples de microsserviços containerizados.

User
↓
Nginx (Gateway / Reverse Proxy)
↓
Spring Boot API
↓
MySQL Database

### Componentes

**Nginx**

* Atua como gateway
* Direciona requisições para a aplicação backend

**Spring Boot**

* Responsável pela API REST
* Geração de dados aleatórios
* Persistência no banco

**MySQL**

* Armazena os dados gerados pela aplicação

---

## 📂 Estrutura do Projeto

springboot-docker-microservices-dio
│
├── app
│   ├── src/main/java/com/dio/microservices
│   │   ├── controller
│   │   ├── service
│   │   ├── repository
│   │   └── model
│   ├── Dockerfile
│   └── pom.xml
│
├── nginx
│   ├── Dockerfile
│   └── nginx.conf
│
├── database
│   └── init.sql
│
├── docker-compose.yml
├── README.md
└── .gitignore

---

## ⚙️ Como executar o projeto

### 1️⃣ Clonar o repositório

git clone https://github.com/seuusuario/springboot-docker-microservices-dio

---

### 2️⃣ Build da aplicação

Dentro da pasta **app**:

mvn clean package

---

### 3️⃣ Subir os containers

Na raiz do projeto:

docker-compose up --build

---

### 4️⃣ Testar a API

Endpoint:

POST
http://localhost/dados

A aplicação irá gerar dados aleatórios e armazenar no banco MySQL.

---

## 🗄 Estrutura da tabela

Tabela utilizada no banco:

dados

Campos:

* id
* nome
* sobrenome
* endereco
* cidade
* host

O campo **host** permite identificar qual container respondeu à requisição.

---

## 🚀 Melhorias implementadas nesta versão

Em relação ao projeto original:

* Migração de PHP para **Spring Boot**
* Arquitetura organizada em camadas (Controller, Service, Repository)
* Containerização completa da aplicação
* Integração com Docker Compose
* Estrutura preparada para evolução em microsserviços

---

## 📚 Referência do projeto original

Este projeto foi inspirado no desafio proposto pelo instrutor da DIO.

Projeto base utilizado como referência:

https://github.com/denilsonbonatti/toshiro-shibakita

A versão presente neste repositório apresenta uma **reimplementação utilizando Java e Spring Boot**, com melhorias estruturais e organizacionais.

---

## 👨‍💻 Autor

Projeto desenvolvido para fins educacionais e de portfólio.

Desenvolvido por **Edmael Barreto**.

---
