

import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para nosso usuário

        //Obter pelo scanner os valores digitados pelo terminal

        //Exibir a mensagem conta criada

  Scanner scanner = new Scanner(System.in);
        
  System.out.println("Por favor, digite o número da Agência:");
  String agencia = scanner.nextLine();
        
  System.out.println("Por favor, digite o número da Conta:");
    int numeroConta = scanner.nextInt();
      scanner.nextLine();
        
  System.out.println("Por favor, digite o nome do Cliente:");
  String nomeCliente = scanner.nextLine();
        
  System.out.println("Por favor, digite o saldo inicial:");
      double saldo = scanner.nextDouble();
        
  System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
  scanner.close();

      }
    }