package telas;

import aplicacao.MainApp;
import dao.CuidadorDAO;
import entidades.Cuidador;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PrimeiraTelaControlador {
	@FXML
	private TableView<Cuidador> tabelaPessoa;
	@FXML
	private TableColumn<Cuidador, Integer> colunaCodigo;
	@FXML
	private TableColumn<Cuidador, String> colunaNome;
	@FXML	
	private TableColumn<Cuidador, String> colunaIdade;
	@FXML
	private TableColumn<Cuidador, String> conlunaEmail;
	@FXML
	private TableColumn<Cuidador, String> conlunaEndereco;
	@FXML
	private TableColumn<Cuidador, String> colunaAnimal;
	@FXML
	private TableColumn<Cuidador, String> colunaEspecie;
	
	private Label lblNome;
	@FXML
	private Label lblCodigo;
	@FXML
	private Label lblIdade;
	@FXML
	private Label lblEmail;
	@FXML
	private Label lblEndereco;
	@FXML
	private Label lblAnimal;
	@FXML
	private Label lblEspecie;
	
	private MainApp mainApp;
	
	public PrimeiraTelaControlador() {
		
	}
	
	@FXML
	private void initialize() {
	//	colunaCodigo.setCellValueFactory(c->c.getValue().codigoProperty());
		colunaNome.setCellValueFactory(c->c.getValue().nomeProperty());
		colunaIdade.setCellValueFactory(c->c.getValue().idadeProperty());
		// limpar os detalhes
		mostraDetalhes(null);
		
		// detectar mudanças na seleção
		tabelaPessoa.getSelectionModel().
		selectedItemProperty().
		addListener((observando,valorAntigo, novoValor)->
		mostraDetalhes(novoValor));
	}


	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;		
		CuidadorDAO dao = new CuidadorDAO();
		
		tabelaPessoa.setItems(dao.getListaPessoas());	
		
	}
	
	@FXML
	private void deletarPessoa() {
	
		int indiceSelecionado = tabelaPessoa.getSelectionModel()
				.getSelectedIndex();
		if(indiceSelecionado>=0) {
			tabelaPessoa.getItems().remove(indiceSelecionado);
		}else {
			Alert alerta = new Alert(AlertType.WARNING);
			alerta.setTitle("Nenhum registro selecionado");
			alerta.setHeaderText("Nenhuma pessoa selecionada");
			alerta.setContentText("Você deve selecionar um registro na tabela");
			alerta.showAndWait();
		}
		
	}
	
	
	public void mostraDetalhes(Cuidador pessoa) {
		if(pessoa !=null) {
			lblNome.setText(pessoa.getNome());
			lblIdade.setText(pessoa.getIdade());
			// foi necessário converter de int para String
			lblCodigo.setText(String.valueOf(pessoa.getCodigo()));
			lblEmail.setText(pessoa.getEmail());
			lblEndereco.setText(pessoa.getEndereco());
			lblAnimal.setText(pessoa.getAnimal());
			lblEspecie.setText(pessoa.getEspecie());
		}else {
			lblNome.setText("");
			lblIdade.setText("");
			lblCodigo.setText("");
			lblEmail.setText("");
			lblEndereco.setText("");
			lblAnimal.setText("");
			lblEspecie.setText("");
		}
		
	}
	@FXML
	private void cliqueNovaPessoa() {
		Cuidador pessoa = new Cuidador("");
		mainApp.mostrarAdicionarEditarPessoa(pessoa);
		//mainApp.getLista().add(pessoa);
		tabelaPessoa.getItems().add(pessoa);
	//	mostraDetalhes(pessoa);
		
	}
	
	@FXML
	private void cliqueEditarPessoa() {
		Cuidador pessoa = tabelaPessoa.getSelectionModel().getSelectedItem();
		if(pessoa!=null) {
			mainApp.mostrarAdicionarEditarPessoa(pessoa);
			mostraDetalhes(pessoa);
		}
	}
	

}
