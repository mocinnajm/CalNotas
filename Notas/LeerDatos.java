import java.util.Scanner;
public class LeerDatos {
    public static double [] leerDatos(){
    Scanner teclado = new Scanner(System.in);
    double[] notes = new double [5];
    System.out.println("Introduce 5 numeros :");
    for (int i=0;i<notes.length;i++){
        System.out.print("numero "+(i+1)+":");
        notes[i]=teclado.nextDouble();

    }
    return notes;




}
}

