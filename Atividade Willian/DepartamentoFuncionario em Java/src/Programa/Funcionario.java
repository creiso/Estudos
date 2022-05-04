/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;

/**
 *
 * @author Pichau
 */
public class Funcionario
{
	private static int Identificador;
	
	private String nome;
	private String departamento;
	private double salario;
	private String rg;
	
	
	public Funcionario(String nome, String departamento, double salario, String rg)
	{
		this.setNome(nome);
		this.setDepartamento(departamento);
		this.setSalario(salario);
		this.setRg(rg);
		Funcionario.Identificador ++;
	}
	
	public static int getIdentificador()
	{
		return Funcionario.Identificador;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getDepartamento()
	{
		return this.departamento;
	}
	
	public void setDepartamento(String departamento)
	{
		this.departamento = departamento;
	}
	
	public double getSalario()
	{
		return this.salario;
	}
	
	private void setSalario(double salario)
	{
		this.salario = salario;
	}
	
		
	public String getRG()
	{
		return this.rg;
	}
	
	public void setRg(String rg)
	{
		this.rg = rg;
	}
	
	
	
	
	
	
	
	public double bonificarDoSalario()
	{   
               double salarioo = this.salario;
               if(salario<150000){
		salarioo = this.salario+2000; 
		this.salario = salarioo; 
               }else{
                   salario= salario+1500;
               }
		return this.salario;
                
                
              
	}
                
	
	
	
	public String imprimeFuncionarioNaTela()
	{       
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do funcionario: " + this.getNome() + "\n");
		sb.append("Departamento       : " + this.getDepartamento() + "\n");
		sb.append("Salario            : " + this.getSalario() + "\n");
		sb.append("Rg                 : " + this.getRG() + "\n");
		
		sb.append("1");
		return sb.toString();
	}
	
	
	
	
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("  " + "\n");
		sb.append("Nome do funcionario: " + this.getNome() + "\n");
		sb.append("Departamento       : " + this.getDepartamento() + "\n");
		sb.append("Salario            : " + this.getSalario() + "\n");
		sb.append("Rg                 : " + this.getRG() + "\n");
		
		
		return sb.toString();
	}
	
}