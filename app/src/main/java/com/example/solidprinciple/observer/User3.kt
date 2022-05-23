package com.example.solidprinciple.observer

class User3 : Observer{

    override fun update(msg: String) {
        println("User 3 : $msg")
    }
}