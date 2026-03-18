public class elevador {
}

class Elevador {
    // Atributos (Estado do objeto)
    private int andarAtual;
    private int totalAndares;
    private int capacidadeMaxima;
    private int pessoasPresentes;
    private boolean portaAberta;

    // Construtor: define as configurações iniciais quando o objeto é criado
    public Elevador(int capacidadeMaxima, int totalAndares) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.totalAndares = totalAndares;
        this.andarAtual = 0; // Começa no térreo (0)
        this.pessoasPresentes = 0; // Começa vazio
        this.portaAberta = false; // Começa com a porta fechada
    }

    // Métodos (Comportamentos do objeto)

    public void abrirPorta() {
        if (!portaAberta) {
            portaAberta = true;
            System.out.println(" Porta ABERTA.");
        } else {
            System.out.println("A porta já está aberta.");
        }
    }

    public void fecharPorta() {
        if (portaAberta) {
            portaAberta = false;
            System.out.println(" Porta FECHADA.");
        } else {
            System.out.println("⚠ A porta já está fechada.");
        }
    }

    public void entrar(int quantidade) {
        if (!portaAberta) {
            System.out.println("️ ERRO: Não é possível entrar, a porta está fechada!");
            return;
        }
        if (pessoasPresentes + quantidade <= capacidadeMaxima) {
            pessoasPresentes += quantidade;
            System.out.println(" " + quantidade + " pessoa(s) entrou(aram). Total agora: " + pessoasPresentes);
        } else {
            System.out.println("️ ERRO: Capacidade máxima excedida! O elevador suporta apenas " + capacidadeMaxima + " pessoas.");
        }
    }

    public void sair(int quantidade) {
        if (!portaAberta) {
            System.out.println("️ ERRO: Não é possível sair, a porta está fechada!");
            return;
        }
        if (pessoasPresentes >= quantidade) {
            pessoasPresentes -= quantidade;
            System.out.println(" " + quantidade + " pessoa(s) saiu(íram). Total agora: " + pessoasPresentes);
        } else {
            System.out.println("⚠ ERRO: Não há tantas pessoas no elevador para sair.");
        }
    }

    public void subir() {
        if (portaAberta) {
            System.out.println("️ ERRO: Feche a porta antes de mover o elevador!");
            return;
        }
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println(" Subindo... Andar atual: " + andarAtual);
        } else {
            System.out.println(" ERRO: Você já está no último andar.");
        }
    }

    public void descer() {
        if (portaAberta) {
            System.out.println("️ ERRO: Feche a porta antes de mover o elevador!");
            return;
        }
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("️ Descendo... Andar atual: " + andarAtual);
        } else {
            System.out.println("️ ERRO: Você já está no térreo.");
        }
    }

    public void exibirStatus() {
        System.out.println("\n---  Status do Elevador ---");
        System.out.println("Andar: " + andarAtual + " de " + totalAndares);
        System.out.println("Pessoas: " + pessoasPresentes + "/" + capacidadeMaxima);
        System.out.println("Porta: " + (portaAberta ? "Aberta" : "Fechada"));
        System.out.println("\n");
    }
}

