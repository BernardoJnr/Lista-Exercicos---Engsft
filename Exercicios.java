package javaExercicios;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        //ex1();
        //ex2();
        // ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        //ex910();
        //ex911a();
        //ex911b();
        //ex911c():
        //ex912();
        //ex913();
        //ex914();
        //ex915();
        //ex916();
        //ex917();
        //ex918();
        //ex919();
        //ex920();
        //ex921();
        //ex922();
        //ex923();
        //ex924();
        //ex925();
        //ex926();
        //ex927();
        //ex928();
        //ex929();
        //ex930();
        //ex931();
        //ex932();
        //ex933();
        //ex934();
        //ex935();
        //ex936();
        //ex937();
        //ex938();
        //ex939();
        //ex940();
        //ex941();
        //ex942();
        //ex943();
        //ex944();
        //ex945();
        //ex946();
        //ex947();
        //ex948();
        //ex949();
        //ex950();
        //ex951();
        //ex952();
        //ex953();
        //ex954();
        ex955();
    }

    static void ex1() {
        Scanner novo = new Scanner(System.in);
        double um;
        double dois;

        System.out.print("Digite um numero:");
        um = novo.nextDouble();
        System.out.print("Digite outro numero:");
        dois = novo.nextDouble();

        System.out.println(um + dois);
        System.out.println(um - dois);
        System.out.println(um * dois);
        System.out.println(um / dois);

    }

    static void ex2() {
        Scanner novo = new Scanner(System.in);
        double km;
        double litro;

        System.out.print("Digite a quilometragem:");
        km = novo.nextDouble();
        System.out.print("Digite a quantidade de litros:");
        litro = novo.nextDouble();

        System.out.println("O consumo é de:" + km / litro);

    }

    static void ex3() {
        Scanner novo = new Scanner(System.in);
        String nome;
        double salarioFixo;
        double totalVenda;

        System.out.println("Digite seu nome:");
        nome = novo.next();
        System.out.println("Salario fixo");
        salarioFixo = novo.nextDouble();
        System.out.println("total de vendas");
        totalVenda = novo.nextDouble();

        System.out.println("Novo Salario: " + salarioFixo + (totalVenda * 0.15));
    }

    static void ex4() {
        Scanner novo = new Scanner(System.in);

        double C;

        System.out.println("Digite a temperatura em Celsius: ");
        C = novo.nextDouble();

        System.out.println("Temperatura em Fahrenheit: " + (9 * C + 160) / 5);
    }

    static void ex5() {
        Scanner novo = new Scanner(System.in);

        double cota;
        double valor;

        System.out.println("Digite a cotação do Dolar: ");
        cota = novo.nextDouble();
        System.out.println("Digite a quantida de Dolares: ");
        valor = novo.nextDouble();

        System.out.println("O valor em reais é: R$" + valor * cota);

    }

    static void ex6() {
        Scanner novo = new Scanner(System.in);

        double deposito;

        System.out.println("Valor do deposito: ");
        deposito = novo.nextDouble();

        System.out.println("Valor com rendimento mensal: R$ " + (deposito + (deposito * 0.007)));

    }

    static void ex7() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Valor do produto: ");
        double produto = novo.nextDouble();

        System.out.println("O valor de cada parcela é: R$ " + produto / 5);
    }

    static void ex8() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Preço do produto: ");
        double preco = novo.nextDouble();
        System.out.println("Percentual de acrescimo(%): ");
        double acrescimo = novo.nextDouble();

        double precoF = preco + (preco * (acrescimo / 100));

        System.out.println("Novo preço: R$ " + precoF);

    }

    static void ex9() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Preço de fabrica: ");
        double preco = novo.nextDouble();

        double precoI = preco + (preco * 0.45);

        System.out.println("Preço de Venda: R$ " + (precoI + (precoI * 0.28)));

    }

    static void ex910() {

        int A = 10;
        int B = 20;
        int C;

        C = A;
        A = B;
        B = C;

        System.out.println("Valor de A = " + A);
        System.out.println("Valor de B = " + B);

    }

    static void ex911a() {

        int A = 100;
        int B = 120;

        System.out.println(B);
        B = 234;
        System.out.println(A + "," + B);
    }

    static void ex911b() {
        int A = 300;
        int B = 200;
        int C = A + B;

        System.out.println(C);
        B = 140;
        System.out.println(B + "," + C);
        C = A + B;
        System.out.println(A + "," + B + "," + C);
    }

    static void ex911c() {
        int A = 23;
        int B = 56;
        int C = A + B;
        A = 34;
        B = 67;
        System.out.println(A + "," + B + "," + C);
    }

    static void ex912() {

        int A = (4 / 2) + (2 / 4);
        int A1 = 4 / 2 + 2 / 4;
        int B = 4 / (2 + 2) / 4;
        int B1 = 4 / 2 + 2 / 4;
        int C = (4 + 2) * 2 - 4;
        int C1 = 4 + 2 * 2 - 4;
        System.out.println(A + "," + A1);
        System.out.println(B + "," + B1);
        System.out.println(C + "," + C1);
    }

    static void ex913() {

        int A = 6 * 5;
        int B = 6 * 5 + 2;
        int C = 2 + 18 / 6;
        int D = 2 * 2;
        int E = 3 + 1;
        int F = 2 + 4;
        int G = 28 + 6;
        int H = 60 - 10;
        int I = 83 * 9;
        int J = 48 - 12;
    }

    static void ex914() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = novo.nextInt();

        int ant = --valor;
        int suc = ant + 2;

        System.out.println("Antecessor: " + ant);
        System.out.println("Sucessor: " + suc);

    }

    static void ex915() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        double base = novo.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = novo.nextDouble();

        System.out.println("A base do retangulo é: " + base * altura);

    }

    static void ex916() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Digite sua idade - anos: ");
        int anos = novo.nextInt();
        System.out.println("Meses: ");
        int meses = novo.nextInt();
        System.out.println("Dias: ");
        int dias = novo.nextInt();

        int anosDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Sua idade expressa em dias corresponde a: " + anosDias);
    }

    static void ex917() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Numero de eleitores: ");
        double eleitores = novo.nextDouble();
        System.out.println("Votos Brancos: ");
        double brancos = novo.nextDouble();
        System.out.println("Votos Nulos: ");
        double nulos = novo.nextDouble();
        System.out.println("Votos Validos: ");
        double validos = novo.nextDouble();

        System.out.println("Percentual de votos brancos :" + (brancos / eleitores) * 100 + "%");
        System.out.println("Percentual de votos Nulos :" + (nulos / eleitores) * 100 + "%");
        System.out.println("Percentual de votos validos :" + (validos / eleitores) * 100 + "%");

    }

    static void ex918() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Salario atual: ");
        double salario = novo.nextDouble();
        System.out.println("Percentual de reajuste(%): ");
        double reajuste = novo.nextDouble();

        double salarioF = salario + (salario * (reajuste / 100));

        System.out.println("Novo slario: R$ " + salarioF);
    }

    static void ex919() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Preço de fabrica: ");
        double preco = novo.nextDouble();

        double precoD = preco + (preco * 0.28);

        System.out.println("Preço de Venda: R$ " + (precoD + (precoD * 0.45)));
    }

    static void ex920() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Salario fixo: ");
        double salario = novo.nextDouble();
        System.out.println("Numero de carros vendidos: ");
        double vendidos = novo.nextDouble();
        System.out.println("Valor de vendas: ");
        double vendas = novo.nextDouble();
        System.out.println("Valor recebido por carro: ");
        double recebido = novo.nextDouble();

        double salarioF = salario + (vendas * 0.05) + (recebido * vendidos);

        System.out.println("Salario Final: R$" + salarioF);

    }

    static void ex921() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = novo.nextDouble();

        System.out.println((valor > 10) ? "È MAIOR QUE 10!!" : "NÃO É MAIOR QUE 10!!");

    }

    static void ex922() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = novo.nextDouble();

        System.out.println((valor >= 0) ? "POSITIVO!!" : "NEGATIVO!!");

    }

    static void ex923() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Digite o total de maças: ");
        double total = novo.nextDouble();

        System.out.println((total < 12) ? "Valor total: R$" + (total * 1.30) : "Valor total: R$" + (total * 1));

    }

    static void ex924() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Digite sua primeira e segunda nota:");
        double primeira = novo.nextDouble();
        double segunda = novo.nextDouble();

        double media = (primeira + segunda) / 2;

        System.out.println((media >= 6) ? "APROVADO COM MEDIA: " + media : "NÃO FOI APROVADO COM MEDIA: " + media);

    }

    static void ex925() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Ano atual:");
        double atual = novo.nextDouble();
        System.out.println("Ano de nascimento:");
        double nascimento = novo.nextDouble();

        double idade = (atual - nascimento);

        System.out.println((idade >= 16) ? "PODE VOTAR!!" : "NÃO PODE VOTAR!!");

    }

    static void ex926() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor1 = novo.nextDouble();
        System.out.println("Digite outro valor: ");
        double valor2 = novo.nextDouble();

        System.out.println((valor1 > valor2) ? valor1 : valor2);
    }

    static void ex927() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor1 = novo.nextDouble();
        System.out.println("Digite outro valor: ");
        double valor2 = novo.nextDouble();

        System.out.println((valor1 > valor2) ? valor2 + ", " + valor1 : valor1 + ", " + valor2);
    }

    static void ex928() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Hora de inicio: ");
        int inicio = novo.nextInt();
        System.out.println("Hora de termino: ");
        int termino = novo.nextInt();

        System.out.println((termino > inicio) ? "Tempo de jogo: " + (termino - inicio) + "h" : "Tempo de jogo: " + (24 - (inicio - termino)) + "h");
    }

    static void ex929() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Numero de horas trabalhados no mês: ");
        int horasT = novo.nextInt();
        System.out.println("Salario por hora: ");
        int salario = novo.nextInt();

        double horaE = (horasT - 160) * ((salario * 0.5) + salario);

        System.out.println((horasT > 160) ? "Salario total: R$" + ((160 * salario) + horaE) : "Salario total: R$" + (horasT * salario));
    }

    static void ex930() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = novo.next();
        System.out.println("Sexo: ");
        char sexo = novo.next().charAt(0);
        System.out.println("Altura:");
        double altura = novo.nextDouble();
        double pesoI;

        if (sexo == 'M' || sexo == 'm') {
            pesoI = (72.7 * altura) - 58;
        } else {
            pesoI = (62.1 * altura) - 44.7;
        }
        System.out.println("Peso Ideal: " + pesoI);
    }

    static void ex931() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Salario fixo: ");
        double salario = novo.nextDouble();
        System.out.println("Valor de vendas: ");
        double vendas = novo.nextDouble();

        double salarioF = salario + (1500 * 0.03);
        double valorE = (vendas - 1500);

        System.out.println((vendas > 1500) ? "Salario Total: R$" + (salarioF + (valorE * 0.05)) : "Salario Total: R$" + (salario + (vendas * 0.03)));

    }

    static void ex932() {
        Scanner novo = new Scanner(System.in);

        System.out.println("N° conta: ");
        int conta = novo.nextInt();
        System.out.println("Valor do saldo: ");
        double saldo = novo.nextDouble();
        System.out.println("valor do debito: ");
        double debito = novo.nextDouble();
        System.out.println("Valor do credito: ");
        double credito = novo.nextDouble();

        double saldoA = (saldo - debito + credito);

        System.out.println((saldoA >= 0) ? "Conta: " + conta + "\nSaldo Atual: R$" + saldoA + "\nSALDO POSITIVO!!" : "Conta: " + conta + "\nSaldo Atual: R$" + saldoA + "\nSALDO NEGATIVO!!");
    }

    static void ex933() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Quantidade atual em estoque: ");
        int atual = novo.nextInt();
        System.out.println("Quantidade maxima: ");
        double maxima = novo.nextDouble();
        System.out.println("Quantidade minima: ");
        double minima = novo.nextDouble();

        double media = (maxima + minima) / 2;

        System.out.println((atual >= media) ? "Não efetuar compra!" : "Efetuar compra!!");

    }

    static void ex934() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = novo.nextDouble();

        if (valor > 0) {
            System.out.println("POSITIVO!!");
        } else if (valor < 0) {
            System.out.println("NEGATIVO!!");
        } else {
            System.out.println("ZERO!!");
        }
    }

    static void ex935() {
        Scanner novo = new Scanner(System.in);

        int aux = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um valor: ");
            int valor = novo.nextInt();
            if (valor > aux) {
                aux = valor;
            }
        }
        System.out.println("Maior valor: " + aux);
    }

    static void ex936() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor1 = novo.nextInt();
        System.out.println("Digite um valor: ");
        int valor2 = novo.nextInt();
        System.out.println("Digite um valor: ");
        int valor3 = novo.nextInt();
        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println(valor2 + valor3);
        } else if (valor2 < valor1 && valor2 < valor3) {
            System.out.println(valor1 + valor3);
        } else {
            System.out.println(valor1 + valor2);
        }
    }

    static void ex937() {
        Scanner novo = new Scanner(System.in);
        int vet[] = new int[3];
        int aux[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um valor: ");
            vet[i] = novo.nextInt();

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(vet[i]);
        }
    }

    static void ex938() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = novo.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = novo.nextInt();
        System.out.println("Digite o valor de C: ");
        int C = novo.nextInt();

        if (A < B + C && B < C + A && C < B + A) {
            System.out.println("Forma um trinagulo!!");
        } else {
            System.out.println("Não forma um trinagulo!!");
        }
    }

    static void ex939() {
        Scanner novo = new Scanner(System.in);

        System.out.print("Nome do time: ");
        String nome1 = novo.next();
        System.out.print("Quantidade de gols marcados:");
        int gols1 = novo.nextInt();

        System.out.print("Nome do time: ");
        String nome2 = novo.next();
        System.out.print("Quantidade de gols marcados:");
        int gols2 = novo.nextInt();

        if (gols1 > gols2) {
            System.out.println("Vencedor: " + nome1);
        } else if (gols2 > gols1) {
            System.out.println("Vencedor: " + nome2);
        } else {
            System.out.println("Empate!!");
        }
    }

    static void ex940() {
        Scanner novo = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int valor1 = novo.nextInt();
        System.out.print("Segundo valor: ");
        int valor2 = novo.nextInt();

        if (valor1 > valor2) {
            System.out.println("Primeiro é maior!!");
        } else if (valor2 > valor1) {
            System.out.println("Segundo é maior!!");
        } else {
            System.out.println("Numeros iguais!!");
        }
    }

    static void ex941() {
        /* QUESTÃO 41
     
         Z = 11   - B
         Z = 455  - C
         Z = -2   - A
         Z = -5   - A
         Z = 155  - C
     
         */
    }

    static void ex942() {
        Scanner novo = new Scanner(System.in);

        double valor = 0;
        System.out.print("Tipo de combustivel:A - Alcool/ G - gasolina: ");
        char tipo = novo.next().charAt(0);
        System.out.print("Quantidade de litros de combustivel:");
        double litros = novo.nextDouble();

        if (tipo == 'A' || tipo == 'a' && litros <= 20) {
            valor = (litros * 2.90) - (litros * 0.087);
        } else if (tipo == 'A' || tipo == 'a' && litros > 20) {
            valor = (litros * 2.90) - (litros * 0.145);
        } else if (tipo == 'G' || tipo == 'g' && litros <= 20) {
            valor = (litros * 3.30) - (litros * 0.132);
        } else if (tipo == 'G' || tipo == 'g' && litros > 20) {
            valor = (litros * 3.30) - (litros * 0.198);
        }
        System.out.println("Valor: " + valor);
    }

    static void ex943() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Idade de um homem: ");
        int homem1 = novo.nextInt();
        System.out.println("Idade do segundo homem ");
        int homem2 = novo.nextInt();
        System.out.println("Idade de uma mulher: ");
        int mulher1 = novo.nextInt();
        System.out.println("Idade da segunda mulher: ");
        int mulher2 = novo.nextInt();
        int maiorH = 0, menorH = 0;
        int maiorM = 0, menorM = 0;

        if (homem1 > homem2) {
            maiorH = homem1;
            menorH = homem2;
        } else if (homem2 > homem1) {
            maiorH = homem2;
            menorH = homem1;
        }
        if (mulher1 > mulher2) {
            maiorM = mulher1;
            menorM = mulher2;
        } else if (mulher2 > mulher1) {
            maiorM = mulher2;
            menorM = mulher1;
        }

        System.out.print("Velho e nova: " + (maiorH + menorM) + "\nNovo e velha: " + (menorH * maiorM));
    }

    static void ex945() {
        Scanner novo = new Scanner(System.in);
        int codigo = 0;
        int senha = 0;

        while (codigo != 1234) {
            System.out.println("Digite codigo: ");
            codigo = novo.nextInt();
            if (codigo == 1234) {
                System.out.println("Usuario identificado!");
                do {
                    System.out.println("Digite a senha: ");
                    senha = novo.nextInt();
                    if (senha != 9999) {
                        System.out.println("Senha incorreta!!");
                    } else {
                        System.out.println("Acesso permitido!!");
                    }
                } while (senha != 9999);
            } else {
                System.out.println("Usuario invalido!");
            }
        }
    }

    static void ex944() {
        Scanner novo = new Scanner(System.in);

        System.out.println("Quantidade em Kg de morango: ");
        double morango = novo.nextDouble();
        System.out.println("Quantidade em Kg de maça: ");
        double maca = novo.nextDouble();

        double valorMo = 0;
        double valorMa = 0;

        if (morango <= 5) {
            valorMo = (morango * 2.50);
        } else {
            valorMo = (morango * 2.20);
        }
        if (maca <= 5) {
            valorMa = (maca * 1.80);
        } else {
            valorMa = (maca * 1.50);
        }

        if (valorMo > 25 || morango > 8) {
            System.out.println("Valor morango:" + (valorMo - (valorMo * 0.1)));
        } else {
            System.out.println("Valor morango:" + valorMo);
        }
        if (valorMa > 25 || maca > 8) {
            System.out.println("Valor maçã:" + (valorMa - (valorMa * 0.1)));
        } else {
            System.out.println("Valor maçã:" + valorMa);
        }
    }

    static void ex946() {
        Boolean A = true, B = true, C = false;
        if (A && B || A ^ B) {
            System.out.println("Verdade!!");
        } else {
            System.out.println("Mentira!!");
        }

        if (A || B && A && C) {
            System.out.println("Verdade!!");
        } else {
            System.out.println("Mentira!!");
        }

        if (A || C && B || A && !B) {
            System.out.println("Verdade!!");
        } else {
            System.out.println("Mentira!!");
        }
    }

    static void ex947() {
        Scanner novo = new Scanner(System.in);

        System.out.print("Nome do Produto: ");
        String nome = novo.nextLine();
        System.out.print("Quantidade adquirida: ");
        double quant = novo.nextDouble();
        System.out.print("Preço unitario: ");
        double preco = novo.nextDouble();
        double totalP = 0;

        double total = (quant * preco);

        if (quant <= 5) {
            totalP = (total - (total * 0.02));
        } else if (quant > 5 && quant <= 10) {
            totalP = (total - (total * 0.03));
        } else if (quant > 5) {
            totalP = (total - (total * 0.05));
        }

        System.out.println("Total a pagar:" + totalP);
    }

    static void ex948() {
        Scanner novo = new Scanner(System.in);

        System.out.print("codigo do empregado: ");
        int codigo = novo.nextInt();
        System.out.print("Ano de nascimento: ");
        double anoN = novo.nextDouble();
        System.out.print("Ano de ingresso: ");
        double anoI = novo.nextDouble();
        double idade = (2019 - anoN);
        double tempoT = (2019 - anoI);

        if (idade >= 65 && tempoT > 30 && (idade + tempoT) >= 25) {
            System.out.print("codigo: " + codigo + "\nIdade: " + idade + "\n Tempo de trabalho: " + tempoT + "\nRequerer aposentadoria!!");
        } else {
            System.out.println("codigo: " + codigo + "\nIdade: " + idade + "\n Tempo de trabalho: " + tempoT + "\nNão requerer!!");
        }
    }

    static void ex949() {
        Scanner novo = new Scanner(System.in);

        System.out.print("A: ");
        int A = novo.nextInt();
        System.out.print("B: ");
        int B = novo.nextInt();
        System.out.print("C: ");
        int C = novo.nextInt();
        String mens = novo.nextLine();

        if ((A < B + C) && (B < A + C) && (C < A + B)) {
            if ((A == B) && (B == C)) {
                mens = "Triangulo equilatero!!";
            } else if ((A == B) || (B == C) || (A == C)) {
                mens = "Triangulo isóceles!!";
            } else {
                mens = "Triangulo escaleno!!";
            }
        } else {
            System.out.println("Não é possivel formar um triangulo");
        }

        System.out.println(mens);
        /*
         Respostas da tabela:
         Não é possivel formar um triangulo
         Triangulo escaleno
         Triangulo isóceles
         Triangulo equilatero
         Triangulo isóceles		
         */
    }

    static void ex950() {
        Scanner novo = new Scanner(System.in);
        double valor2;
        double valor1;

        System.out.print("Primeiro valor: ");
        valor1 = novo.nextInt();
        do {
            System.out.print("Segundo valor: ");
            valor2 = novo.nextInt();
        } while (valor2 == 0);

        System.out.println("Resultado: " + (valor1 / valor2));
    }

    static void ex951() {
        Scanner novo = new Scanner(System.in);
        double valor2 = 0;
        double valor1;

        System.out.print("Primeiro valor: ");
        valor1 = novo.nextInt();
        while (valor2 == 0) {
            System.out.print("Segundo valor: ");
            valor2 = novo.nextInt();
        }

        System.out.println("Resultado: " + (valor1 / valor2));
    }

    static void ex952() {
        Scanner novo = new Scanner(System.in);
        double X = -1;
        double Y = -1;

        do {

            if (X == 0) {
                System.out.print("X:");
                X = novo.nextInt();
            }
            if (Y == 0) {
                System.out.print("X:");
                Y = novo.nextInt();
            }
        } while (X == 0 || Y == 0);

        double Z = (X * Y) + 5;
        String resposta = novo.nextLine();

        if (Z <= 0) {
            resposta = "A";
        } else if (Z <= 100) {
            resposta = "B";
        } else {
            resposta = "C";
        }

        System.out.println(Z + "," + resposta);
    }

    static void ex953() {
        Scanner novo = new Scanner(System.in);

        double valor = 0;
        double litros;
        System.out.print("Tipo de combustivel:A - Alcool/ G - gasolina: ");
        char tipo = novo.next().charAt(0);
        do {
            System.out.print("Quantidade de litros de combustivel:");
            litros = novo.nextDouble();
            if (litros == 0) {
                System.out.println("Valor invalido!!!");
            }
        } while (litros == 0);

        if (tipo == 'A' || tipo == 'a' && litros <= 20) {
            valor = (litros * 2.90) - (litros * 0.087);
        } else if (tipo == 'A' || tipo == 'a' && litros > 20) {
            valor = (litros * 2.90) - (litros * 0.145);
        } else if (tipo == 'G' || tipo == 'g' && litros <= 20) {
            valor = (litros * 3.30) - (litros * 0.132);
        } else if (tipo == 'G' || tipo == 'g' && litros > 20) {
            valor = (litros * 3.30) - (litros * 0.198);
        }
        System.out.println("Valor: " + valor);
    }

    static void ex955() {
        Scanner novo = new Scanner(System.in);
        String resposta = novo.next();

        do {
            System.out.print("Primeiro valor: ");
            int valor1 = novo.nextInt();
            System.out.print("Segundo valor: ");
            int valor2 = novo.nextInt();

            if (valor1 > valor2) {
                System.out.println("Primeiro é maior!!");
            } else if (valor2 > valor1) {
                System.out.println("Segundo é maior!!");
            } else {
                System.out.println("Numeros iguais!!");
            }
            System.out.println("Novo calculo?[S/N]");
            resposta = novo.next();
        } while (resposta == "S");
    }
}
