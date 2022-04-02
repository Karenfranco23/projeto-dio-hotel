package com.hotel;

import com.hotel.dominio.*;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Quarto quart1 = new Quarto(23, true, QuartoTipo.CAMAKINGSIZE);
        Quarto quart2 = new Quarto(107, true, QuartoTipo.CAMACASAL);
        Quarto quart3 = new Quarto(279,false, QuartoTipo.CAMASOLTEIRO);
        Quarto quart4 = new Quarto(25, true, QuartoTipo.DUASCAMASSOLTEIRO);

        Cliente hosp1 = new Cliente("Marta",
                LocalDate.of(1967, Month.OCTOBER,15),
                "127.822.000-00",
                EstadoCivilTipo.CASADO,
                "(14) 99999-0000",
                SexoTipo.FEMININO);

        Cliente hosp2 = new Cliente("Margarida",
                LocalDate.of(1952, Month.APRIL,29),
                "456.111.111-11",
                EstadoCivilTipo.VIUVO,
                "(14) 98888-8888",
                SexoTipo.FEMININO);

        CheckIn.atribuirQuartos(quart1);
        CheckIn.atribuirQuartos(quart2);
        CheckIn.atribuirQuartos(quart3);
        CheckIn.atribuirQuartos(quart4);

        CheckIn.fazerCheckIn(quart1,hosp1);
        CheckIn.fazerCheckIn(quart1,hosp2);
    }
}
