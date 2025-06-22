package cotacaoMoedas.model.services;

import cotacaoMoedas.controller.CotacaoController;
import cotacaoMoedas.model.entities.Cotacao;
import cotacaoMoedas.model.entities.Moeda;

public class CotacaoService {

    private CotacaoController controller = new CotacaoController();

    public Cotacao buscarCotacaoPorMoeda(Moeda moeda) {
        try {
            return controller.buscarCotacao(moeda.getCodigomoeda());
        } catch (Exception e) {
            System.out.println("Erro ao buscar cotação para " + moeda.getCodigomoeda() + ": " + e.getMessage());
            return null;
        }
    }
}
