fun main(args: Array<String>) {
    var x:Int
    println("example of Break and Contimue in For-Loop")
    for (x in 1..10) {
        if (x == 7) break
        if(x == 3) continue
        print("$x ")
    }
    print('\n')
}