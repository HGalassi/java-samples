package com.heitor.java.samples.abstractsample_switchcase;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 *  Pattern Matching
 */
@Component

public class SampleImpl {
    public SampleImpl(){
        System.out.println(verificaAnimal(new Cachorro()));
        System.out.println(verificaAnimal(new Gato()));
        System.out.println(verificaAnimal(new Coelho()));
    }

    public String verificaAnimal(Object obj){
        return switch (obj){
            case Cachorro c -> String.format(" Sou um cachorro e quando eu entro em ação eu faço %s",  c.acao());
            case Coelho k -> String.format (" Apareço na páscoa e em ação eu faço  %s", k.acao());
            case Gato g -> String.format( " Sou o melhor bichinho e não gosto de ação, mas faço: %s", g.acao());
            default -> throw new IllegalStateException("Unexpected value: " + obj);
        };


    }
}
