package aulas.trabalhandoComDatas.javaDate;

import java.util.Calendar;
import java.util.Date;

public class ExercicioComDatas {
    public static void main(String[] args){

        Date nasc = new Date(2005, Calendar.SEPTEMBER, 22);
        Date date = new Date(2010, Calendar.MAY, 15);
        boolean isAfter = nasc.after(date);
        boolean isBefore = nasc.before(date);

        System.out.println(nasc);
        System.out.println("A data de nasc é depois de date: " + isAfter);
        System.out.println("A data de nasc é antes de date: " + isBefore);
    }
}
