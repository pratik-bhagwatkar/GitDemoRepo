package com.example.solidprinciple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.solidprinciple.adapter.DataDisplay
import com.example.solidprinciple.adapter.DataDisplayAdapter
import com.example.solidprinciple.adapter.DatabaseDataGenerator
import com.example.solidprinciple.builder.PC
import com.example.solidprinciple.builder.PersonalComputer
import com.example.solidprinciple.facade.ComplexSystem
import com.example.solidprinciple.facade.Repository
import com.example.solidprinciple.factory.Laptop
import com.example.solidprinciple.factory.LaptopFactory
import com.example.solidprinciple.factory.LaptopType
import com.example.solidprinciple.observer.*
import com.example.solidprinciple.singlton.SingleClass
import com.example.solidprinciple.singlton.Singleton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Factory Object Creation
        val laptopFactory = LaptopFactory()
        val obj:Laptop=laptopFactory.getLaptop(LaptopType.apple)
        Log.i("awa",obj.toString())
        obj?.specification()

        //Observer Patter
        val user1= User1()
        val user2= User2()
        val user3= User3()
        val youtubeChannel1= YoutubeChannel1()
        val youtubeChannel2= YoutubeChannel2()
        youtubeChannel1.registerObserver(user1)
        youtubeChannel1.registerObserver(user2)
        youtubeChannel2.registerObserver(user1)
        youtubeChannel2.registerObserver(user2)
        youtubeChannel2.registerObserver(user3)
        youtubeChannel1.unRegisterObserver(user1)
        youtubeChannel1.newVideoAdded("New video 1 added in channel 1")
        youtubeChannel2.newVideoAdded("New video 3 added in channel 2")

        //Facade Patter
        val repository=Repository()
        repository.insertData("101010101")
        repository.loadData()


        //Singleton Object Creation
        val obj1= Singleton.getInstance()
        val obj2=Singleton.getInstance()
        val obj3= SingleClass
        val obj4=SingleClass
        println(obj1)
        println(obj2)
        println(obj3)
        println(obj4)


        //Builder Design Pattern
        PersonalComputer.Builder("i7")
            .setRam("8GB")
            .setBattery("6000MAH")
            .create()

        val pc= PC("Intel")



        //Adapter Design Pattern
        val generator = DatabaseDataGenerator()
        val generatedData = generator.generateData()
        val adapter = DataDisplayAdapter(DataDisplay())
        val convertData = adapter.convertData(generatedData)

        for (c in convertData){
            println(c)
        }


    }
}