import java.awt.SystemColor.text

fun main() {
    val names = listOf("jakarta", "jakarta", "padang", "padang", "solo", "bandung", "malang", "bali")

    println(names.groupingBy { it }.eachCount().filter { it.value > 0 })

}



