package br.lelo.example.designpatters.commons;

public class Status {

	private StatusEnum status = null;

	public Status(StatusEnum statusEnum) {
		if (statusEnum == null)
			statusEnum = StatusEnum.AGUARDANDO;

		this.status = statusEnum;
	}

	public enum StatusEnum {
		AGUARDANDO, EM_ANDAMENTO, AUTORIZADO, APROVADO
	}

	public StatusEnum nextStatus() {
		if (status.equals(StatusEnum.AGUARDANDO)) {
			return StatusEnum.EM_ANDAMENTO;

		} else if (status.equals(StatusEnum.EM_ANDAMENTO)) {
			return StatusEnum.AUTORIZADO;

		} else if (status.equals(StatusEnum.AUTORIZADO)) {
			return StatusEnum.APROVADO;
		}

		return StatusEnum.AGUARDANDO;
	}

	public StatusEnum getStatus() {
		return status;
	}
}
