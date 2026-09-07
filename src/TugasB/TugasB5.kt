package TugasB

fun main(){
    print("Masukkan nama Mahasiswa: ")
    val nama: String = readln()

    print("Masukkan nilai tugas: ")
    val nilai: Double = readln().toDouble()

    print("Masukkan nilai kuis: ")
    val nilaiKuis: Double = readln().toDouble()

    print("Masukkan nilai UTS: ")
    val nilaiUTS: Double = readln().toDouble()

    print("Masukkan nilai UAS: ")
    val nilaiUas: Double = readln().toDouble()

    val nilaiAkhir: Double = (nilai * 0.25) + (nilaiKuis * 0.15) + (nilaiUTS * 0.25) + (nilaiUas * 0.35)

    println()
    println("Nama Mahasiswa: $nama")
    println("Nilai tugas mahasiswa: $nilai")
    println("Nilai Kuis: $nilaiKuis")
    println("Nilai UTS: $nilaiUTS")
    println("Nilai UAS: $nilaiUas")
    println("Nilai Akhir: $nilaiAkhir")
}