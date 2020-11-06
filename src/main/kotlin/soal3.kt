fun main() {
    val listName: Array<String> = arrayOf("udacoding", "tempat 2", "tempat 3", "tempat 4", "tempat 5")
    for (name: String in listName) {
        println(name)
    }


    while (listName.contains("udacoding"))
        println("nah ini belajar coding yang keren")


}

