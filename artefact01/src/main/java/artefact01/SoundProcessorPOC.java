package artefact01;
import java.io.*;
import java.util.Arrays;

/**
 * POC as part of Tech discussion - 03-July-2024
 * @author Poornima
 *
 */

public class SoundProcessorPOC {
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setOut(new PrintStream(new FileOutputStream("src/main/java/artefact01/output.txt")));
		File myFile1 = new File("/Users/jibinkalyattil/eclipse-workspace/Recording 7.m4a");
		File myFile2 = new File("/Users/jibinkalyattil/eclipse-workspace/Recording 8.m4a");
		byte[] byteArray1 = new byte[(int) myFile1.length()];
		byte[] byteArray2 = new byte[(int) myFile2.length()];
		
		try (FileInputStream inputStream1 = new FileInputStream(myFile1)) {
			inputStream1.read(byteArray1);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		try (FileInputStream inputStream2 = new FileInputStream(myFile2)) {
			inputStream2.read(byteArray2);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		System.out.println("Comparison result--"+Arrays.equals(byteArray1, byteArray2));
	}

}
