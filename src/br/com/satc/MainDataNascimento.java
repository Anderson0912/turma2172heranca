/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Cliente;
import br.com.satc.objeto.Dependente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author anderson.154517
 */
public class MainDataNascimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Date data = new Date();
        Date dataNascimento = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dataNascimento = sdf.parse("09/12/2000");
        Cliente pai = new Cliente(data, "Anderson","123", "456");
        Dependente filho = new Dependente(pai, dataNascimento, "Zlatan","123","456");
        
        System.out.println(filho.getIdade());
    }
    
}
