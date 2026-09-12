package TugasC

fun cekGenapGanjil(bilangan: Int): String{
    return if (bilangan % 2 == 0){
        "Genap"
    }else{
        "Ganjil"
    }
}

fun main(){
    print("Masukkan bilangan: ")
    val bilangan = readln(). toInt()

    val hasil = cekGenapGanjil(bilangan)
    print("$bilangan merupakan bilangan $hasil")
}