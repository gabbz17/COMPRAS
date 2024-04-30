import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // aparelho, memoria, cor, soma de todos os atributos, metodo de pagamento.
        String n;
        int m;
        Scanner entrada = new Scanner(System.in);
        cadastro c = new cadastro();

        System.out.printf(
                "Indique qual aparelho deseja comprar: %n 1.Iphone 15 pro (R$ 6.500)%n 2.Samsung galaxy S24 (R$ 5.200)%n 3.Xiaomi poco X3 pro (R$ 2.600) %n");
        n = entrada.nextLine();
        System.out.println(" ");

        // IPHONE 15

        if (n.equals("1")) {
            System.out.printf(
                    "Escolha a capacidade de memória do seu aparelho: %n 1. 128 gb + 4 RAM (Sem acréscimo)%n 2. 256 gb + 6 RAM (Acréscimo de R$70)%n 3. 512 gb + 8 RAM (Acréscimo de R$120)%n");
            n = entrada.nextLine();
            System.out.println(" ");
            // 128
            if (n.equals("1")) {
                System.out.printf(
                        "Informe a cor do aparelho: %n 1.Titânio branco (Acréscimo de R$50)%n 2.Titânio azul (Acréscimo de R$100)%n 3.Titânio preto (Acréscimo de R$70)%n");
                n = entrada.nextLine();
                if (n.equals("1")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Iphone 15 pro de 128gb + 4RAM da cor Branca");
                    System.out.println("Valor da compra: R$" + (6500 + 50));
                }
                if (n.equals("2")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Iphone 15 pro de 128gb + 4RAM da cor Azul");
                    System.out.println("Valor da compra: R$" + (6500 + 100));
                }
                if (n.equals("3")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Iphone 15 pro de 128gb + 4RAM da cor Preta");
                    System.out.println("Valor da compra: R$" + (6500 + 70));
                }
                // 256
            } else if (n.equals("2")) {
                System.out
                        .printf("Informe a cor do aparelho: %n 1.Titânio branco (Acréscimo de R$50)%n 2.Titânio azul (Acréscimo de R$100)%n 3.Titânio preto (Acréscimo de R$70)%n");
                n = entrada.nextLine();
                if (n.equals("1")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Iphone 15 pro de 256gb + 6RAM da cor Branca");
                    System.out.println("Valor da compra: R$" + (6500 + 70 + 50));
                }
                if (n.equals("2")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Iphone 15 pro de 256gb + 6RAM da cor Azul");
                    System.out.println("Valor da compra: R$" + (6500 + 70 + 100));
                }
                if (n.equals("3")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Iphone 15 pro de 256gb + 6RAM da cor Preta");
                    System.out.println("Valor da compra: R$" + (6500 + 70 + 70));
                }
                // 512
            } else {
                System.out
                        .printf("Informe a cor do aparelho: %n 1.Titânio branco (Acréscimo de R$50)%n 2.Titânio azul (Acréscimo de R$100)%n 3.Titânio preto (Acréscimo de R$70)%n");
                n = entrada.nextLine();
                if (n.equals("1")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Iphone 15 pro de 512gb + 8RAM da cor Branca");
                    System.out.println("Valor da compra: R$" + (6500 + 120 + 50));
                }
                if (n.equals("2")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Iphone 15 pro de 512gb + 8RAM da cor Azul");
                    System.out.println("Valor da compra: R$" + (6500 + 120 + 100));
                }
                if (n.equals("3")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Iphone 15 pro de 512gb + 8RAM da cor Preta");
                    System.out.println("Valor da compra: R$" + (6500 + 120 + 70));
                }
            }

            // SAMSUNG S24
        } else if (n.equals("2")) {
            System.out.printf(
                    "Escolha a capacidade de memória do seu aparelho: %n 1. 128 gb + 8 RAM (Sem acréscimo)%n 2. 256 gb + 8 RAM (Acréscimo de R$100)%n 3. 512 gb + 8 RAM (Acréscimo de R$150)%n");
            n = entrada.nextLine();
            System.out.println(" ");
            // 128
            if (n.equals("1")) {
                System.out.printf(
                        "Informe a cor do aparelho: %n 1.Preta (Acréscimo de R$40)%n 2.Azul (Acréscimo de R$90)%n 3.Verde (Acréscimo de R$120)%n");
                n = entrada.nextLine();
                if (n.equals("1")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Samsung galaxy S24 de 128gb + 8RAM da cor Preta");
                    System.out.println("Valor da compra: R$" + (5200 + 40));
                }
                if (n.equals("2")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Samsung galaxy S24 de 128gb + 8RAM da cor Azul");
                    System.out.println("Valor da compra: R$" + (5200 + 90));
                }
                if (n.equals("3")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Samsung galaxy S24 de 128gb + 8RAM da cor Verde");
                    System.out.println("Valor da compra: R$" + (5200 + 120));
                }
                // 256
            } else if (n.equals("2")) {
                System.out
                        .printf("Informe a cor do aparelho: %n 1.Preta (Acréscimo de R$40)%n 2.Azul (Acréscimo de R$90)%n 3.Verde (Acréscimo de R$120)%n");
                n = entrada.nextLine();
                if (n.equals("1")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Samsung galaxy S24 de 256gb + 8RAM da cor Preta");
                    System.out.println("Valor da compra: R$" + (5200 + 100 + 40));
                }
                if (n.equals("2")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Samsung galaxy S24 de 256gb + 8RAM da cor Azul");
                    System.out.println("Valor da compra: R$" + (5200 + 100 + 90));
                }
                if (n.equals("3")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Samsung galaxy S24 de 256gb + 8RAM da cor Verde");
                    System.out.println("Valor da compra: R$" + (5200 + 100 + 120));
                }
                // 512
            } else {
                System.out
                        .printf("Informe a cor do aparelho: %n 1.Preta (Acréscimo de R$40)%n 2.Azul (Acréscimo de R$90)%n 3.verde (Acréscimo de R$120)%n");
                n = entrada.nextLine();
                if (n.equals("1")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Samsung galaxy S24 de 512gb + 8RAM da cor Preta");
                    System.out.println("Valor da compra: R$" + (5200 + 150 + 40));
                }
                if (n.equals("2")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Samsung galaxy S24 de 512gb + 8RAM da cor Azul");
                    System.out.println("Valor da compra: R$" + (5200 + 150 + 90));
                }
                if (n.equals("3")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Samsung galaxy S24 de 512gb + 8RAM da cor Verde");
                    System.out.println("Valor da compra: R$" + (5200 + 150 + 120));
                }
            }
            // XIAOMI POCO X3
        } else {
            System.out.printf(
                    "Escolha a capacidade de memória do seu aparelho: %n 1. 256 gb + 8 RAM (Acréscimo de R$100)%n 2. 512 gb + 12 RAM (Acréscimo de R$180)%n ");
            n = entrada.nextLine();
            System.out.println(" ");
            // 256
            if (n.equals("1")) {
                System.out.println("Cor única: Preto (Acréscimo de R$50)");
                System.out.println("Confirmar escolha?");
                n = entrada.nextLine();
                if (n.equals("sim") || n.equals("Sim") || n.equals("SIM")) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Xiaomi poco X6 pro de 256gb + 8RAM da cor Preta");
                    System.out.println("Valor da compra: R$" + (2600 + 100 + 50));
                }
                // 512
            } else {
                System.out.println("Cor única: Preto (Acréscimo de R$50)");
                System.out.println("Confirmar escolha?");
                n = entrada.nextLine();
                if ((n.equals("sim") || n.equals("Sim") || n.equals("SIM"))) {
                    System.out.println(" ");
                    System.out.println("Informações da compra: Xiaomi poco X6 pro de 512gb + 12RAM da cor Preta");
                    System.out.println("Valor da compra: R$" + (2600 + 180 + 50));
                }
            }
        }

        // CADASTRO OU LOGIN
        System.out.println(" ");

        System.out.printf("Deseja realizar a compra? %n 1.Sim %n 2.Não%n");
        n = entrada.nextLine();
        if (n.equals("1")) {
            System.out.println("");
            System.out.println("Você já possui cadastro?");
            n = entrada.nextLine();

            if ((n.equals("sim") || n.equals("Sim") || n.equals("SIM"))) {
                System.out.println(" ");
                System.out.println("Efetue login para finalizar a compra");
                System.out.println("Informe o nome para acesso:");
                n = entrada.nextLine();
                if (n.equals(c.getnome())) {
                    System.out.println("Nome correto!");
                } else {
                    while (n != c.getnome()) {
                        System.out.println("Nome incorreto, tente novamente");
                        n = entrada.nextLine();
                        if (n.equals(c.getnome())) {
                            System.out.println("Nome correto!");
                            break;
                        }
                    }
                }
                System.out.println(" ");
                System.out.println("Informe sua senha:");
                n = entrada.nextLine();
                if (n.equals(c.getsenha())) {
                    System.out.println("Senha correta!");
                } else {
                    while (n != c.getsenha()) {
                        System.out.println("Senha incorreta, tente novamente");
                        n = entrada.nextLine();
                        if (n.equals(c.getsenha())) {
                            System.out.println("Senha correta!");
                            break;
                        }
                    }
                }
            } else if ((n.equals("nao") || n.equals("Nao") || n.equals("NAO"))
                    || (n.equals("não") || n.equals("Não") || n.equals("NÃO"))) {
                System.out.println("Preencha as informações abaixo: ");
                System.out.println(" ");
                System.out.println("Informe seu nome:");
                c.setnome(entrada.nextLine());
                System.out.println("Informe seu e-mail:");
                c.setemail(entrada.nextLine());
                System.out.println("Informe um número para contato:");
                c.setnumero(entrada.nextLine());
                System.out.println("Crie uma senha:");
                c.setsenha(entrada.nextLine());

                System.out.println("CADASTRO REALIZADO COM SUCESSO");
            }

            System.out.println(" ");

            // PAGAMENTO

            System.out.printf(
                    "Informe o método de pagamento: %n 1.PIX%n 2.Cartão débito%n 3.Cartão crédito%n 4.Boleto bancário%n");
            m = entrada.nextInt();
            System.out.println(" ");

            switch (m) {
                case (1):
                    System.out.println("GERAR QRCODE");
                    System.out.println("Compra realizada!!");
                    break;
                case (2):
                    System.out.println("Informe o número do cartão:");
                    entrada.nextLine();
                    n = entrada.nextLine();
                    System.out.println("Informe a validade do cartão:");
                    n = entrada.nextLine();
                    System.out.println("Informe o nome presente no cartão");
                    n = entrada.nextLine();
                    System.out.println("Compra realizada!!");
                    break;
                case (3):
                    System.out.println("Informe o número do cartão:");
                    entrada.nextLine();
                    n = entrada.nextLine();
                    System.out.println("Informe a validade do cartão:");
                    n = entrada.nextLine();
                    System.out.println("Informe o nome presente no cartão");
                    n = entrada.nextLine();
                    System.out.println("Informe em quantas vezes voce irá dividir:");
                    n = entrada.nextLine();
                    System.out.println("Compra realizada!!");
                    break;
                case (4):
                    System.out.println("GERAR BOLETO BANCARIO");
                    System.out.println("Compra realizada!!");
                    break;
                default:
                    while (m > 4 || m < 1) {
                        System.out.println("Operação inválida. Insira uma operação válida");
                        m = entrada.nextInt();
                        System.out.println(" ");
                        switch (m) {
                            case (1):
                                System.out.println("GERAR QRCODE");
                                System.out.println("Compra realizada!!");
                                break;
                            case (2):
                                System.out.println("Informe o número do cartão:");
                                entrada.nextLine();
                                n = entrada.nextLine();
                                System.out.println("Informe a validade do cartão:");
                                n = entrada.nextLine();
                                System.out.println("Informe o nome presente no cartão");
                                n = entrada.nextLine();
                                System.out.println("Compra realizada!!");
                                break;
                            case (3):
                                System.out.println("Informe o número do cartão:");
                                entrada.nextLine();
                                n = entrada.nextLine();
                                System.out.println("Informe a validade do cartão:");
                                n = entrada.nextLine();
                                System.out.println("Informe o nome presente no cartão");
                                n = entrada.nextLine();
                                System.out.println("Informe em quantas vezes voce irá dividir:");
                                n = entrada.nextLine();
                                System.out.println("Compra realizada!!");
                                break;
                            case (4):
                                System.out.println("GERAR BOLETO BANCARIO");
                                System.out.println("Compra realizada!!");
                                break;
                        }
                    }
            }
        } else {
            System.out.println("Compra encerrada!");
        }
        entrada.close();
    }
}