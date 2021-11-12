package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Cadastro> doseUnica = new ArrayList<>();
		List<Cadastro> primeiraDose = new ArrayList<>();
		List<Cadastro> segundaDose = new ArrayList<>();
		List<Cadastro> naoVacinado = new ArrayList<>();
		
	    List<Cadastro> cadastrado = new ArrayList<>();
		
 		try {
			System.out.print("Já está cadastrado? ");
			char validar = sc.next().charAt(0);
			
			if(validar == 'S') {
				sc.nextLine();
				System.out.print("Cpf: ");
				String cpf  = sc.nextLine();
				System.out.print("Senha: ");
				String senha = sc.nextLine();
				
				//entra no aplicativo
				//apenas para ilustrar que entrou, nao significa que e assim
				cadastrado.add(new Cadastro(cpf, senha));
				
				System.out.println("Entrou!");
			}
			else {
				//entra com os dados do cadastro
				System.out.println("Crie sua conta:");
				sc.nextLine();
				System.out.print("Nome completo: ");
				String nome = sc.nextLine();
				System.out.print("Data de nascimento: ");
				Date nascimento = sdf.parse(sc.nextLine());
				System.out.print("Cpf: ");
				String cpf = sc.nextLine();
				System.out.print("E-mail: ");
				String email = sc.nextLine();
				System.out.print("Cep: ");
				String cep = sc.nextLine();
				System.out.print("Senha: ");
				String senha = sc.nextLine();
				
				System.out.print("Voçê está vacinado? ");
				
				char valid = sc.next().charAt(0);
				
				if (valid == 'N') {
					//adiciona ao "banco de dados" de nao vacinados
					naoVacinado.add(new Cadastro(cpf, nome, nascimento, cep, email, senha));;
					
				}
				else {
					System.out.print("Dose única/Primeira dose/Segunda dose? (U/P/S) ");
					
					char vacinou = sc.next().charAt(0);
					if(vacinou == 'U') {
						//adiciona ao "banco de dados" de vacinados com dose unica
						doseUnica.add(new Cadastro(cpf, nome, nascimento, cep, email, senha));
						
					}
					else if (vacinou == 'P') {
						//adiciona ao "banco de dados" os com a primeira dose
						primeiraDose.add(new Cadastro(cpf, nome, nascimento, cep, email, senha));
						
					}
					else {
						//adiciona ao "banco de dados" os imunizados
						segundaDose.add(new Cadastro(cpf, nome, nascimento, cep, email, senha));
						
					}
				}
				System.out.println("Seu cadastro está completo!");
			}
			
 		}
 		catch (ParseException e){
 			System.out.println("Erro!"); 	
 			e.printStackTrace();
 		} 
 		catch (RuntimeException e) {
 			System.out.println("Erro inesperado!");
 		}
		sc.close();
	}

}
