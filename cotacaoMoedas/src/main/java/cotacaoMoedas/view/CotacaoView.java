package cotacaoMoedas.view;

import java.util.Scanner;
import cotacaoMoedas.model.entities.Cotacao;
import cotacaoMoedas.model.entities.Moeda;
import cotacaoMoedas.model.services.CotacaoService;

public class CotacaoView {

    private CotacaoService service = new CotacaoService();

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- Sistema de Cotação de Moedas --------");

        while (true) {
            System.out.print("Digite o código da moeda (USD, EUR ou BTC) ou 'sair' para encerrar: ");
            String codigo = scanner.nextLine();

            if (codigo.equalsIgnoreCase("sair")) {
                System.out.println("Saiu :p");
                break;
            }

            Moeda moeda = new Moeda();
            moeda.setCodigoMoeda(codigo);

            Cotacao cotacao = service.buscarCotacaoPorMoeda(moeda);

            if (cotacao != null) {
                System.out.println("Cotação da moeda " + moeda.getCodigomoeda().toUpperCase() + ":");
                System.out.println("Compra: " + cotacao.getBid());
                System.out.println("Venda: " + cotacao.getAsk());
                System.out.println("Data: " + cotacao.getCreate_date());
            } else {
                System.out.println("Não foi possível obter a cotação.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
