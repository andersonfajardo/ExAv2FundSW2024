class Conta {
    private Criptomoeda criptomoeda;

    public Conta(Criptomoeda criptomoeda) {
        this.criptomoeda = criptomoeda;
    }

    public void comprar(double quantidade) {
        criptomoeda.comprar(quantidade);
    }

    public void vender(double quantidade) {
        criptomoeda.vender(quantidade);
    }
}