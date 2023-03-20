/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import cadastro_func.tela_cadastro;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

/**
 *
 * @author Fernando
 */
public class Busca extends tela_cadastro{

    public void buscar(JComboBox<String> jRbuscar, JComboBox<String> jRnome, JTextArea jBuscados){

        String habilitacao =(String) jRbuscar.getSelectedItem();
        String selNome = (String) jRnome.getSelectedItem(); 
 
        if(habilitacao.equals("Chefe")){
            for(Funcionario funcionario : lista){
                if(funcionario.getNome().equals(selNome)){
                    jBuscados.append(funcionario.getNomeChefe()+"\n");
                    imprimirRecursividadeChefe(jBuscados, funcionario.getNomeChefe());
                }
            }       
        }else if(habilitacao.equals("Subordinado")){
            
            if(selNome.equals("Jener de Souza Novais")){
                for(Funcionario funcionario : lista){
                    jBuscados.append(funcionario.getNome()+"\n");
                }
            }else{
                for(Funcionario funcionario : lista){
                    if(funcionario.getNomeChefe().equals(selNome)){
                        jBuscados.append(funcionario.getNome()+"\n");
                        imprimirRecursividadeSubordinado(jBuscados, funcionario.getNome());
                    }
                }
            }
        }
    }
    
    public static void imprimirRecursividadeChefe(JTextArea jBuscados, String selNome) {
        for (int i=0; i < lista.size()-1;i++) {
            if (lista.get(i).getNome().equals(selNome)){
                jBuscados.append(lista.get(i).getNomeChefe()+"\n");
                imprimirRecursividadeChefe(jBuscados, lista.get(i).getNomeChefe());
            }
        }
    }
    
    public static void imprimirRecursividadeSubordinado(JTextArea jBuscados, String selNome) {
        for (int i=0; i < lista.size()-1;i++) {
            if (lista.get(i+1).getNomeChefe().equals(selNome)) {
                jBuscados.append(lista.get(i+1).getNome()+"\n");
                imprimirRecursividadeSubordinado(jBuscados, lista.get(i+1).getNome());
            }
        }
    }
}
    
