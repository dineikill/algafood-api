package com.algaworks.algafood.domain.exception;

public class RestaurateNaoEncontradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;
	
	public RestaurateNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public RestaurateNaoEncontradoException(Long id) {
		this(String.format("Não existe um cadastro de restaurante com código %d", id));
	}
	
	

}
