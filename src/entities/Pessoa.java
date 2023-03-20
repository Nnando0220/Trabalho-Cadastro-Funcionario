/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Wendel Muniz
 */
public abstract class Pessoa {

    public String nome;
    public String nomeChefe;
    public String habilitacao;
    public String funcao;

    public Pessoa(String nomeChefe, String nome, String funcao, String habilitacao) {
        this.nomeChefe = nomeChefe;
        this.nome = nome;
        this.funcao = funcao;
        this.habilitacao = habilitacao;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getNome() {
        return nome;
    }
 
    @Override
	public String toString() {
            return "Funcionario [funcao=" + funcao + " nome=" + nome +" habilitacao=" + habilitacao +"]";
	}

}