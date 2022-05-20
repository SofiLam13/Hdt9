/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos 
 * Sofía Lam
 * carné 21548
 */
import java.io.*;
public class Archivo {
    public Grafo Read() throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("guategrafo.txt"));
        String row;
        Grafo G = new Grafo();
        while((row = reader.readLine()) != null){
            String[] Data = row.split(" ");
            G.agregar(Data[0],Data[1],Float.parseFloat(Data[2]));
        }
        reader.close();
        return G;
    }
    
}
