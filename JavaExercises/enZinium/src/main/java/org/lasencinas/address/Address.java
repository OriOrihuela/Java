package org.lasencinas.address;

import java.security.PrivateKey;
import java.security.PublicKey;

import org.lasencinas.gensig.GenSig;
import org.lasencinas.tokenContract.TokenContract;

public class Address {

    /* ---- Propiedades ---- */
    private PublicKey PK = null;
    private PrivateKey SK = null;
    private double balance = 0;
    private String symbol = "EZI";


    /* ---- Constructor ---- */
    public Address() {
    }

    /* ---- Getters and Setters --- */
    public PublicKey getPK() {
        return PK;
    }

    public void setPK(PublicKey PK) {
        this.PK = PK;
    }

    public PrivateKey getSK() {
        return SK;
    }

    public void setSK(PrivateKey SK) {
        this.SK = SK;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /* ---- Métodos de la clase ---- */
    public void generateKeyPair() {
        setPK(GenSig.generateKeyPair().getPublic());
    }

    @Override
    public String toString() {
        return "\n" + "PK = " + getPK().hashCode() + "\n" +
                "Balance = " + getBalance() + " " + getSymbol();
    }

    public void addEZI(double EZI) {
        this.balance += EZI;
    }

    public void transferEZI(double EZI) {
        this.balance += EZI;
    }

    public void send(TokenContract contract, Double EZI) {
        if (EZI <= this.balance) {
            contract.payable(getPK(), EZI);
            this.balance -= EZI;
        }
    }
}

