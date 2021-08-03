package model;

public class ImovelMODEL {
	private String endereco,estado_de_conservacao,descricao;
	private int imovel_id;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEstado_de_conservacao() {
		return estado_de_conservacao;
	}

	public void setEstado_de_conservacao(String estado_de_conservacao) {
		this.estado_de_conservacao = estado_de_conservacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getImovel_id() {
		return imovel_id;
	}

	public void setImovel_id(int imovel_id) {
		this.imovel_id = imovel_id;
	}
}
