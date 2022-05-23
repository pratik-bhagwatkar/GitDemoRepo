package com.example.solidprinciple.observer

class User1 : Observer{

    override fun update(msg: String) {
        println("User 1 : $msg")
    }
}