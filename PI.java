import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PI {
	public String read(String file) {
		FileReader fw;
		try {
			fw = new FileReader(file+".txt");
			BufferedReader bf = new BufferedReader(fw);
			try {
				String data = bf.readLine();
				return data;
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {}
		
		return "0";
	}
	
	public void write(String file, String txt) {
		try {
			PrintWriter out = new PrintWriter(file+".txt");
			out.write(txt);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PI pi = new PI();
		
		int i = 0;
		while(true) {
			String data = pi.read("init");
			String out = pi.read("output");
			String history = pi.read("history");
			
			if (Integer.parseInt(data)<7 && out.contains(".")) {
				data += 0;
			}
			else if (Integer.parseInt(data)<7){
				out += ".";
				data += 0;
			}
			
			if (history != null)
				history += data + "/ 7 = ";
			else 
				history = data + "/ 7 = " ;
			
			if (out != null)
				out += Integer.parseInt(data)/7;
			else 
				out = Integer.toString(Integer.parseInt(data)/7);
			
			history += Integer.parseInt(data)/7 + " *";
			
			pi.write("init", Integer.toString(Integer.parseInt(data)%7));
			pi.write("output", out);
			pi.write("history", history);
			
			if (i == 50) {
				String str;
				while(true) {
					System.out.print("graph-ai /~ ");
					str = sc.next();
					if (str.equals("con")) {
						i = 0;
						break;
					}
					else if (str.equals("pi")) {
						System.out.println("PI ~ "+out);
					}
					else if (str.equals("len")) {
						System.out.println("already counted ~ "+out.length());
					}
					else if (str.equals("hist")) {
						System.out.println(history);
					}
					else if (str.equals("clr")) {
						pi.write("init", "22");
						pi.write("history", " ");
						pi.write("output", " ");
					}
					else if (str.equals("stp")) {
						System.exit(0);
					}
					else if (str.equals("help")) {
						System.out.println("--------------------------");
						System.out.println("con - to continue generate");
						System.out.println("pi - for generated value");
						System.out.println("len - already counted");
						System.out.println("stp - to stop propagation");
						System.out.println("clr - to initialize again");
						System.out.println("--------------------------");
					}
				}
			}
			i++;
		}
	}
}
