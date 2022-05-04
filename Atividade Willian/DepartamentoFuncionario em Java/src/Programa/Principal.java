/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Programa;

/**
 *
 * @author Pichau
 */
public class Principal 
{
	public static void main(String[] args) 
	{
		Funcionario func = new Funcionario("paulao", "Cadastro", 1000.0, "RG 8450");
		Funcionario func1 = new Funcionario("Rodrigao", "Cadastro", 1000.0,  "RG 45450");
		Funcionario func2 = new Funcionario("bigodão", "", 150000.0,  "RG 4450");
		Funcionario func3 = null;
		
		
                
		Departamento e = new Departamento("Wil Wil Ambulancias", "44654646546");
				
		e.adicionaFuncionariosNaEmpresa(func);
		e.adicionaFuncionariosNaEmpresa(func1);
		e.adicionaFuncionariosNaEmpresa(func2);
		
		
		e.imprimiEmpresaComFuncionarios();
                
                
                
                 System.out.println("");
                 func.bonificarDoSalario();
                 func1.bonificarDoSalario();
                 func2.bonificarDoSalario();
                    
                 e.imprimiEmpresaComFuncionarios();
                 
              
                  
                 
	}
        
    

               
}
