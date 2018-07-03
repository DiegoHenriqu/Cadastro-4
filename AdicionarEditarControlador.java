package telas;


import entidades.Cuidador;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdicionarEditarControlador {
	@FXML
	private TextField txtCodigo;
	@FXML
	private TextField txtNome;
	@FXML
	private TextField txtEmail;
	@FXML
	private TextField txtIdade;
	@FXML
	private TextField txtEndereco;
	@FXML 
	private TextField txtAnimal;
	@FXML
	private TextField txtEspecie;
	
	
	private Stage palcoDialogo;
	private Cuidador pessoa;
	
	
	@FXML
	private void initialize() {
		
	}
	
	public void setPalcoDialogo(Stage palcoDialogo) {
		this.palcoDialogo = palcoDialogo;
	}
	
	public void setPessoa(Cuidador pessoa) {
		this.pessoa = pessoa;
		txtCodigo.setText(String.valueOf(pessoa.getCodigo()));
		txtNome.setText(pessoa.getNome());
		txtEmail.setText(pessoa.getEmail());
		txtIdade.setText(pessoa.getIdade());
		txtEndereco.setText(pessoa.getEndereco());
		txtAnimal.setText(pessoa.getAnimal());
		txtEspecie.setText(pessoa.getEspecie());
	}
	@FXML
	private void cliqueOk() {
		pessoa.setCodigo(Integer.parseInt(txtCodigo.getText()));
		pessoa.setEmail(txtEmail.getText());
		pessoa.setIdade(txtIdade.getText());
		pessoa.setNome(txtNome.getText());
		pessoa.setEndereco(txtEndereco.getText());
		pessoa.setAnimal(txtAnimal.getText());
		pessoa.setEspecie(txtEspecie.getText());
		palcoDialogo.close();
	}
	@FXML
	private void cliqueCancelar() {
		palcoDialogo.close();
	}
}
