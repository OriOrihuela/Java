package org.lasencinas.tokenContract;

import org.lasencinas.address.Address;


import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class TokenContract {

    /* ---- Propiedades ---- */
    private String name = null;
    private String symbol = null;
    private double totalSupply = 0;
    private PublicKey ownerPK = null;
    private String tokenSymbol = "RNiLL";

    private Map<PublicKey, Double> balances = new HashMap<>();


    /* ---- Constructor ---- */
    public TokenContract(Address address) {
        this.ownerPK = address.getPK();
        this.symbol = address.getSymbol();
        this.totalSupply = address.getBalance();
    }


    /* ---- Getters ---- */
    public PublicKey getOwnerPK() {
        return ownerPK;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String symbol() {
        return tokenSymbol;
    }

    public Map<PublicKey, Double> getBalances() {
        return balances;
    }

    public double totalSupply() {
        return totalSupply;
    }


    /* ---- Setters ---- */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }


    /* ----- Métodos principales ---- */
    @Override
    public String toString() {
        return "\n" + "name = " + getName() + "\n" +
                "symbol = " + getSymbol() + "\n" +
                "totalSupply " + totalSupply() + "\n" +
                "owner PK " + getOwnerPK().hashCode();
    }

    public void addOwner(PublicKey PK, Double units) {
        getBalances().putIfAbsent(PK, units);
    }

    public int numOwners() {
        return getBalances().size();
    }

    public double balanceOf(PublicKey owner) {
        if (getBalances().containsKey(owner)) {
            return getBalances().get(owner);
        } else {
            return 0;
        }
    }

    private void require(Boolean holds) throws Exception {
        if (holds) {
        } else {
            throw new Exception();
        }
    }

    public void transfer(PublicKey recipient, double units) {
        try {
            require(balanceOf(getOwnerPK()) > units);
            getBalances().put(getOwnerPK(), balanceOf(getOwnerPK()) - units);
            getBalances().put(recipient, balanceOf(recipient) + units);
        } catch (Exception e) {
            ;
        }
    }

    public void transfer(PublicKey sender, PublicKey recipient, double units) {
        try {
            require(balanceOf(sender) > units);
            getBalances().put(sender, balanceOf(sender) - units);
            getBalances().put(recipient, balanceOf(recipient) + units);
        } catch (Exception e) {
            ;
        }
    }

    public void owners() {
        for (Map.Entry<PublicKey, Double> PK : getBalances().entrySet()) {
            if (PK.getKey().hashCode() != getOwnerPK().hashCode()) {
                System.out.println("Owner: " + PK.getKey().hashCode() + " " + PK.getValue() + " " + getSymbol());
            }

        }
    }
}
