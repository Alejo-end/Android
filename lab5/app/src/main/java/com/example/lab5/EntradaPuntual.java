package com.example.lab5;

import java.util.Date;

public class EntradaPuntual extends Entrada{
    private long id;
    private boolean automatico;
    private long id_adjunto;
    private int anyo;
    private int mes;

    public EntradaPuntual(Date fecha, java.lang.String concepto, java.lang.String categoria, int tipo, double precio,boolean automatico, int periodicidad, long id_cuenta, long id_adjunto) {
        super(fecha, concepto, categoria, tipo, precio, periodicidad, id_cuenta);

        this.id_adjunto = id_adjunto;
        this.automatico = automatico;

    }
}
