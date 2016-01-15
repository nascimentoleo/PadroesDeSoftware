package com.atividade03.questao08;

import java.util.HashMap;
import java.util.Map;

public class ImagemFactory {
	
	private static Map<String,Imagem> mapaDeImagens;

	static{
		mapaDeImagens = new HashMap<>();
		mapaDeImagens.put("JPGE", new ImagemJPEG());
		mapaDeImagens.put("GIF", new ImagemGIF());
	}
	
	public Imagem getFormatoImagem(String key){
		return mapaDeImagens.get(key);
	}
}
