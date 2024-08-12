object CaesarCiperaz{
 
def encrypt(message: String,shift: Int): String = {
    message.map { x =>
        if(x.isLetter){
            val base = if (x.isLower) 'a' else 'A'   // A = 65, a = 65 
            ((x - base + shift) % 26 + base).toChar 
        } else {
            x
        }
    }
}

def decrypt(message: String,shift: Int): String = {
    encrypt(message,shift)
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

    val decrypted = cipher(encrypted, 26-shift,decrypt) // to pass 26 - shift to decrypt
    println(s"Decrypted message : $decrypted\n")

}
}