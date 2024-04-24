package Entities;

import Enumerators.CurrencyEnums;

public class Currency {
        private Double cop;
        private Double usd;
        private Double ars;
        private Double brl;

    public Currency() {
    }

    public Currency(Double cop, Double usd, Double ars, Double brl) {
        this.cop = cop;
        this.usd = usd;
        this.ars = ars;
        this.brl = brl;
    }

    public Double getCop() {
        return cop;
    }

    public void setCop(Double cop) {
        this.cop = cop;
    }

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }

    public Double getArs() {
        return ars;
    }

    public void setArs(Double ars) {
        this.ars = ars;
    }

    public Double getBrl() {
        return brl;
    }

    public void setBrl(Double brl) {
        this.brl = brl;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "cop=" + cop +
                ", usd=" + usd +
                ", ars=" + ars +
                ", brl=" + brl +
                '}';
    }
}
