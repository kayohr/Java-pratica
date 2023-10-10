package one.digitalinovation.gof;


public class SingletonEeger {
    private static SingletonEeger instacia = new SingletonEeger();

    private SingletonEeger() {
        super();
    }

    public static SingletonEeger getInstancia(){
     
        return instacia;
    }
}
