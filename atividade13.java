

// // programa de soluções computacionais.
// Lista 2 ( atividade 13, segunda lista)
//Aluno: João Victor Maia Leite
//RA: 323124931



import java.util.Scanner;


public class atividade13 {
    public static void main(String[] args) throws Exception {
        

                Scanner input = new Scanner(System.in);
        
                // Solicita ao usuário o tamanho do arquivo e a velocidade da conexão
                System.out.print("Informe o tamanho do arquivo (em MB): ");
                double tamanhoArquivo = input.nextDouble();
        
                System.out.print("Informe a velocidade da conexão (em Mbps): ");
                double velocidadeConexao = input.nextDouble();
        
                // Converte a velocidade de Mbps para MB/s
                double velocidadeDownload = velocidadeConexao / 8;
        
                // Calcula o tempo aproximado de download em minutos
                double tempoDownloadMinutos = (tamanhoArquivo / velocidadeDownload) / 60;
        
                // Exibe o resultado para o usuário
                System.out.printf("O tempo aproximado de download é de %.2f minutos.%n", tempoDownloadMinutos);
        
                input.close();
            }
        }




