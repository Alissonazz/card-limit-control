# 💳 Card Limit Control — Sistema de Cartão de Crédito

Sistema simples em **Java** para simulação de compras em um cartão de crédito, com controle de limite, histórico de compras ordenado por valor e validação de saldo.

## 📋 Sobre o Projeto

Este projeto simula o funcionamento básico de um cartão de crédito: o usuário cadastra compras informando descrição e valor, e o sistema controla o limite disponível, impedindo compras que ultrapassem o saldo. Ao final, exibe um relatório com todas as compras realizadas, ordenadas por valor.

## ✨ Funcionalidades

- 🛒 Cadastro de compras (descrição + valor)
- ✅ Validação automática de saldo disponível
- 📊 Listagem de compras ordenada por valor (menor → maior)
- 💰 Exibição do limite atual após as transações

## 🗂️ Estrutura do Projeto

```
Bancario/
├── BankingSystem.java   # Classe principal (fluxo do programa)
├── Card.java            # Representa o cartão e sua lógica de limite/compras
└── Shopping.java        # Representa uma compra (Comparable por valor)
```

### Classes

| Classe | Responsabilidade |
|---|---|
| `BankingSystem` | Interface via console (menu, entrada de dados, exibição de resultados) |
| `Card` | Gerencia limite, limite atual e lista de compras; valida e processa transações |
| `Shopping` | Modela uma compra (descrição e valor), implementa `Comparable` para ordenação |

## 🚀 Como Executar

### Pré-requisitos
- [JDK 8+](https://www.oracle.com/java/technologies/downloads/) instalado
- Terminal ou IDE de sua preferência (IntelliJ, Eclipse, VS Code)

### Passos

```bash
# Clone o repositório
git clone https://github.com/Alissonazz/card-limit-control.git
cd card-limit-control

# Compile os arquivos
javac Bancario/*.java

# Execute o programa
java Bancario.BankingSystem
```

## 💻 Exemplo de Uso

```
O limite do seu cartão é de 20000.0 reais.
Digite a descrição da compra: 
Notebook
Digite o valor da compra: 
3500
Compra realizada!
Digite 0 para sair ou 1 para cadastrar outra compra: 
1
Digite a descrição da compra: 
Fone
Digite o valor da compra: 
250
Compra realizada!
Digite 0 para sair ou 1 para cadastrar outra compra: 
0

*************************
COMPRAS REALIZADAS: 
Fone - 250.0
Notebook - 3500.0
*************************

Limite atual do cartão: 16250.0
```

## 🛠️ Tecnologias Utilizadas

- **Java** (POO, Collections, Comparable, Scanner)

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar, modificar e distribuir.

---

Desenvolvido como projeto de estudo em Java 🚀
