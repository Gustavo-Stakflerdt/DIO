package aulas.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

public class ExercicioComCalendar {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        int diaAtual = 0;

        System.out.printf("Data atual: %tD (mês/dia/ano)", agora);

        System.out.println("\n--------------------------------------------------");

        // Cálculo feito para que o cliente não pague aos Sábados e Domingos.
        agora.add(Calendar.DATE, 15);
        if (Calendar.DAY_OF_WEEK == 7) {
            agora.add(Calendar.DATE, 2);
            diaAtual = -17;
        } else if (Calendar.DAY_OF_WEEK == 1) {
            agora.add(Calendar.DATE, 1);
            diaAtual = -16;
        }

        System.out.printf("O cliente tem até %tD para pagar a fatura.", agora);

        System.out.println("\n--------------------------------------------------");

        agora.add(Calendar.DATE, diaAtual);
        // Para voltar ao dia atual.

        agora.add(Calendar.DATE, 5);
        System.out.printf("Data em que o cliente pagou a fatura: %tD\n", agora);
    }
}