package subsistema2.cep;

import one.digitalinovation.gof.SingletonEeger;

public class CepApi {
    private static CepApi instacia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia(){
     
        return instacia;
    }

    public String recuperarCidade(String cep){
        return "SP";
    }
}
