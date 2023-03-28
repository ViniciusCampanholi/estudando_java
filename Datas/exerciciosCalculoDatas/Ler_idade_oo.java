package exerciciosCalculoDatas;

import java.time.LocalDate;
import java.time.Period;

public class Ler_idade_oo {
	private String nome;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	
	public Ler_idade_oo(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
		this.nome = nome;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public LocalDate dataAtual() {
		LocalDate dataAtual = LocalDate.now();
		return dataAtual;
	}
	
	public LocalDate dataNascimento() {
		LocalDate dataNascimento = LocalDate.of(getAnoNascimento(), getDiaNascimento(), getMesNascimento());
		return dataNascimento;
	}
	public Period calcularPeriodo() {
		Period dif = Period.between(dataNascimento(), dataAtual());
		return dif;
	}
	
	public void imprimir() {
		System.out.println("Nome: "+getNome());
		System.out.println("Data atual: "+dataAtual());
		System.out.println("Data de referencia: " + dataNascimento());
		System.out.println("Deferença entre as datas é de "+calcularPeriodo().getYears()+" anos, "+calcularPeriodo().getMonths()+" meses e "+calcularPeriodo().getYears()+" dias.");
	}
}