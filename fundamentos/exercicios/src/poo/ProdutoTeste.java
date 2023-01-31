package poo;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.println(p1.preco * (1-p1.desconto));
        System.out.println(p2.preco * (1-p2.desconto));

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.5);
        System.out.printf("Media do carrinho  = R$ %.2f",(precoFinal1 + precoFinal2)/2);




        
        
    }
}
