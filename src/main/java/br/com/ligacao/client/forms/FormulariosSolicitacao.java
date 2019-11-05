package br.com.ligacao.client.forms;

import java.util.Scanner;

import br.com.ligacao.persistence.model.Promotor;
import br.com.ligacao.persistence.model.PromotorFisico;
import br.com.ligacao.persistence.model.PromotorJuridico;

/**
 * Esta é uma classe utilitaria, usada para representação dos atributos de um
 * formulário de cadastro.
 * 
 * @author developer
 *
 */
public final class FormulariosSolicitacao {

	private static Scanner input = new Scanner(System.in);
	
	public static Promotor preencherForm() {
		Promotor promotor = new Promotor("Joãozinho do Tren�", "Ações Etílicas", "700.000.231-00", "02-02-2002",
				"Teste de Descrição Geral", "trenotunado@email.com", "imagem1.jpg", "instagram.com/meprocuraqueacha",
				"6299999999");
		return promotor;
	}

	public static Promotor preencherFormAlterado(String cpf) {
		Promotor promotor = new Promotor("Joãozinho do Trenó com Nó", "Ações Etílicas", cpf, "02-02-2002",
				"Teste de Descrição Geral", "trenotunado@email.com", "imagem1.jpg", "instagram.com/meprocuraqueacha",
				"6299999999");
		return promotor;
	}

	/**
	 * Realiza a construção de uma String, que representa a solicitação dos dados para cadastro de um Promotor do tipo pessoa física.
	 * 
	 * @return instancia de Promotor Física;
	 */
	public static PromotorFisico solCadPromotorFisico() {
		
		PromotorFisico promotorFisico = new PromotorFisico();
		
		StringBuilder sb = new StringBuilder();
		sb.append("----- Cadastro de Promotor do tipo Pessoa Física -----\n")
		.append("Nome da Pessoa: \n");
		System.out.println(sb.toString());
		promotorFisico.setNomePessoa(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nCPF do Responsável: \n");
		System.out.println(sb.toString());
		promotorFisico.setCpf(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nData de Nascimento: \n");
		System.out.println(sb.toString());
		promotorFisico.setDataNascimento(input.nextLine());
		promotorFisico.setFotoPerfil("");
		
		sb = new StringBuilder();
		sb.append("\nCategorias de Ações: \n");
		System.out.println(sb.toString());
		promotorFisico.setCategoriasAcoes(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nDescricao Geral: \n");
		System.out.println(sb.toString());
		promotorFisico.setDescricaoGeral(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nTelefone: \n");
		System.out.println(sb.toString());
		promotorFisico.setTelefone(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nEndereco: \n");
		System.out.println(sb.toString());
		promotorFisico.setEndereco(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nEmail: \n");
		System.out.println(sb.toString());
		promotorFisico.setEmail(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\n----- Informacoes de Acesso -----\n")
		.append("\nLogin: \n");
		System.out.println(sb.toString());
		promotorFisico.setUsuario(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nSenha: \n");
		System.out.println(sb.toString());
		promotorFisico.setSenha(input.nextLine());
		
		
		return promotorFisico;
	}
	
	public PromotorJuridico solCadPromotorJuridico() {
		PromotorJuridico promotorJuridico = new PromotorJuridico();
		
		StringBuilder sb = new StringBuilder();
		sb.append("----- Cadastro de Promotor do tipo Pessoa Física -----\n")
		.append("Nome da Pessoa Física Responsável: \n");
		System.out.println(sb.toString());
		promotorJuridico.setCpfResponsavel(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nCPF da Pessoa Física Responsável: \n");
		System.out.println(sb.toString());
		promotorJuridico.setCpfResponsavel(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nCNPJ: \n");
		System.out.println(sb.toString());
		promotorJuridico.setCnpj(input.nextLine());;
		promotorJuridico.setFotoPerfil("");
		
		sb = new StringBuilder();
		sb.append("\nRazao Social: \n");
		System.out.println(sb.toString());
		promotorJuridico.setRazaoSocial(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nData de Fundação: \n");
		System.out.println(sb.toString());
		promotorJuridico.setDataFundacao(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nRedes Sociais: \n");
		System.out.println(sb.toString());
		promotorJuridico.setRedesSociais(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nCategorias de Ações: \n");
		System.out.println(sb.toString());
		promotorJuridico.setCategoriasAcoes(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nDescricao Geral: \n");
		System.out.println(sb.toString());
		promotorJuridico.setDescricaoGeral(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nTelefone: \n");
		System.out.println(sb.toString());
		promotorJuridico.setTelefone(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nEndereco: \n");
		System.out.println(sb.toString());
		promotorJuridico.setEndereco(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nEmail: \n");
		System.out.println(sb.toString());
		promotorJuridico.setEmail(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\n----- Informacoes de Acesso -----\n")
		.append("\nLogin: \n");
		System.out.println(sb.toString());
		promotorJuridico.setUsuario(input.nextLine());
		
		sb = new StringBuilder();
		sb.append("\nSenha: \n");
		System.out.println(sb.toString());
		promotorJuridico.setSenha(input.nextLine());
		
		return promotorJuridico;
	}
}