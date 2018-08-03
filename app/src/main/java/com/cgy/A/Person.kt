package com.cgy.A


/**
 * Created by ChenGY on 2018-07-10.
 */

fun loadEmails(person: Person): List<String> {
    return listOf<String>("646", "646")
}

class Person(val name: String, val age: Int)

fun fdf() {
    val person = Person("Alice", 29)
    val member = Person::age


    val d = member.getter.call("646")


}

