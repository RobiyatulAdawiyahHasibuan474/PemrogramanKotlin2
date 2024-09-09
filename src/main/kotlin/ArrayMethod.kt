fun main(args: Array<String>) {
    val simsonsA = arrayOf("Homer", "Marge", "Bart", "Lisa", "Maggie")
    simsonsA.sort()
    for (simson in simsonsA) {
        print(simson + ' ')
    }
    print('\n')

    val simsonsB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Maggie")
    val simsons_sorted = simsonsB.sortedArray()
    for (simson in simsons_sorted) {
        print(simson + ' ')
    }
    print('\n')

    val simsonsC: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Maggie")
    simsonsC.sort()
    simsonsC.reverse()
    for (simson in simsonsC) {
        print(simson + ' ')
    }
    print('\n')

    val simsonsD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Maggie")
    val simson = "Lisa"
    val position = simsonsD.indexOf(simson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simson!")
    } else {
        println("Hey that's not Simson!")
    }

    val simpsonsE = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    println("simpsons size: " + simpsonsE.size)
    if(!simpsonsE.isEmpty())
        println("Array tidak kosong!")
    println("Min = "+ simpsonsE.min())
    println("Max = "+ simpsonsE.max())
    println("First = " + simpsonsE.first())
    println("Last = " + simpsonsE.last())
    println(simpsonsE.contains("Marge"))
}