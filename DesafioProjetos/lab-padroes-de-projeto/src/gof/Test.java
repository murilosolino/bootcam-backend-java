package gof;

import gof.Facede.Facede;
import gof.Singleton.SingletonEager;
import gof.Singleton.SingletonLazy;
import gof.Singleton.SingletonLazyHolder;
import gof.Strategy.Comportamento;
import gof.Strategy.ComportamentoAgressivo;
import gof.Strategy.ComportamentoDefensivo;
import gof.Strategy.ComportamentoNormal;
import gof.Strategy.Robo;

public class Test {
    public static void main(String[] args) {

        /*Testes realizados ao Design Pattern Singleton */

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        System.out.println();


        /*Testes realizados ao Design Patter Strategy */
        
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();

        /*Testes realizados ao Design Patter Facede  */

        Facede facede = new Facede();
        facede.migrarCliente("Fulano", "22340-554");

    }


}
