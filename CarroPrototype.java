public abstract class CarroPrototype {
    public double preco;

    public abstract String exibirInfo();

    public  abstract CarroPrototype clonar();

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
