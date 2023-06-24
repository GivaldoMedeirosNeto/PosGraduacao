package com.ead.posestacio.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
/**
 * Classe para manipulação de data/hora
 * @author Givaldo Medeiros Neto
 * @version 1.0
 * @since Criação: 24/05/23
 * @since Modificação:
 * 
 */
public class DataHora {

	/**
	 * Método para retornar a Data/Hora atual do sistema
	 * @return Formato (dd/MM/yyyy HH:mm:ss)
	 * @author Givaldo Medeiros Neto
	 */
	public String dataAtual() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	
	/**
	 * Método verificar se a data é anterior a data atual do sistema
	 * @param data em string que será convertido ao formato do sistema
	 * @return True or False
	 * @author Givaldo Medeiros Neto
	 */
	public boolean dataAnteriorAtual(String data) throws ParseException{
		if(formatacaoData().parse(data).before(formatacaoData().parse(dataAtual()))){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Método que verifica quantos dias se passou entre a data atual e a data fornecida
	 * @param data em string que será convertido ao formato do sistema
	 * @return int
	 * @author Givaldo Medeiros Neto
	 */
	public long expiracao(String data) throws ParseException {		
		return ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.parse(dataConvertida(data)));
	}
	
	/**
	 * Método para Formata a Data/Hora
	 * @return Formato (dd/MM/yyyy HH:mm:ss)
	 * @author Givaldo Medeiros Neto
	 */
	private DateFormat formatacaoData() {
		return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	}
	
	/**
	 * Método que converte a Data/Hora passada para ao outro formato
	 * @return Formato (yyyy-MM-dd)
	 * @author Givaldo Medeiros Neto
	 */
	private String dataConvertida(String data) {
		LocalDateTime localDateTime = LocalDateTime.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));		
		return localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}
	
}