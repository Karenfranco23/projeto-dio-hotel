package com.hotel.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CheckIn {
    private static List<Quarto> quartos = new ArrayList<Quarto>();

    public static void atribuirQuartos(Quarto quarto){
        quartos.add(quarto);
    }

    public static void fazerCheckIn(Quarto quarto, Cliente cliente) {
        for (Quarto q : quartos) {
            if (q.getNumero() == quarto.getNumero()){
                if (q.isDisponivel()){
                    q.checkInCliente(cliente);
                    System.out.println("Check-in realizado com sucesso!");
                } else {
                    System.out.println("Quarto indisponível!");
                }
            }
        }
    }

    public static void fazerCheckOut(Quarto quarto) {
        for (Quarto q : quartos) {
            if (q.getNumero() == quarto.getNumero()) {
                q.checkOutCliente();
                System.out.println("Check-out realizado com sucesso!");
            }
        }
    }
}

