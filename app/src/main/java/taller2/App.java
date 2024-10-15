/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
            
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
    public static int Calcular_saldo(int base, int total_recaudos, int total_retiros) { 
        try { 
            // Inicializamos las variables y declaramos las constantes 
            int saldo_taquilla = 0; 
            final int limitebase = 2000000; 

            // Validamos que la base sea igual a 2.000.000 y hacemos las operaciones correspondientes  
            if (base == limitebase) { 
                saldo_taquilla = (base + total_recaudos - total_retiros); 
                return saldo_taquilla; 
                } 
            else  
                return -1; // Si hay error, retornamos -1.  
            }

        catch (Exception e) {
            return -1;
            } 
    } 


    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
    public static String Calcular_tip(float consumo_cliente) { 
        try { 
            // Inicializamos las variables 
            float valor_propina = 0, valor_impoconsumo = 0, valor_total = 0; 

            // Declaramos las constantes correspondientes a la propina (10%), el impoconsumo (8%) 
            final float propina = 0.10f; 
            final float impoconsumo = 0.08f; 

            // Validamos que el valor del consumo sea mayor a 0 y hacemos las operaciones correspondientes a la propina, el impoconsumo y el total 
            if (consumo_cliente > 0) { 
                valor_propina = (consumo_cliente * propina); 
                valor_impoconsumo = (consumo_cliente * impoconsumo); 
                valor_total = (consumo_cliente + valor_propina + valor_impoconsumo); 

                // Devolvemos un string que contenga el valor de la propina, el impuesto al consumo y el valor total 
                return "valor comida: $" + consumo_cliente + " - valor propina $" + valor_propina + " - valor impoconsumo $" + valor_impoconsumo + " - total a pagar $" + valor_total; 
                } 
            else  
                // Si el consumo no es mayor a 0 retornamos "Error calculando consumo" 
                return "Error calculando consumo";  
            }

        catch (Exception e) { 
            // Si hay algún error, retornamos "Error en la función Calcular_tip" 
            return "Error en la función Calcular_tip"; 
            } 
    } 


    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
    public static int Obtener_puntos(int partidos_ganados, int partidos_perdidos, int partidos_empatados) { 
        try { 
            // Inicializamos variables y declaramos las constantes para los puntos 
            int puntos_totales = 0; 
            final int puntosXpartido_ganado = 3, puntosXpartido_perdido = 0, puntosXpartido_empatado = 1; 

            // Valide además que los partidos ganados, perdidos y empatados sean mayores o iguales a 0. Si no es así, retorne -1, además multiplicamos cada partido por los puntos correspondientes.
            if (partidos_ganados >= 0 && partidos_perdidos >= 0 && partidos_empatados >= 0) { 
                puntos_totales = (partidos_ganados * puntosXpartido_ganado + partidos_empatados * puntosXpartido_empatado + partidos_perdidos * puntosXpartido_perdido); 
                //Retornamos el resultado 
                return puntos_totales; 
                } 
            else  
                return -1;  
            }

        catch (Exception e) { 
            return -1; 
            } 
    } 


    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_definitiva(float nota_1, float nota_2, float nota_3, float nota_4, float nota_5, float porcentaje_1, float porcentaje_2, float porcentaje_3, float porcentaje_4, float porcentaje_5) { 
        try { 
            // Inicializamos las variables 
            float nota_definitiva = 0; 
            final float suma_de_porcentajes = 1; 
            final int lim_sup_notas = 5, lim_inf_notas = 0, lim_inf_porcentaje = 0, lim_sup_porcentaje = 1; 

            // Representando las notas (entre 0 y 5) y cinco floats representando los porcentajes (que entre todos deberán sumar 1 y cada uno estar entre 0 y 1) 
            if //Añadimos las condiciones de que todos los porcentajes deben sumar 1
                ((porcentaje_1 + porcentaje_2 + porcentaje_3 + porcentaje_4 + porcentaje_5 == suma_de_porcentajes) && 
                /*Todos los porcentajes deben estar entre 0-1 (no tome el 0 y el 5 porque dice "entre" y supuse que no se puede tener
                nota sin porcentaje o con el porcentaje de 100%*/
                (lim_inf_porcentaje < porcentaje_1 && porcentaje_1 < lim_sup_porcentaje && 
                 lim_inf_porcentaje < porcentaje_2 && porcentaje_2 < lim_sup_porcentaje && 
                 lim_inf_porcentaje < porcentaje_3 && porcentaje_3 < lim_sup_porcentaje && 
                 lim_inf_porcentaje < porcentaje_4 && porcentaje_4 < lim_sup_porcentaje && 
                 lim_inf_porcentaje < porcentaje_5 && porcentaje_5 < lim_sup_porcentaje) && 
                 //Todas las notas deben estar entre 0-5 (aunque dice "entre" tomé el 0 y el 5 como notas válidas por lógica)
                (lim_inf_notas <= nota_1 && nota_1 <= lim_sup_notas && 
                 lim_inf_notas <= nota_2 && nota_2 <= lim_sup_notas && 
                 lim_inf_notas <= nota_3 && nota_3 <= lim_sup_notas && 
                 lim_inf_notas <= nota_4 && nota_4 <= lim_sup_notas && 
                 lim_inf_notas <= nota_5 && nota_5 <= lim_sup_notas)) 
                //Realizamos las operaciones y retornamos el resultado
                {nota_definitiva = nota_1 * porcentaje_1 + nota_2 * porcentaje_2 + nota_3 * porcentaje_3 + nota_4 * porcentaje_4 + nota_5 * porcentaje_5; 
                return nota_definitiva; } 
            else  
                return -1; 
            }

        catch (Exception e) { 
            return -1; 
            } 
    } 


    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_para_ganar (float nota_1, float nota_2, float nota_3, float nota_4, float porcentaje_1, float porcentaje_2, float porcentaje_3, float porcentaje_4, float porcentaje_5) { 
        try { 
            // Declaramos las variables y constantes 
            final int nota_min = 3, lim_inf_porcentaje = 0, lim_sup_porcentaje = 1; 
            final int lim_sup_notas = 5, lim_inf_notas = 0
            final float suma_de_porcentajes = 1; 
            float nota_faltante = 0; 

            if  //Establecemos la condición de que la suma de porcentajes será = 1
                ((porcentaje_1 + porcentaje_2 + porcentaje_3 + porcentaje_4 + porcentaje_5 == suma_de_porcentajes) &&
                //Los porcentajes deben estar entre 0 y 1 
                (lim_inf_porcentaje < porcentaje_1 && porcentaje_1 < lim_sup_porcentaje && 
                 lim_inf_porcentaje < porcentaje_2 && porcentaje_2 < lim_sup_porcentaje && 
                 lim_inf_porcentaje < porcentaje_3 && porcentaje_3 < lim_sup_porcentaje && 
                 lim_inf_porcentaje < porcentaje_4 && porcentaje_4 < lim_sup_porcentaje && 
                 lim_inf_porcentaje < porcentaje_5 && porcentaje_5 < lim_sup_porcentaje))
                //Todas las notas deben estar entre 0-5 (aunque dice "entre" tomé el 0 y el 5 como notas válidas por lógica)
                (lim_inf_notas <= nota_1 && nota_1 <= lim_sup_notas && 
                 lim_inf_notas <= nota_2 && nota_2 <= lim_sup_notas && 
                 lim_inf_notas <= nota_3 && nota_3 <= lim_sup_notas && 
                 lim_inf_notas <= nota_4 && nota_4 <= lim_sup_notas && 
                 lim_inf_notas <= nota_5 && nota_5 <= lim_sup_notas)) { 
                //Calculamos y retornamos la nota necesaria para tener un 3
                nota_faltante = (nota_min - ((nota_1 * porcentaje_1) + (nota_2 * porcentaje_2) + (nota_3 * porcentaje_3) + (nota_4 * porcentaje_4)))/ porcentaje_5; 
                return nota_faltante; 
                } 
            else  
                return -1;  
            }

        catch (Exception e) { 
            return -1; 
            } 
    } 



    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */

     /*Esta función presentó problemas en el test, sin embargo, al presentar las pruebas con los datos y revisar las operaciones, creo que 
     mi función está buena y el test tiene problemas con la parte aritmética, favor revisar*/
    public static float Calcular_salario(int horas_normales, int horas_extras_diurnas, int horas_extras_nocturnas, float valor_hora_normal) { 
        try { 
            // Inicializamos variables y definimos las constantes
            final float recargo_diurna = 1.15f, recargo_nocturna = 1.35f; 
            float salario_total = 0; 

            //validamos que la hora valga más que 0, hacemos las operaciones correspondientes 
            if (valor_hora_normal > 0) { 
                salario_total = (horas_normales * valor_hora_normal) + (horas_extras_diurnas * valor_hora_normal * recargo_diurna) + (horas_extras_nocturnas * valor_hora_normal * recargo_nocturna); 
                return salario_total; 
                } 
            else  
                return -1;  
            }

        catch (Exception e) { 
            return -1; 
            } 
    } 


    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_triangulo(float base, float altura) { 
        try { 
            // Declaramos constantes e inicializamos variables 
            float area = 0; 
            final float division_formula = 0.5f; 

            // Validamos que la base y la altura sean mayores a 0. Si no es así, retorne -1, hacemos las operaciones correspondientes al area
            if (base > 0 && altura > 0) { 
                area = (division_formula * base * altura); 
                return area; 
            } 
            else  
                return -1;  
            }

        catch (Exception e) { 
            return -1; 
            } 
    } 



    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_perimetro_cuadrado(float lado) { 
        try { 
            // Definimos las variables y constantes (4 lados para el cuadrado)
            float Perímetro_cuadrado = 0; 
            final int numero_lados = 4; 

            //Validamos que el lado sea mayor a 0 y realizamos las operaciones
            if (lado > 0) { 
                Perímetro_cuadrado = (lado * numero_lados); 
                return Perímetro_cuadrado; 
            } 
            //En caso de error retornar -1
            else  
                return -1;  
            }

        catch (Exception e) { 
            return -1; 
            } 
    } 


    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_volumen_cilindro(float radio, float altura) { 
        try { 
            // Inicializamos variables 
            float volumen_cilindro = 0; 
            final float pi = 3.1415927f; 

            // Validamos que el radio y la altura sean mayores a 0, hacemos las operaciones. Si no es así, retorne -1. 
            if (radio > 0 && altura > 0) { 
                volumen_cilindro = (pi * (radio * radio) * altura); 
                return volumen_cilindro; 
            } 
            else  
                return -1; 
            } 

        catch (Exception e) { 
            return -1; 
            } 
    } 


    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_circulo(float radio) { 
        try { 
            // Inicializamos las variables y declaramos las constantes 
            float area = 0; 
            final float pi = 3.1415927f; 

            // Validamos que el radio sea > 0 y realizamos las operaciones para hallar el area 
            if (radio > 0) { 
                area = (pi * (radio * radio)); 
                return area; 
                } 
            else  
                return -1;  
            }
             
        catch (Exception e) { 
            return -1; 
            } 
    }




}
