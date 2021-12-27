import java.lang.IllegalArgumentException

//class UnitTestPractice {
//    fun fib(n: Int): Long {
//        if (n == 0 || n == 1) {
//            return n.toLong()
//        }
//        var a = 0L
//        var b = 1L
//        var c = 1L
//        (1..n - 2).forEach { i ->
//            c = a + b
//            a = b
//            b = c
//        }
//        return c
//    }
//
//
//    fun validateRegistrationInput(username: String, password: String, ConfirmedPassword: String): Boolean {
//        return true
//    }
//}

class Registration( email: String, pwd: String, age : Int, gender:Char){

    var email_id : String = email
        get(){
            return field.toLowerCase()
        }
    var password : String = pwd
        set(value){
            field = if (value.length > 6) value else throw IllegalArgumentException("Passwords is too small")
        }
    var age : Int = age
        set(value){
            field = if (value > 18) value else throw IllegalArgumentException("Age must be 18+")
        }
    var gender : Char = gender
        set(value){
            field = if (value == 'M') value else throw IllegalArgumentException("User should be male")
        }
}

class  Rectangle(val height : Int, val width : Int) {
    val isSquare : Boolean
    get() {
        return height == width
    }
}
    fun main(args: Array<String>){
        val geek = Registration("jaichaudahry1024@gmail.com", " asijodna", 40, 'M')
//
//        println("${geek.email_id}")
//        geek.email_id = "careers.org"
//        println("${geek.password}")
//        println("${geek.email_id}")
//        println("${geek.age}")
//        println("${geek.gender}")

        val rectangle = Rectangle(98327482, 32480)
        println(rectangle.isSquare)
    }
// updateq
