

fun main() {
    val names = listOf("jakarta", "jakarta", "padang", "padang", "solo", "bandung", "malang", "bali")

    val output = names.groupBy { it }
            .map { "${it.key} : ${it.value.size}" }
            .toString()

    println(output)

}



