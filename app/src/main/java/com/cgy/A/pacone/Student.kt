package com.cgy.A.pacone

/**
 * Created by ChenGY on 2018-05-31.
 */
class Student(val name: String, val age: Int)


class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    user.viBeforeSave()
}

fun User.viBeforeSave() {
    fun vi(value: String, name: String) {
        if (value.isEmpty())
            throw IllegalArgumentException("434$id")
    }
}

class Demo(val name: String, var age: Int, val ss : String?) {
    override fun toString() = "name:$name,age$age"
    override fun equals(other: Any?): Boolean {

        val a: String? = null
        a?.let {  }


        return super.equals(other)
    }
}


sealed class c(name: String) {
    class d : c("") {
        init {
            print("")
        }
    }

    class e(name2: String) : c(name2) {
        val nnn = name2

    }

    class f(val name3: String) : c(name3)
}

open class Client(val name: String, val postalCode: List<String>)

fun strLen(s: String?) = {
}


