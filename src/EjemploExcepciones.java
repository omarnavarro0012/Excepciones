import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.InputMismatchException;
import java.util.*;
import java.io.File;

/**
 * Created by Alumnos on 12/10/2017.
 */
public class EjemploExcepciones
{
    public static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            File archivo = new File("Entrada.txt");
            //   System.out.print("hola!");
            Scanner teclado = new Scanner(archivo);
            System.out.println("Dame el primer numero: ");
            int num1 = teclado.nextInt();
            System.out.println("Dame el segundo numero: ");
            int num2 = teclado.nextInt();
            System.out.print("la divicion es: " + num1 / num2);
            //¿que ocurre cuando num2 es 0?¿como se llama la excepcion?
            //java.lang.ArithmeticException:
       }
       catch (ArithmeticException excepcionAritmetica)
       {
           System.out.println("Divicion por cero");
           //Sistem.out.println(excepcionAritmetica.getMessage);
       }
       catch (InputMismatchException excepcionEntrada)
       {
           System.out.println("Entrada incorrecta");
       }
       catch (FileSystemNotFoundException e)
       {
           System.out.print("No existe el archivo");
       }
    }
}
