public class Item {
    String nome;
    int quantidade;
    int prioridade;
    int urgencia;

    public Item(String nome, int quantidade, int prioridade, int urgencia) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.prioridade = prioridade;
        this.urgencia = urgencia;
    }

    public void avaliar() {
        if (prioridade > 3 && urgencia > 7) {
            System.out.println("Tarefa crítica");
        } else if (prioridade > 3 || urgencia > 7) {
            System.out.println("Tarefa importante");
        } else {
            System.out.println("Tarefa comum");
        }
    }

    public void contarN() {
        int notificacoes = 0;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                notificacoes += 2;
            } else {
                notificacoes++;
            }
        }
        System.out.println("Total de notificações: " + notificacoes);
    }

    public static void main(String[] args) {
        Item tarefa = new Item("Entrega", 1, 4, 8);
        tarefa.avaliar();
        tarefa.contarN();
    }
}