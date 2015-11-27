package com.laboratorio.terceiraquestao;

public interface EstadoDeUmProcesso {
	
    public String avisarInteressado();
    public void validar(Processo processo);
	public void cancelar(Processo processo);
	public void designar(Processo processo);
	public void indeferir(Processo processo);
	public void deferir(Processo processo);
	public void prazoLegal(Processo processo);
}
