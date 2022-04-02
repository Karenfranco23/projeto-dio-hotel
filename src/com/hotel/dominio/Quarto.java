package com.hotel.dominio;

public class Quarto {
    private int numero;
    private boolean disponivel;
    private QuartoTipo quartoTipo;
    private Cliente cliente;

    public Quarto(int numero, boolean disponivel, QuartoTipo quartoTipo) {
        this.numero = numero;
        this.disponivel = disponivel;
        this.quartoTipo = quartoTipo;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public QuartoTipo getQuartoTipo() {
        return quartoTipo;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;

    }
    public void checkInCliente(Cliente cliente){
        this.cliente = cliente;
        this.disponivel = false;
    }
    public void checkOutCliente() {
        this.cliente = null;
        this.disponivel = true;
    }
}
