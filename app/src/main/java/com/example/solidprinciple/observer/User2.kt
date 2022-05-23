package com.example.solidprinciple.observer

class User2 : Observer{

    override fun update(msg: String) {
        println("User 2 : $msg")
    }
}