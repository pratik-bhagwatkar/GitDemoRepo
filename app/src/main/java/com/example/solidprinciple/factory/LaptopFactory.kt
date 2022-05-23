package com.example.solidprinciple.factory

class LaptopFactory {

    fun getLaptop(type:LaptopType) : Laptop{
        return when(type){
            LaptopType.dell ->{
                Dell()
            }
            LaptopType.hp ->{
                Hp()
            }
            LaptopType.apple ->{
                Apple()
            }
        }
    }
}