/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import static br.com.satc.objeto.Dependente.calculaIdade;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author markson
 */
public class MainDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Date hoje = new Date();

        JOptionPane.showMessageDialog(null, hoje);
        
        Date nascimento = new Date();

        SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
        nascimento = conversor.parse("12/03/1991");
        JOptionPane.showMessageDialog(null, nascimento);
        
    }

}
