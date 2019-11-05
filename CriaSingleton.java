public class CriaSingleton {

    private static CriaSingleton cSton;

    private CriaSingleton() {
    }

    public static CriaSingleton getInstance() {
        if (cSton == null) {
            cSton = new CriaSingleton();
            System.out.println("Criado uma nova instancia da classe CriaSingleton");
        } else {
            System.out.println("Uma Instancia ja foi criada para a aplicação");
        }
        return cSton;
    }
}