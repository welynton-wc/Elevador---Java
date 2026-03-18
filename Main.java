public class Main {
    public static void main(String[] args) {
        // Criando (instanciando) o objeto Elevador com capacidade para 5 pessoas e 10 andares
        Elevador meuElevador = new Elevador(5, 10);

        System.out.println("Iniciando simulação do Elevador...\n");

        meuElevador.exibirStatus();

        // Simulando uso do elevador
        meuElevador.abrirPorta();
        meuElevador.entrar(3); // 3 pessoas entram
        meuElevador.fecharPorta();

        meuElevador.subir(); // Sobe para o 1º andar
        meuElevador.subir(); // Sobe para o 2º andar

        meuElevador.exibirStatus();

        meuElevador.abrirPorta();
        meuElevador.sair(1); // 1 pessoa sai no 2º andar
        meuElevador.entrar(4); // Tenta entrar 4 pessoas (vai dar erro de capacidade)
        meuElevador.entrar(2); // 2 pessoas entram com sucesso
        meuElevador.fecharPorta();

        meuElevador.descer(); // Desce para o 1º andar

        // Tentando mover com a porta aberta
        meuElevador.abrirPorta();
        meuElevador.descer(); // Vai dar erro por segurança

        meuElevador.fecharPorta();
        meuElevador.exibirStatus();
    }
}