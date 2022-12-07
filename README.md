# Projeto-MVC

## Model View Controller
A arquitetura MVC consiste em um padrão destinado a códigos simples e pequenos com visualização de dados sujeita a mudanças repentinas.

## 👤 Model
Este componente armazena os dados do aplicativo e não possui conhecimento sobre a interface. Além disso, é responsável por lidar com a lógica do domínio, ou seja, as regras de negócio do mundo real, além da comunicação com o banco de dados e as camadas de rede.
## 👁 View
É a camada UI (User Interface), a qual contém os componentes visíveis na tela. Além disso, proporciona a visualização dos dados armazenados no Modelo e oferece interação ao usuário.
## 🎮 Controller
Este componente estabelece a relação entre a View e o Model. Ele contém a lógica principal do aplicativo e é informado sobre a resposta do usuário, atualizando o modelo conforme a necessidade.
