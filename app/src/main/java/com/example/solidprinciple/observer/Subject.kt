package com.example.solidprinciple.observer

interface Subject {

    fun registerObserver(obj:Observer)
    fun unRegisterObserver(obj:Observer)
    fun notifyObserver(msg : String)
}