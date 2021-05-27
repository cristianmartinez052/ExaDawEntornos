package paquete1;

public class Enteros {
    /**
     * El siguiente método nos calcula el factorial del
     * parámetro n que es un entero.
     * @param n es el entero que pasamos por parámetro al método
     * @return nos devuelve la variable resultado que es el producto para
     * calcular el factorial.
     */
    public static int r_factorial(int n) {
        int resultado;

        if (n == 0) {
            resultado = 1;
        } else {
            resultado = n * r_factorial(n - 1);
        }
        return resultado;
    }

    /**
     *Calcula el factorial del número entero introducido por parámetro
     * @param n
     * @return
     */
    public static int factorial(int n) {
        int resultado;

        resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    /**
     * El siguiente método nos muestra el resultado del String
     * introducido por parámetro pero al revés.
     * @param cadena --- Es el String o cadena de caractéres que hemos introducido por parámetro
     * @return
     */
    public static String alreves(String cadena) {
        String resultado = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado = resultado + cadena.charAt(i);
        }
        return resultado;
    }

    /**
     * El método capicua nos dice si podemos leer la cadena de caracteres
     * que tendrá como valor la variable resultado
     * @param n
     * @return devuelve el valor de la variable resultado
     */
    public static boolean capicua(int n) {
        boolean resultado;
        String cadena;

        cadena = Integer.toString(n);
        if (cadena.equals(alreves(cadena))) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }

    /**
     * El método divisinle nos dirá si los parámetros introducidos por parámetro
     * en este caso múltiplo y divisor son divisibles
     * @param multiplo
     * @param divisor
     * @return nos devuelve el valor del variable resultado
     */
    public static boolean divisible(int multiplo, int divisor) {
        boolean resultado;

        if (multiplo % divisor == 0) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }

    /**
     * El método multiplo nos indicará si el los dos enteros introducidos por
     * parámetros son múltiplos el uno del otro
     * @param mult
     * @param divisor
     * El bloque try-catch es para recoger las excepciones que puedan darse en el operador que tenemos
     * dentro del if, por ejemplo si el divisor que introducimos es 0.
     * @return
     */
    public static boolean multiplo(int mult, int divisor) {
        boolean resultado;

        try {
            if (mult % divisor == 0) {
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (ArithmeticException e) {
            resultado = false;
        }
        return resultado;
    }

    /**
     * El método es primo nos dirá si el número entero introducido por parámetro
     * es un número primo o no
     * @param n
     * @return
     */
    public static boolean esPrimo(int n) {
        boolean primo;

        if (n <= 1) {
            primo = false;
        } else {
            primo = true;
            int i = 2;
            while (primo && i <= n / 2) {
                if (divisible(n, i)) {
                    primo = false;
                } else {
                    i++;
                }
            }
        }
        return primo;
    }

    /**
     * El método n_primos nos calculará todos los números primos que tenga
     * el número entero que hemos introducido por teclado
     * @param n
     * @return
     */
    public static int n_primos(int n) {
        int resultado = 0;

        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                resultado++;
            }
        }
        return resultado;
    }

    /**
     * Este método nos va a devolver cuantos números primos
     * tiene el número entero introducido por parámetro
     * @param n
     * @return
     */
    public static int[] primosHasta(int n) {
        int[] resultado;

        resultado = new int[n_primos(n)];
        int cont = 0;
        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                resultado[cont] = i;
                cont++;
            }
        }

        return resultado;
    }

    /**
     * Calcula los dos primero números primos
     * del número entero introducido por parámetro
     * @param n
     * @return
     */
    public static int[] primerosPrimos(int n) {
        int[] resultado = new int[(n < 0) ? 0 : n];

        int cont = 0;
        int i = 2;
        while (cont < n) {
            if (esPrimo(i)) {
                resultado[cont] = i;
                cont++;
            }
            i++;
        }

        return resultado;
    }
    public static void suma (int num1, int num2){
       int  suma = num1+num2;
       System.out.println("El resultado de la suma es: " + suma);
   }

}
