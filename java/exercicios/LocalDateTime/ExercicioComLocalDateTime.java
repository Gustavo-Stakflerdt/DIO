package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDateTime;
import java.util.Date;

public class ExercicioComLocalDateTime {
    public static void main(String[] args){

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime passado = agora.minusDays(6).minusYears(11).minusHours(3).minusMinutes(27);
        LocalDateTime futuro = passado.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println("Data do passado: " + passado);
        System.out.println("---------------------------------------------------");
        System.out.println("Data do futuro: " + futuro);
    }
}
