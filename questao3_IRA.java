import javax.swing.*;

public class questao3_IRA {
    public static void main(String[]args){
        double calculo, cargaHorariaTotal = 0, resultadoTeste = 0, resultadoIra;

        int numeroMateria = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de matérias?"));

        for (int i = 1; i <= numeroMateria; i++){
        double notaMateria = Double.parseDouble(JOptionPane.showInputDialog("Quais foram as nota da matéria: " + i));
        System.out.println("Nota da materia "+ i +" : " + notaMateria);
        double cargahoraria = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a carga horária da matéria: "+ i));
        System.out.println("Carga horária "+ i + " : "+ cargahoraria);

        calculo = notaMateria * cargahoraria;
        resultadoTeste += calculo;
        cargaHorariaTotal += cargahoraria;
    }

    cargaHorariaTotal = cargaHorariaTotal * 100;

    resultadoIra = (resultadoTeste/ (cargaHorariaTotal));
    
    JOptionPane.showMessageDialog(null,"Seu IRA é de "+resultadoIra);
}
}