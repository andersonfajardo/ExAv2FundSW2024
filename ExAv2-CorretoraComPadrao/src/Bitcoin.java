class Bitcoin implements Criptomoeda {
    private double saldo;

    public Bitcoin(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void comprar(double quantidade) {
        saldo += quantidade;
        System.out.printf("Ordem de compra " + quantidade +  " Bitcoin realizada com sucesso. Saldo atual: " + saldo + " Bitcoin \n");
    }

    @Override
    public void vender(double quantidade) {
        if (saldo >= quantidade) {
            System.out.printf("Ordem de venda " + quantidade +  " Bitcoin realizada com sucesso. Saldo atual: " + saldo + " Bitcoin \n");
        } else {
            System.out.println("Saldo de Bitcoin insuficiente. \n");
        }
    }
}