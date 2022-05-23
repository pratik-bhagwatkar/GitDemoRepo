package com.example.solidprinciple.observer

class YoutubeChannel2 : Subject {

    var observerList=ArrayList<Observer>()

    override fun registerObserver(obj: Observer) {
        observerList.add(obj)
    }

    override fun unRegisterObserver(obj: Observer) {
        observerList.remove(obj)
    }

    override fun notifyObserver(msg: String) {
        for (o in observerList){
            o.update(msg)
        }
    }

    fun newVideoAdded(msg: String){
        notifyObserver(msg)
    }
}