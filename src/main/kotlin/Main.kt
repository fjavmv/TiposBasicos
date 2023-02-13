/*
    Tipos básicos en Kotlin
    En Kotlin todo es un objeto que tiene funciones y propiedades
    Algunos tipos, como números, caracteres y valores booleanos,
    pueden presentarse como primitivos en tiempo de ejecución.
    Números
                Tipo            Tamaño(bits)
                Byte            8
                Short           16
                Int             32
                Long            64
                Float           32
                Double          64
*/

fun main() {
    val x = 1 //Se infiere que es un tipo Int
    val y = 50000000 //Se infiere que es de tipo LonPBg
    val z = 1L //Long explicito
    val b: Byte = 1
    val PI = 3.14 //Se infiere que es double
    val exp = 2.7182818284 // Double
    val expFloat = 2.7182818284f // Float, su valor actual es 2.7182817
    println(expFloat)
    /*
        Caracteres
        Son definidos como Char
        Son declarados con comillas simples por ejemplo 'F'
        Algunos carcateres especiales incluyen  '\t' '\b', etc.
     */
    val c = 'C'
    println(c)
    /*
        Boolean
        Tienen dos valores true o  false
        Los operadores lógicos booleanos son || para OR , && para AND y
        ! para negación
     */
    val a1 = 4
    val b1 = 5
    println(a1 > b1)
    if (a1 == 5 && b1 == 5)
        println("Son iguales")
    else
        println("No son iguales")

}