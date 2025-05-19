package Aula;

import java.util.Scanner;
     public class CodigoInfinito {




             static Scanner scanner = new Scanner(System.in);
             static String nomeJogador = "";

             public static void main(String[] args) {
                 exibirBoasVindas();
                 menu();
                 scanner.close();
             }

             static void exibirBoasVindas() {
                 System.out.println("=========================================");
                 System.out.println("🧩 Bem-vindo à Maldição do Código Infinito");
                 System.out.println("=========================================");
                 System.out.println("\n📖 Introdução:");

                 // ✍️ Aqui você pode colocar a introdução completa da história
                 System.out.println("Um jovem programador é contratado por uma empresa misteriosa...");
                 System.out.println("Aos poucos, ele percebe que os funcionários estão presos em loops infinitos.");
                 System.out.println("Agora, cabe a ele usar seus conhecimentos em programação para libertar a todos.\n");
             }

             static void menu() {
                 int opcao = 0;

                 while (opcao != 3) {
                     System.out.println("\n📁 MENU PRINCIPAL");
                     System.out.println("1 - Iniciar Jornada");
                     System.out.println("2 - Instruções");
                     System.out.println("3 - Sair");
                     System.out.print("Escolha uma opção: ");

                     try {
                         opcao = Integer.parseInt(scanner.nextLine());
                     } catch (NumberFormatException e) {
                         System.out.println("Entrada inválida! Digite um número.");
                         continue;
                     }

                     switch (opcao) {
                         case 1:
                             iniciarJogo();
                             break;
                         case 2:
                             System.out.println("\n📚 INSTRUÇÕES:\n" +
                                     "Você é um jovem programador contratado por uma empresa misteriosa.\n" +
                                     "Logo percebe que todos estão presos em laços de repetição.\n" +
                                     "Resolva os enigmas usando laços em Java para libertá-los!");
                             break;
                         case 3:
                             System.out.println("Encerrando...");
                             break;
                         default:
                             System.out.println("Opção inválida!");
                     }
                 }
             }

             static void iniciarJogo() {
                 System.out.print("\nDigite o nome do seu personagem: ");
                 nomeJogador = scanner.nextLine();

                 System.out.println("\n🖥️ Bem-vindo, " + nomeJogador + ".");
                 System.out.println("Você chega para seu primeiro dia na misteriosa empresa INFINITY TECH.");
                 System.out.println("Mas algo estranho está acontecendo...");

                 primeiroDesafio();
             }

             static void primeiroDesafio() {
                 System.out.println("\n📌 Um funcionário se aproxima e diz:");
                 System.out.println("\"" + nomeJogador + ", estamos presos em um loop! O café nunca acaba e os e-mails se repetem!\"");
                 System.out.println("Você olha para o código no monitor:");
                 System.out.println("\nwhile (true) {\n    System.out.println(\"Enviando e-mail...\");\n}");

                 System.out.println("\n💡 Como você quebra esse laço infinito?");
                 System.out.println("1 - Usando break quando a condição for atendida");
                 System.out.println("2 - Deixando rodar pra sempre");
                 System.out.println("3 - Colocando if sem break");

                 System.out.print("Escolha a opção correta: ");
                 int resposta = lerOpcao();

                 if (resposta == 1) {
                     System.out.println("\n✅ Excelente, " + nomeJogador + "! Você quebrou o primeiro loop.");
                 } else {
                     System.out.println("\n❌ Ops, resposta errada. Os e-mails continuam infinitamente...");
                 }
             }

             static int lerOpcao() {
                 try {
                     return Integer.parseInt(scanner.nextLine());
                 } catch (NumberFormatException e) {
                     return -1;
                 }
             }
         }
