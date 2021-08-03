package model;

public class ContratoMODEL {
		private String duracao,pagamento;
		private int id_contrato,id_locador,id_locatario,id_imovel,valor;
		public String getDuracao() {
			return duracao;
		}
		public void setDuracao(String duracao) {
			this.duracao = duracao;
		}
		public String getPagamento() {
			return pagamento;
		}
		public void setPagamento(String pagamento) {
			this.pagamento = pagamento;
		}
		public int getId_contrato() {
			return id_contrato;
		}
		public void setId_contrato(int id_contrato) {
			this.id_contrato = id_contrato;
		}
		public int getId_locador() {
			return id_locador;
		}
		public void setId_locador(int id_locador) {
			this.id_locador = id_locador;
		}
		public int getId_locatario() {
			return id_locatario;
		}
		public void setId_locatario(int id_locatario) {
			this.id_locatario = id_locatario;
		}
		public int getId_imovel() {
			return id_imovel;
		}
		public void setId_imovel(int id_imovel) {
			this.id_imovel = id_imovel;
		}
		public int getValor() {
			return valor;
		}
		public void setValor(int valor) {
			this.valor = valor;
		}
}
