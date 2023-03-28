package exerciciosCalculoDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) throws ParseException {
		
		//Instanciando a classe Date
		Date data = new Date();	
		System.out.println("Data agora: "+data);

		//A classe Calendar � a mais recomendada, mas por ser uma classe abstrata n�o pode ser instanciada
		Calendar calendar = Calendar.getInstance();
		System.out.println("Data e hora atual: " + calendar.getTime());
		
		//Usando m�todos especificos da classe calendar
		//Calendar.YEAR
		System.out.println("Ano: " + calendar.get(Calendar.YEAR));
		
		//Calendar.MONTH > Retorna o numero mes, vale ressaltar que os meses est�o dispostos com janeiro sendo o mes 0 e dezembro o mes 11
		System.out.println("Mes: " + calendar.get(Calendar.MONTH));
		
		//Calendar.DAY_OF_MONTH
		System.out.println("Dia do mes: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		//Formatar data usando a classe SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: " + sdf.format(data));
		
		//Pegando a entrada em String e formatando para data na sa�da
		String dataEntrada = "07/08/1995";
		Date dataSaida = sdf.parse(dataEntrada);
		System.out.println("Entrada com string e saida com data: "+ sdf.format(dataSaida));

		//Atribuindo dados de data a uma variavel
		LocalDate dataNascimento = LocalDate.of(1995, 8, 7);
		LocalDate dataAtual = LocalDate.now();
		
		//Armazenando a diferen�a entre datas em uma vari�vel
		long difDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);
		long difMes = ChronoUnit.MONTHS.between(dataNascimento, dataAtual);
		long difAnos = ChronoUnit.YEARS.between(dataNascimento, dataAtual);
		
		System.out.println("Diferen�a em dias entre datas: " + difDias);
		System.out.println("Diferen�a em meses entre datas: " + difMes);
		System.out.println("Diferen�a em anos entre datas: " + difAnos);
		
		//Utilizando a classe Period para obter a diferen�a entre datas
		Period dif = Period.between(dataNascimento, dataAtual);
		System.out.println("Periodo entre datas: "+dif.getYears()+" anos, "+dif.getMonths()+" meses e "+dif.getDays()+" dias.");
		
	
	}

}
