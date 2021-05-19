import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println("Valor ingresado = " + scanner.next());
            Date fecha = format.parse("2020-08-20");
            System.out.println("fecha = " + fecha);


            // Comparar dos fechas
            Date fecha2 = new Date();
            if(fecha.after(fecha2)){
                System.out.println("fecha 1 es menor a fecha 2 ");
            } else if (fecha.before(fecha2)){

            } else if (fecha.equals(fecha2)){

            }
            // Comparar usando date
            if(fecha.compareTo(fecha2) > 0){
                System.out.println("fecha es anterior de fecha 2");
            } else if (fecha.compareTo(fecha2) < 0 ) {
                System.out.println("fecha es mayor a fecha 2");
            } else if (fecha.compareTo(fecha2) == 0 ){
                System.out.println(" las fechas son iguales");
            }
        } catch (ParseException e) {

        }

    }
}
