package com.example.solidprinciple.facade
//Repository act as a Facade
class Repository{

    private val complexSystem:ComplexSystem = ComplexSystem()

    fun insertData(data: String){
        complexSystem.storeData(data)
    }

    fun loadData(){
        complexSystem.getData()
    }


}