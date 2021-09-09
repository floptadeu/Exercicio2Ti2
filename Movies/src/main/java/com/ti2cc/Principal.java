package com.ti2cc;
import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DAO dao = new DAO();
		int cod = 0, duracao = 0;
		String nome, diretor;

		dao.conectar();

		int resp = 0;
		do{
		
			System.out.println("Selecione sua opcao:");
			System.out.println("1 - Listar");
			System.out.println("2 - Inserir");
			System.out.println("3 - Excluir");
			System.out.println("4 - Atualizar ");
			System.out.println("5 - Sair");
			resp = input.nextInt();
		
			if(resp == 1 ){
				Filme[] filmes = dao.getFilmes();
				for(int i = 0; i < filmes.length; i++) {
					System.out.println(filmes[i].toString());
				}
			} else if (resp == 2) {
				System.out.println("Nomeie os atributos:");
				cod = input.nextInt();
				nome = input.next();
				diretor = input.next();
				duracao = input.nextInt();
				Filme filme = new Filme(cod, nome, diretor,duracao);
				if(dao.inserirFilme(filme) == true) {
					System.out.println("Insercao com sucesso -> " + filme.toString());
				}
			} else if (resp == 3) {
				System.out.println("Nomeie o cod:");
				cod = input.nextInt();
				dao.excluirFilme(cod);
			} else if( resp ==4){
				System.out.println("Nomeie os atributos:");
				cod = input.nextInt();
				nome = input.next();
				diretor = input.next();
				duracao = input.nextInt();
				Filme filme = new Filme(cod, nome, diretor,duracao);
				if(dao.inserirFilme(filme) == true) {
					System.out.println("Insercao com sucesso -> " + filme.toString());
				}
			}
		}while( resp != 5 );
		
		input.close();
		dao.close();
	}
}
