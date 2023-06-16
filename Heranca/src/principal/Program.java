package principal;

import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ContaPoupanca contaPoupanca = new ContaPoupanca("Luan", 006, 6161);
		Conta conta = new Conta("Felipe", 411, 144);
		ContaCorrente contaCorrente = new ContaCorrente("Sofia", 6562, 1513);
		
		contaPoupanca.depositar(500);
		conta.depositar(500);
		contaCorrente.depositar(500);
		
		contaPoupanca.sacar(500);
		conta.sacar(500);
		contaCorrente.sacar(500);
		
		System.out.println(contaPoupanca);
		System.out.println(conta);
		System.out.println(contaCorrente);
		
		/*System.out.println("Entre com o titular da conta: ");
		contaPoupanca.setNomeTitular(sc.nextLine());
		conta.setNomeTitular(sc.nextLine());
		
		System.out.println("Entre com o número da agência: ");
		contaPoupanca.setAgencia(sc.nextInt());
		conta.setAgencia(sc.nextInt());
		
		System.out.println("Entre com o número da conta: ");
		contaPoupanca.setNumeroConta(sc.nextInt());
		conta.setNumeroConta(sc.nextInt());
		
		System.out.println("Entre com o valor de deposito: R$ ");
		contaPoupanca.depositar(sc.nextDouble());
		conta.depositar(sc.nextDouble());
		
		System.out.println("Dados da conta: ");
		System.out.println(contaPoupanca);
		System.out.println(conta);
		
		
		System.out.println("Entre com o valor do saque: R$ ");
		contaPoupanca.sacar(sc.nextDouble());
		conta.sacar(sc.nextDouble());
		
		System.out.println("Dados da conta: ");
		System.out.println(contaPoupanca);
		System.out.println(conta);*/
		
		sc.close();

	}

}
