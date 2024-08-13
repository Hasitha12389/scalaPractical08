object CaesarCiperaz{
 
def encrypt(message: String,shift: Int): String = {
    message.map { x =>
        if(x.isLetter){
            val base = if (x.isLower) 'a' else 'A'   // A = 65, a = 97 // D = 68
            ((x - base + shift) % 26 + base).toChar 
        } else {
            x
        }
    }
}

def decrypt(text: String,shift: Int): String = {
    text.map { a =>
        if(a.isLetter){
            val base = if (a.isLower) 'a' else 'A'
            ((a - base + (26 - shift)) % 26 + base).toChar        // 23 D = 68
        } else {
            a
        }
    }
}

def cipher(message: String,shift: Int, operation: (String,Int) => String): String = {
    operation(message,shift)
}
 
def main(args:Array[String]): Unit={
    val message = "ABCDE"
    val shift = 3

    println("\n---------Ceaser Cipher----------\n")

    val encrypted = cipher(message, shift,encrypt)
    println(s"Encrypterd message : $encrypted")

    val decrypted = cipher(encrypted, shift,decrypt) 
    println(s"Decrypted message : $decrypted\n")

}
}
