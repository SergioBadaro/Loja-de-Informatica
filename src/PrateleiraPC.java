import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrateleiraPC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> produtos = new HashMap<>();
        Map<String, Integer> carrinho = new HashMap<>();

        // Produtos disponíveis na loja
        produtos.put("Processador Ryzen 5", 1200.00);
        produtos.put("Placa de Vídeo RTX 3060", 2200.00);
        produtos.put("Memória RAM 16GB", 350.00);
        produtos.put("SSD 1TB", 450.00);
        produtos.put("Fonte 650W", 400.00);
        produtos.put("Gabinete Gamer", 300.00);
        produtos.put("Monitor Mancer Horizon z27", 850.00);
        produtos.put("Teclado Mancer Shade MK2", 150.00);
        produtos.put("Mouse Redragon Cobra", 175.90);
        produtos.put("Head Phone Ztech z42", 320.00);

        System.out.println("📌 Bem-vindo à Prateleira de Montagem de PC!");
        System.out.println("🔧 Produtos disponíveis:\n");

        int index = 1;
        for (Map.Entry<String, Double> produto : produtos.entrySet()) {
            System.out.println(index + ". " + produto.getKey() + " - R$ " + produto.getValue());
            index++;
        }

        // Adicionar produtos ao carrinho
        while (true) {
            System.out.print("\nDigite o número do produto para adicionar ao carrinho (0 para finalizar): ");
            int escolha = scanner.nextInt();

            if (escolha == 0) break;

            if (escolha >= 1 && escolha <= produtos.size()) {
                String itemSelecionado = (String) produtos.keySet().toArray()[escolha - 1];
                carrinho.put(itemSelecionado, carrinho.getOrDefault(itemSelecionado, 0) + 1);
                System.out.println("✅ " + itemSelecionado + " adicionado ao carrinho!");
            } else {
                System.out.println("❌ Escolha inválida, tente novamente.");
            }
        }

        // Opção para remover itens do carrinho
        while (true) {
            System.out.print("\nDeseja remover um item do carrinho? (S/N): ");
            char remover = scanner.next().toUpperCase().charAt(0);

            if (remover == 'N') break;

            System.out.println("\n🛒 Itens no carrinho:");
            int itemIndex = 1;
            for (String item : carrinho.keySet()) {
                System.out.println(itemIndex + ". " + item + " (x" + carrinho.get(item) + ")");
                itemIndex++;
            }

            System.out.print("\nDigite o número do item a ser removido: ");
            int removerEscolha = scanner.nextInt();

            if (removerEscolha >= 1 && removerEscolha <= carrinho.size()) {
                String itemRemovido = (String) carrinho.keySet().toArray()[removerEscolha - 1];
                if (carrinho.get(itemRemovido) > 1) {
                    carrinho.put(itemRemovido, carrinho.get(itemRemovido) - 1);
                } else {
                    carrinho.remove(itemRemovido);
                }
                System.out.println("❌ " + itemRemovido + " removido do carrinho.");
            } else {
                System.out.println("❌ Escolha inválida, tente novamente.");
            }
        }

        // Calcular o total de compra
        double total = 0;
        int totalItens = 0;

        System.out.println("\n🛒 Carrinho de Compras:");
        for (Map.Entry<String, Integer> item : carrinho.entrySet()) {
            String nomeProduto = item.getKey();
            int quantidade = item.getValue();
            double preco = produtos.get(nomeProduto);
            total += preco * quantidade;
            totalItens += quantidade;

            System.out.println(quantidade + "x " + nomeProduto + " - R$ " + (preco * quantidade));
        }

        // Aplicar descontos e frete grátis
        double desconto = 0;
        double frete = (total > 500) ? 0 : 50;  // Frete grátis acima de R$ 500

        if (total > 1000) {
            desconto = total * 0.10;
        }

        double totalFinal = total - desconto + frete;

        System.out.println("\n📊 Resumo da Compra:");
        System.out.println("Total de Itens: " + totalItens);
        System.out.println("Subtotal: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Frete: R$ " + (frete == 0 ? "Grátis" : frete));
        System.out.println("💰 Valor Final a Pagar: R$ " + totalFinal);

        // Salvar pedido em um arquivo
        salvarPedido(carrinho, totalFinal);

        scanner.close();
    }

    // Método para salvar o pedido no arquivo pedidos.txt
    public static void salvarPedido(Map<String, Integer> carrinho, double totalFinal) {
        try (FileWriter writer = new FileWriter("pedidos.txt", true)) {
            writer.write("\n=== NOVO PEDIDO ===\n");
            for (Map.Entry<String, Integer> item : carrinho.entrySet()) {
                writer.write(item.getValue() + "x " + item.getKey() + "\n");
            }
            writer.write("Total: R$ " + totalFinal + "\n");
            writer.write("===================\n");
            System.out.println("\n📄 Pedido salvo com sucesso em pedidos.txt!");
        } catch (IOException e) {
            System.out.println("❌ Erro ao salvar o pedido: " + e.getMessage());
        }
    }
}
