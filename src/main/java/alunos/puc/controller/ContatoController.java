package alunos.puc.controller;

import alunos.puc.model.Contato;
import alunos.puc.service.ContatoService;
import alunos.puc.view.MenuView;

public class ContatoController {
    private ContatoService service;
    private MenuView view;
    
    public ContatoController() {
        this.service = new ContatoService();
        this.view = new MenuView();
    }
    
    public void iniciar() {
        while (true) {
            int opcao = view.mostrarMenu();
            
            switch(opcao) {
                case 1:
                    cadastrarContato();
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    atualizarContato();
                    case 4:
                    deletarContato();
                    break;
                case 0:
                    view.exibir("Encerrando...");
                    return;
            }
        }
    }
    
    private void deletarContato() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarContato'");
    }

    private void atualizarContato() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarContato'");
    }

    private void listarContatos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarContatos'");
    }

    private void cadastrarContato() {
        Contato contato = view.lerContato();
        boolean sucesso = service.salvar(contato);
        if (sucesso) {
            view.exibir("Contato salvo com sucesso!");
        } else {
            view.exibir("Erro ao salvar contato!");
        }
    }
}