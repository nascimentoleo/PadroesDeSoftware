package com.atividade03.questao09;

import java.util.List;

public interface DiretorioComposto extends Diretorio {

	public List<Diretorio> getDiretorios();
	public void addDiretorio(Diretorio novo);
	
}
