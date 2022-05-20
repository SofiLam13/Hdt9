/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos 
 * Sofía Lam
 * carné 21548
 */
import java.util.ArrayList;
public class Matriz {
    private ArrayList<ArrayList<Float>> info;
    private int tam;
    final float g= Float.POSITIVE_INFINITY;
    final float h = Float.NEGATIVE_INFINITY;
    Matriz(int tamanio, boolean m){
        for(int i = 0;i<tam;i++){
            ArrayList<Float> arraylist = new ArrayList<>();
            for(int j = 0;j<tam;j++){
                if(m){arraylist.add(0f);
                }else{arraylist.add(g);}
            }
            info.add(arraylist);
        }
    }
    public Matriz() {}
    public void Agregando(){
        tam = tam+1;
        for(ArrayList<Float> array : info){
            array.add(g);
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        for(int i = 0;i<tam;i++){
            arrayList.add(g);
        }
        info.add(arrayList);
    }
    public Matriz Copia(){
        Matriz mat = new Matriz(tam,false);
        for(int i = 1;i<tam;i++){
            for(int j = 1;j<tam;j++){
                mat.Set(i,j,get(i,j));
            }
        }
        return mat;
    }
    public void Set(int l,int m,float n){
        l--; m--;
        ArrayList<Float> arrayList = info.get(l); arrayList.set(m,n); info.set(l,arrayList);
    }
    public Float get(int i, int j) {
        i--; j--;
        return info.get(i).get(j);
    }
    private ArrayList<Float> Maximo() {
        ArrayList<Float> maximo = new ArrayList<Float>();
        for (int i=0; i<tam; i++) {
            float max = h;
            for (ArrayList<Float> arr : info) {
                if (max < arr.get(i)) {
                    max = arr.get(i);
                }
            }
            maximo.add(max);
        }
        return maximo;
    }
    public int Minimo(){
        ArrayList<Float> max = Maximo();
        float min = g;
        int index = 0;
        for(int i = 0;i<max.size();i++){
            if(max.get(i) < min){
                min = max.get(i);
                index = i+1;
            }
        }
        return index;
    }
}
