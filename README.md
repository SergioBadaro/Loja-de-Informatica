# 🖥️ Prateleira de Compras para Montagem de PC

## 📌 Sobre o Projeto
Este projeto em **Java** é um sistema de prateleira de compras que permite ao usuário montar um PC comprando peças individuais. O sistema possibilita:

✅ Exibir produtos disponíveis.
✅ Adicionar itens ao carrinho.
✅ Remover itens do carrinho.
✅ Aplicar regras de desconto e frete grátis.
✅ Exibir um resumo da compra.
✅ Salvar o pedido em um arquivo (`pedidos.txt`) para futuras consultas.

---

## 🚀 Funcionalidades
### 1️⃣ **Listagem de Produtos**
Ao iniciar o programa, o usuário verá a lista de produtos disponíveis e seus preços.

### 2️⃣ **Adicionar Produtos ao Carrinho**
O usuário pode adicionar produtos ao carrinho digitando o número correspondente ao item desejado.

### 3️⃣ **Remover Produtos do Carrinho**
Caso queira remover algum item, o usuário pode visualizar os produtos no carrinho e excluir os indesejados.

### 4️⃣ **Aplicação de Descontos e Frete Grátis**
- **Frete grátis** para compras acima de **R$ 500,00**.
- **10% de desconto** para compras acima de **R$ 1000,00**.

### 5️⃣ **Resumo da Compra**
O sistema exibe um resumo com:
- Quantidade total de itens comprados.
- Subtotal da compra.
- Desconto aplicado (se houver).
- Valor do frete.
- Valor final a ser pago.

### 6️⃣ **Salvar Pedidos**
Todos os pedidos são armazenados no arquivo `pedidos.txt` para futuras referências.

---

## 🛠️ Como Rodar o Projeto
### ✅ **Passo 1: Criar o Projeto no IntelliJ**
1. Abra o **IntelliJ IDEA**.
2. Crie um **novo projeto Java**.
3. Crie um arquivo `PrateleiraPC.java` e cole o código do projeto.

### ✅ **Passo 2: Compilar e Executar**
1. No IntelliJ, clique com o botão direito no arquivo `PrateleiraPC.java`.
2. Selecione **Run PrateleiraPC** para executar o programa.
3. Interaja com o console escolhendo os produtos para montar seu PC.

---

## 📝 Exemplo de Execução
```plaintext
📌 Bem-vindo à Prateleira de Montagem de PC!
🔧 Produtos disponíveis:

1. Processador Ryzen 5 - R$ 1200.0
2. Placa de Vídeo RTX 3060 - R$ 2200.0
3. Memória RAM 16GB - R$ 350.0
4. SSD 1TB - R$ 450.0
...

Digite o número do produto para adicionar ao carrinho (0 para finalizar): 1
✅ Processador Ryzen 5 adicionado ao carrinho!

Deseja remover um item do carrinho? (S/N): S
🛒 Itens no carrinho:
1. Processador Ryzen 5 (x1)
Digite o número do item a ser removido: 1
❌ Processador Ryzen 5 removido do carrinho.

📊 Resumo da Compra:
Total de Itens: 2
Subtotal: R$ 1650.0
Desconto: R$ 165.0
Frete: Grátis
💰 Valor Final a Pagar: R$ 1485.0

📄 Pedido salvo com sucesso em pedidos.txt!
```

---

## 📂 Estrutura do Projeto
```
📂 PrateleiraPC
│-- 📄 PrateleiraPC.java  (Código principal)
│-- 📄 pedidos.txt        (Histórico de pedidos)
```

---

## 📢 Melhorias Futuras
🔹 Permitir diferentes formas de pagamento.
🔹 Criar um sistema de usuário e login.
🔹 Implementar um sistema gráfico (GUI) para facilitar a navegação.

---

## 🤝 Contribuição
Sinta-se à vontade para sugerir melhorias ou abrir **pull requests**! 🚀

