class BrCoLabel {

    fun main(args: Array<String>) {

        for (i in 1..3) {
            println("\ni: $i ")
            for (j in 1..5) {
                if (j.equals(3)) break
                println("j: $j")
            }
        } // EJEMPLO DE BREAK
//RESULTADO
//        i: 1  primero resuelvo i con 1
//        j: 1  cuando termino i voy a j y lo resuelvo hasta terminarlo
//        j: 2
//
//        i: 2 cuando termino j vuelvo a i y sigo otra vez a j
//        j: 1 resuelvo j hasta terminarlo y vuelvo a i
//        j: 2
//
//        i: 3 vuelvo a i hasta que se cumple la condicion en este caso era hasta 3 y continuo con j
//        j: 1 resuelvo j hasta terminar y como ya se cumplio la condicion de i mi ciclo termina
//        j: 2

        for (i in 1..3) {
            println("\ni: $i ")
            for (j in 1..5) {
                if (j.equals(3)) continue
                println("j: $j")
            }
        } //CONTINUE
//RESULTADO
//        i: 1
//        j: 1
//        j: 2 como tengo un continue si es igual a 3 omito el 3
//        j: 4
//        j: 5
//
//        i: 2
//        j: 1
//        j: 2
//        j: 4
//        j: 5
//
//        i: 3
//        j: 1
//        j: 2
//        j: 4
//        j: 5

        for (i in 1..3) {
            println("\ni: $i ")
            for (j in 1..3) {
                println("\nj: $j")
                for (k in 1..5) {
                    if (k.equals(3)) break
                    println("k: $k")
                }
            }
        } //BREAK Y LABEL

        // RESULTADO

//        i: 1 resuelvo i primero
//
//        j: 1 despues resuelvo j
//        k: 1 despues resuelvo k en su totalidad
//        k: 2
//
//        j: 2 vuelvo a j
//        k: 1 resuelvo k en su totalidad
//        k: 2
//
//        j: 3 vuelvo a j
//        k: 1 resuelvo k en su totalidad
//        k: 2
//
//        i: 2 como ya finalizo la condicion de j vuelvo a i y regreso a hacer lo mismo con j y k
//
//        j: 1 resuelvo j
//        k: 1 resuelvo k en su totalidad
//        k: 2
//
//        j: 2 vuelvo a j
//        k: 1 resuelvo k en su totalidad
//        k: 2
//
//        j: 3 vuelvo a j
//        k: 1 resuelvo k en su totalidad
//        k: 2
//
//        i: 3 vuelvo a i
//
//        j: 1 resuelvo j
//        k: 1 resuelvo k en su totalidad
//        k: 2
//
//        j: 2 vuelvo a j
//        k: 1 resuelvo k en su totalidad
//        k: 2
//
//        j: 3 vuelvo a j y finaliza la condicion
//        k: 1 resuelvo k en su totalidad y termina el ciclo porque i ya se cumplio la condicion
//        k: 2

        terminarTodoCiclo@ for (i in 1..3) {
            println("\ni: $i ")
            for (j in 1..3) {
                println("\nj: $j")
                for (k in 1..5) {
                    if (k.equals(3)) break@terminarTodoCiclo
                    println("k: $k")
                }
            }
        } //LABEL APLICADA CON  BREAK

        //RESULTADO

//        i: 1 resuelvo i
//
//        j: 1 resuelvo j
//        k: 1 entro a resolver k en su totalidad pero al encontrarme que si es igual a 3 termino el ciclo, cuando esto pase lo debo terminar y todo acaba
//        k: 2

        for (i in 1..3) {
            println("\ni: $i ")
            for (j in 1..3) {
                println("\nj: $j")
                for (k in 1..5) {
                    if (k.equals(3)) continue
                    println("k: $k")
                }
            }
        } //CONTINUE 3 FOR

        //RESULTADO

//        i: 1
//
//        j: 1
//        k: 1
//        k: 2 omito el 3
//        k: 4
//        k: 5
//
//        j: 2
//        k: 1
//        k: 2
//        k: 4
//        k: 5
//
//        j: 3
//        k: 1
//        k: 2
//        k: 4
//        k: 5
//
//        i: 2
//
//        j: 1
//        k: 1
//        k: 2
//        k: 4
//        k: 5
//
//        j: 2
//        k: 1
//        k: 2
//        k: 4
//        k: 5
//
//        j: 3
//        k: 1
//        k: 2
//        k: 4
//        k: 5
//
//        i: 3
//
//        j: 1
//        k: 1
//        k: 2
//        k: 4
//        k: 5
//
//        j: 2
//        k: 1
//        k: 2
//        k: 4
//        k: 5
//
//        j: 3
//        k: 1
//        k: 2
//        k: 4
//        k: 5

        escaparJ@ for (i in 1..3) {
            println("\ni: $i ")
            for (j in 1..3) {
                println("\nj: $j")
                for (k in 1..5) {
                    if (k.equals(3)) continue@escaparJ
                    println("k: $k")
                }
            }
        } //CONTINUE MAS LABEL

        //RESULTADO

//        i: 1
//
//        j: 1
//        k: 1
//        k: 2
//
//        i: 2
//
//        j: 1
//        k: 1
//        k: 2
//
//        i: 3
//
//        j: 1
//        k: 1
//        k: 2



    }
}