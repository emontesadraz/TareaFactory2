Aplicación de Envío de Paquetes en Java
Este repositorio contiene una aplicación simple en Java para distinguir entre diferentes tipos de transporte para enviar un paquete. La aplicación permite instanciar dos tipos de transporte: camión y bicicleta.

Métodos Comunes
La aplicación implementa dos métodos comunes para ambos tipos de transporte:

costeTotal(Integer cp): Float

Este método recibe el código postal como parámetro y devuelve el costo total para enviar un paquete a ese código postal.
tipoEmbalaje(Float x, Float y, Float z, Float peso): Integer

Este método recibe las dimensiones (ancho, alto y largo) y el peso del paquete como parámetros.
Devuelve un entero que representa el tipo de embalaje adecuado:
0: Palet
1: Envoltorio de cartón
2: Caja de madera