import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        // Criando um objeto Random para gerar números aleatórios
        Random random = new Random();
        // Definind strings com as opções do jogo
        String[] options = {"pedra", "papel", "tesoura"};
        // Definindo a quantidade de vezes que o jogo será simulado
        int rounds = 3;
        // Simulando o jogo
        for (int i = 0; i < rounds; i++) {
            // Gerando um número aleatório entre 0 e 2
            int randomNumber = random.nextInt(3);
            // Exibindo o resultado
            System.out.println("Jogada " + (i+1) + ": " + options[randomNumber]);
        }
    }
}