//fun main() {
//    val student = Student("Besteran", 99)
//    student.sayGoodBay("Rina")
//    student.Makan(3000000)
//
//    val nurafia = Student("Nurafia", 35)
//    nurafia.sayGoodBay("Yoga")
//}
//
//class Student(val name: String, val age: Int)
//
//fun Student.sayGoodBay(name: String) {
//    println("Goodbye $name, my name is ${this.name}, and my age is $age")
//}
//
//fun Student.Makan(uang: Int) {
//    println("Butuh uang $uang")
//}
//
//fun Student.Lari(tujuan: String) {
//    println("ke $tujuan")
//}
















sealed class Question{
    class Easy( var mark: Int, var time: Int) : Question()
    class Moderate( var mark: Int, var time: Int, var hint: String): Question()
    class Difficult(var mark: Int, var time: Int, var hint: String, var solution: String): Question()
}

fun questionDetail(question: Question): String {
    return when (question) {
        is Question.Easy ->
            "Easy question Mark: ${question.mark} Time: ${question.time} min"

        is Question.Moderate ->
            "Moderate question Marks: ${question.mark} Time: ${question.time} min and Hint: ${question.hint}"

        is Question.Difficult ->
            "Difficult question Marks: ${question.mark} Time: ${question.time} min Hint: ${question.hint} and Solution: ${question.solution}"
    }
}
fun main() {
    val easyQuestion = Question.Easy(1, 1)
    val difficultQuestion = Question.Difficult(5,6, "substitution method", "x = 5, y = 3")
nnnunuhnhu
    println(questionDetail(easyQuestion))
    println(questionDetail(difficultQuestion))
}




//sealed class Kotak {
//    abstract fun deskripsi(): String
//}
//
//// Ini adalah salah satu "barang dalam kotak" (subclass)
//data class Buku(val judul: String) : Kotak() {
//    override fun deskripsi() = "Buku dengan judul: $judul"
//}
//
//// Ini adalah "barang dalam kotak" lainnya (subclass)
//data class Pena(val merek: String) : Kotak() {
//    override fun deskripsi() = "Pena merek $merek"
//}
//
//fun main() {
//    // Membuat beberapa "barang dalam kotak"
//    val barang1: Kotak = Buku("Panduan Kotlin")
//    val barang2: Kotak = Pena("Pilot G2")
//
//    // Menggunakan ekspresi when untuk mengidentifikasi "barang" dalam "kotak"
//    when (barang1) {
//        is Buku -> println("Ini adalah ${barang1.deskripsi()}")
//        is Pena -> println("Ini adalah ${barang1.deskripsi()}")
//    }
//
//    when (barang2) {
//        is Buku -> println("Ini adalah ${barang2.deskripsi()}")
//        is Pena -> println("Ini adalah ${barang2.deskripsi()}")
//    }
//}
