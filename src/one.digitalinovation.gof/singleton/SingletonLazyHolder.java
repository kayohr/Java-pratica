package one.digitalinovation.gof;


public class SingletonLazyHolder {
    
    private static class InstanceHolder{

        public static SingletonLazyHolder instacia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
     
        return InstanceHolder.instacia;
    }
}
