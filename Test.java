package one.digitalinovation.gof;

import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.singletn.SingletonEeger;
import one.digitalinovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinovation.gof.strategy.Robo;
import one.digitalinovation.gof.strategy.ComportamentoNormal;
import one.digitalinovation.gof.strategy.comportamentoDefensivo;




public class Test {
    public static void main(String[] args){
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonEeger.getInstancia();
        System.out.println(lazy);


        //strategy
        Comportamento normal = new comportamentoNormal();
        Comportamento defensivo = new comportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robot();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Fulano", "123456");
    }
}
