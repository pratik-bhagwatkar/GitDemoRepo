package com.example.solidprinciple.singlton

class Singleton private constructor(){

    companion object {
       private var INSTANCE :Singleton ? = null
        fun getInstance(): Singleton{
            if (INSTANCE==null){
                synchronized(this){
                    if (INSTANCE==null){
                        INSTANCE=Singleton()
                    }
                }
            }else{
                INSTANCE
            }
            return INSTANCE!!
        }
    }

}