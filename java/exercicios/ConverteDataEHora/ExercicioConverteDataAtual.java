package aulas.trabalhandoComDatas.javaDateFormat;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ExercicioConverteDataAtual {
    public static void main(String[] args){
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:mmm");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
    }
}
