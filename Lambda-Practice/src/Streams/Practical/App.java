package Streams.Practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main (String args[]) throws IOException {
		IntStream
		.range(1,10)
		.forEach((x)->System.out.print(x));
		System.out.println();
		
		
		Stream<String> lines=Files.lines(Paths.get("Files/wordFile.txt"));
		lines.sorted()
		.filter(l ->l.length() >6)
		.forEach(x ->System.out.print(x +","));
		lines.close();
		
		Stream<String> rows=Files.lines(Paths.get("Files/stockDataCsv.txt"));
		rows.map(x -> x.split(","))
		.filter(x -> x.length >3)
		.filter(x ->Integer.parseInt(x[1].trim())>15)
		.forEach(x ->System.out.println(x[0].trim()+" "+x[2].trim()+" "+x[3].trim()));
		rows.close();
	}
}
