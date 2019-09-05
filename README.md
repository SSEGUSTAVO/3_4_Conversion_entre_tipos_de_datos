# 3_4_Ejercicio_1

• Declare e inicialice un tipo byte con un valor de 128:

– Observe la queja.

– Comente esta línea problemática.

• Declare e inicialice un tipo short con un valor de 128:

– Cree una sentencia print que convierta este short en un valor byte.

• Declare e inicialice un tipo byte con un valor de 127.

– Agregue 1 a esta variable e imprímala.

– Vuelva a agregar 1 a esta variable e imprímala de nuevo.

Se comienza declarando la variable y corriendo el programa, dónde nos aparece el error mostrado.



Se comenta la declaración de la variable, se coloca una nueva variable y se corre el programa, durante la compilación se muestra el mismo error anterior, se resuelve guardando de nuevo el documento.



Se observa que no hay error, y se prosigue a crear las sentencias de conversión e impresión, se coloca la sentencia de conversión de dato -mybyte = (short) myshort;- y la de impresión -System.out.println(mybyte);-. Se observa el error "';' expected" en la línea 6, lo que indica un error de sintaxis, se corrige colocando punto y coma en donde lo indica, se corre de nuevo el programa y vuelve a indicar el mismo error, se corrige guardando de nuevo el documento. Al correrlo de nuevo se observa el error "cannot find symbol" en la línea 5, indicando que no se ha declarado la variable "mybyte", se corrige declarando anteriormente la variable.



Al correr el programa se muestra un error de incompatibilidad de tipo, esto se arregla corrigiendo la sentencia -mybyte = (short) myshort;- por -mybyte = (byte) myshort;-.



Se continúa con el ejercicio declarando el segundo byte e incrementandolo para luego imprimirlo. Se resuelve que en todos los puntos el resultado es el mismo -128 que indica el desbordamiento de las variables tipo byte.

