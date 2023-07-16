package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate fechaUno=LocalDate.now();
        LocalDate fechaDos=LocalDate.of(2023,1,16);
        Long diferenciaEntreFecha= ChronoUnit.DAYS.between(fechaUno,fechaDos);
        int año = fechaUno.getYear();
        int mes = fechaUno.getMonthValue();
        int día = fechaUno.getDayOfMonth();
        //LocalDate fechaDespues = fechaUno.plusDays(10);
        LocalDate fechaAnterior = fechaUno.minusDays(10);
        DateTimeFormatter formatoDeseado = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        String fechaFormateada = fechaAnterior.format(formatoDeseado);


        LocalDate fechaInicial = LocalDate.of(2023, 7, 16);
        int diasASumar = 10;

        LocalDate fechaDespues = fechaUno;
        int diasSumados = 0;

        while (diasSumados < diasASumar) {
            fechaDespues = fechaDespues.plusDays(1);
            if (fechaDespues.getDayOfWeek() != DayOfWeek.SUNDAY) {
                diasSumados++;
            }
        }

        System.out.println(DayOfWeek.SUNDAY);


    }


}