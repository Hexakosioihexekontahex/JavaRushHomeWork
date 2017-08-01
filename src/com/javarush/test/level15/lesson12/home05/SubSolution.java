package com.javarush.test.level15.lesson12.home05;

/**
 * Created by ion on 24.06.2016.
 */
public class SubSolution extends Solution {
    public SubSolution(Object pub1) {
        super(pub1);
    }

    public SubSolution(String pub2) {
        super(pub2);
    }

    public SubSolution(Integer pub3) {
        super(pub3);
    }

    protected SubSolution(Double prot1) {
        super(prot1);
    }

    protected SubSolution(Long prot2) {
        super(prot2);
    }

    protected SubSolution(Exception prot3) {
        super(prot3);
    }

    private SubSolution(Boolean priv1){
        super(priv1);
    }

    private SubSolution(Character priv2){
        super(priv2);
    }

    private SubSolution(Number priv3){
        super(priv3);
    }

    SubSolution(Float def1) {
        super(def1);
    }

    SubSolution(Byte def2) {
        super(def2);
    }

    SubSolution(Short def3) {
        super(def3);
    }
}
