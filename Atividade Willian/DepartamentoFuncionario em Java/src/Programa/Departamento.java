/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;

/**
 *
 * @author Pichau
 */
import java.util.ArrayList;
import java.util.List;


public class Departamento 
{
	private String nome;
	private String cnpj;
	private List<Funcionario> funcionarios;
	
	public Departamento(String nome, String cnpj)
	{
		this.nome = nome;
		this.cnpj = cnpj;
		funcionarios = new ArrayList<Funcionario>();
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getCnpj()
	{
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj)
	{
		this.cnpj = cnpj;
	}
	
	public void adicionaFuncionariosNaEmpresa(Funcionario funcionarios)
	{
		this.funcionarios.add(funcionarios);
               
	}
	
	public void imprimiEmpresaComFuncionarios()
	{   
            if(this.funcionarios==null){
                System.out.println("2");
            }else{
		StringBuilder sb = new StringBuilder();
		sb.append("Departamento     : " + this.nome + "\n");
		sb.append("CNPJ         : " + this.cnpj + "\n");
		sb.append("Funcionarios       : " + this.funcionarios + "\n");
		              System.out.println("Teste no valor 0\n \n");
		System.out.println(sb.toString());
            }
	}
}