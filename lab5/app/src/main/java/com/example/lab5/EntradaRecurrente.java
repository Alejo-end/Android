package com.example.lab5;

import java.util.Date;

public class EntradaRecurrente extends Entrada{
    private long id;
    private long id_operacion;

    public EntradaRecurrente(Date fecha, String concepto, String categoria, int tipo, double precio, int periodicidad, long id_cuenta) {
        super(fecha, concepto, categoria, tipo, precio, periodicidad, id_cuenta);

        this.id_operacion = id_operacion;
    }
}
