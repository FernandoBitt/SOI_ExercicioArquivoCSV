package view;

import java.io.IOException;

import controller.FifaController;
import controller.IFifaController;

public class Principal {

	public static void main(String[] args) {

		IFifaController arqFifa = new FifaController();

		String path = "C:\\TEMP";
		String name = "data.csv";

		try {
			arqFifa.desmpilhaBonsBrasileiros(arqFifa.empilhaBrasileiros(path, name));
			arqFifa.buscaListaBonsJovens(arqFifa.listaRevelacoes(path, name));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
