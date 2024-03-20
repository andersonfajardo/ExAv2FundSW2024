class Ethereum implements Criptomoeda {
    private double saldo;

    public Ethereum(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void comprar(double quantidade) {
        saldo += quantidade;
        System.out.printf("Ordem de compra " + quantidade +  " Ethereum realizada com sucesso. Saldo atual: " + saldo + " Ethereum \n");
    }

    @Override
    public void vender(double quantidade) {
        if (saldo >= quantidade) {
            System.out.printf("Ordem de venda " + quantidade +  " Ethereum realizada com sucesso. Saldo atual: " + saldo + " Ethereum \n");
        } else {
            System.out.println("Saldo em Ethereum insuficiente. \n");
        }
    }
}