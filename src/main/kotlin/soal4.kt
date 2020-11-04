fun main() {
    val score = 100
    println(getGrade(score))
}

fun getGrade(score : Int) : String {
    var result : String
    when {
        score >= 100 -> {
            result = "terpuji"
        }
        score in 80..90 -> {
            result = "sangat memuaskan"
        }
        score in 60..80 -> {
            result = "memuaskan"
        }
        score in 10..60 -> {
            result = "tidak lulus"
        }
        else -> {
            result = "nilai tidak valid"
        }
    }
    return result
}