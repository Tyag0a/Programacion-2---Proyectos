package co.edu.uniquindio.factory;
//singlenton
//aqui se inicializan los datos 

public class ModelFactory {

    private static ModelFactory instance;

    private ModelFactory() {

    }
    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }
}