package org.javabasics.model;
import org.javabasics.model.Symbol;
import org.javabasics.model.Operation;

public class Subtract extends Operation {

    public Subtract(Integer number_1, Integer number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
        this.result = this.number_1 - this.number_2;
    }

    @Override
    public String getSymbol() {
        return Symbol.SUBTRACT.value();
    }

}