public class App {
    public static void main(String[] args) {
        
        
        Criptomoeda bitcoin = new Bitcoin(0.5);
        Criptomoeda ethereum = new Ethereum(1.0);

        Conta conta1Bitcoin = new Conta(bitcoin);
        Conta conta2Ethereum = new Conta(ethereum);

        Corretora nossaCorretora = new Corretora();

        nossaCorretora.comprar(conta1Bitcoin,1.0);
        nossaCorretora.vender(conta1Bitcoin,0.5);
        nossaCorretora.comprar(conta2Ethereum,2.0);
        nossaCorretora.vender(conta2Ethereum,1.5);
    }
}