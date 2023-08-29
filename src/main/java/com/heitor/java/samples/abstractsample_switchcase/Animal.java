package com.heitor.java.samples.abstractsample_switchcase;
public sealed abstract class Animal permits Cachorro, Coelho, Gato {

    public abstract String acao();
}
