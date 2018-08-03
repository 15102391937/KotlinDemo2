package com.cgy.A

import android.util.Log
import java.util.*
import kotlin.reflect.KClass

var counter = 0

fun coun() {
    val kProperty = ::counter

    kProperty.setter.call("4")

    val teee = Teeee()
    val sss = kProperty.getter.call()


    val ssss1 = Teeee::class
    val ssss2 = Teeee::class.java
    val ssss3 = teee.javaClass
    val ssss4 = teee.javaClass.kotlin


}

class Teeee {

    fun text(): String {
        val ck = javaClass.kotlin
        val d = Teeee::text
        return ""
    }

    fun main(args: Array<String>) {
    }

    /**
     * fjsdklaj [testLam]
     */
    fun testarrayInt(list: List<Int?>) {
        val numbers = list.filterNotNull()
        val a = numbers.sum()
        val list = listOf<String>()
        val set = setOf<String>()
        val list2: MutableList<String> = list as MutableList<String>
        val strings = Array<String>(26) { ('a' + it).toString() }
        val arrayCanNull = arrayOfNulls<String>(33)
        arrayCanNull[2] = "545"
        val arr = arrayOf("fd", "545fd", 78)
        arr[2] = "454"
        val o1 = arrayListOf(1, 2, 3)
        val o2 = listOf("1", 2, 3)
        if (o1 is List<*>) {
        }
        val d = o2 as? List<Int>?
    }

    fun testLam(l: (String) -> Unit) {
        l("testLam")
    }

    enum class Delivery { STANDARD, EXPENDITED }

    class Order(val itemCount: Int)

    fun getShippingCostCalculatro(delivery: Delivery): (Order) -> Double {
        if (delivery == Delivery.EXPENDITED) {
            return { 6 + 2.1 * it.itemCount }
        } else {
            return { 1.2 * it.itemCount }
        }

    }

    var oinl: () -> Unit = {}
    inline fun testInline(inl: () -> Unit, noinline noinl: () -> Unit) {
        inl()
        oinl = noinl
    }

    fun test222(inl: () -> String): String {
        return inl()
    }

    val people = listOf("", "53")
    fun tete() {
        people.forEach cgy@{
            if (it == "53") return@cgy
            print("is not 53")
        }


        fun testLamb(): Unit {
            with("") {
            }
        }


        val s = people.let {
            val d = "456"
            2
        }

        people.also {

        }

        val date = Date().takeIf {
            it.after(Date(2018 - 1900, 0, 1))// 是否在2018年元旦后
        }
        println("date = $date")

        repeat(2) {
            println("this is $it times - Hello world")
        }

    }

    fun <T : String> fd() {}

    fun testLet(): String {
        with("testLet") {
            return ""
        }

        unknowList.first()

    }
}

class Herd<out T>(private var leadAnimal: T, vararg animals: T) {

}

val unknowList: ArrayList<*> = arrayListOf("54")


val mapss = mutableMapOf<KClass<*>, String>()
fun sss() {
    mapss[String::class] = ""

    dd(3)
}

@Deprecated("不要用人家嘛", ReplaceWith("removeAt(index)"))
fun dd(index: Int) {
}

interface ValueSerializer<T> {
    fun toJsonValue(value: T): Any?
    fun formJsonValue(jsonValue: Any?): T
}

fun myTable() {
    val s = ""
    s.xx {
        sss()
        true
    }

}

data class hsd(val name: String, val age: Int)

class hsc : Function1<hsd, Boolean> {
    override fun invoke(p1: hsd): Boolean {
        return true
    }

    fun String.kuo() {}
}

fun String.kuo() {}


fun <T> T.xx(body: Teeee.() -> Boolean) {
    "fd".kuo()
}

fun getAddress(id: Int, name: String) = {
    //用“=”代替return，返回String类型则交给类型推断
    "got it"
    lmv("6")
    val ints = listOf(3)
    val dints = ints.map { value: Int -> value * 2 }
}

val lmv = { s: String -> Log.e("tag", s) }