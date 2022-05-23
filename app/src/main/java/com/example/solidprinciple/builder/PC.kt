package com.example.solidprinciple.builder

data class PC(
    var processor: String,
    var ram: String = "2GB",
    var battery: String = "5000MAH",
    var screenSize: String = "15inch"
)
