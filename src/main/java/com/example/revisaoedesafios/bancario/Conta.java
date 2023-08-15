package com.example.revisaoedesafios.bancario;

public class Conta {
    private int id;
    private String titular;
    private double saldo;

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valorDeposito) {
        this.saldo = saldo + valorDeposito;
    }

    public void sacar(double valorSaque) {
        this.saldo = saldo - valorSaque;
    }

    public Conta(int id, String titular, double saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(int id) {
        this.id = id;
    }
}
