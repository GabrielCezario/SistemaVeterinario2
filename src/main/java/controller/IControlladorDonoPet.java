package controller;

import java.util.List;

import exception.CamposCadastroVazios;
import exception.ObjetoNulo;
import model.DonoPet;

public interface IControlladorDonoPet {
	
	public DonoPet cadastrarDonoPet(DonoPet donoPet) throws CamposCadastroVazios, ObjetoNulo;
	public List<DonoPet> listarDonoPets();
	public DonoPet atualizarDonoPet(DonoPet donoPet) throws CamposCadastroVazios, ObjetoNulo;
	public void deletarDonoPet(DonoPet donoPet) throws ObjetoNulo;
	public List<DonoPet> listarDonoPetsPorNome(String nome);
	

}
