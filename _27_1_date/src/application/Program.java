package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		// O java gera a data de acordo com a quantidade de ilissegundos a partir de 1970
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); // data atual
		Date x2 = new Date(System.currentTimeMillis()); // calcula o tempo em milissegundos e gera a data a partir deles 
		Date x3 = new Date(0L); // data inicial de quando o Java come�ou a contar os milissegundos para gerar as datas
		Date x4 = new Date(1000L * 60L * 60L * 5L); // Criando uma data a partir dos milissegundos
		// No exemplo acima quer�amos 5 horas a partir do in�cio da contagem em 1970
		// 1 segundo tem 1000L (milissegundos)
		// Ali temos 1, vezes 60 para termos 1 minuto, vezes 60 para termos uma hora, vezes 5 para termos 5 horas
		Date y1 = sdf1.parse("25/06/2018"); // parse() converte de String para date
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		// abaixo (y3) temos o formato ISO 8601, coostuma ser o padr�o para se guardar datas
		// neste formato podemos converter diretamente da string pra date sem precisar do SimpleDateFormat()
		// � Formato: yyyy-MM-ddTHH:mm:ssZ
		// � Exemplo: "2018-06-25T15:42:07Z" o "Z" no final diz que estamos no UTC
		// Por padr�o, guardamos as datas em formato UTC e convertemos para nossa timezone quando vamos us�-la
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		// Por padr�o, aas datas s�o impressas na timezone do computador
		// para mimprimirmos no formato UTC / GMT, devemos especificar como no sdf3 (linha 18)
		// Abaixo temoa a impress�o de data padr�o do Java, sem estar formatada com o SimpleDateFormat()
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		
		System.out.println("-------------");
		
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		
		System.out.println("-------------");
		
		// datas abaixo em UTC / GMT 
		// Nossa timezone � GMT -3
		// As datas abaixo estar�o 3 horas adiantadas em rela��o � nossa
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
	}

}
