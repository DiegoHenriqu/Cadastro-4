package entidades;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cuidador {
	private IntegerProperty codigo;
	private StringProperty nome;
	private StringProperty email;
	private StringProperty idade;
	private StringProperty endereco;
	private StringProperty animal;
	private StringProperty especie;
	
	public Cuidador(String nome) {
		this.nome = new SimpleStringProperty(nome);
		this.email = new SimpleStringProperty();
		this.idade = new SimpleStringProperty();
		this.codigo = new SimpleIntegerProperty();
		this.endereco = new SimpleStringProperty();
		this.animal = new SimpleStringProperty();
		this.especie = new SimpleStringProperty();
		
	}
	
	public final IntegerProperty codigoProperty() {
		return this.codigo;
	}
	
	public final int getCodigo() {
		return this.codigoProperty().get();
	}
	
	public final void setCodigo(final int codigo) {
		this.codigoProperty().set(codigo);
	}
	
	public final StringProperty nomeProperty() {
		return this.nome;
	}
	
	public final String getNome() {
		return this.nomeProperty().get();
	}
	
	public final void setNome(final String nome) {
		this.nomeProperty().set(nome);
	}
	
	public final StringProperty emailProperty() {
		return this.email;
	}
	
	public final String getEmail() {
		return this.emailProperty().get();
	}
	
	public final void setEmail(final String email) {
		this.emailProperty().set(email);
	}
	
	public final StringProperty idadeProperty() {
		return this.idade;
	}
	
	public final String getIdade() {
		return this.idadeProperty().get();
	}
	
	public final void setIdade(final String idade) {
		this.idadeProperty().set(idade);
	}
	
	public final StringProperty enderecoProperty() {
		return this.endereco;
	}
	
	public final String getEndereco() {
		return this.enderecoProperty().get();
	}
	
	public final void setEndereco(final String endereco) {
		this.enderecoProperty().set(endereco);
	}
	
	public final StringProperty animalProperty() {
		return this.animal;
	}
	
	public final String getAnimal() {
		return this.animalProperty().get();
	}
	
	public final void setAnimal(final String animal) {
		this.animalProperty().set(animal);
	}
	
	public final StringProperty especieProperty() {
		return this.especie;
	}
	
	public final String getEspecie() {
		return this.especieProperty().get();
	}
	
	public final void setEspecie(final String especie) {
		this.especieProperty().set(especie);
	}
	
	
}
