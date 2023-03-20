/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Wendel Muniz
 */
public class Funcionario extends Pessoa{
	private String id;
        private String habilitacao;
        private String s = "Funcionario";
	
	public Funcionario(String id, String nome, String funcao, String habilitacao) {
            super(id, nome, funcao, habilitacao);
            this.id = id;
            this.habilitacao = habilitacao;
	}
        
        public void Funcionario(){
        }
        
        public void funcionario(){
               System.out.println(s);         
        }
         public void funcionario(String s){
               System.out.println(s);         
        }
        
        @Override
        public String getFuncao() {
            return funcao;
	}

	public String getNomeChefe() {
            return id;
	}
        
        public String getHabilitacao() {
            return habilitacao;
	}
              
	@Override
	public String toString() {
            return "Funcionario [funcao=" + funcao + " nome=" + nome +" habilitacao=" + habilitacao +"]";
	}

}
    
