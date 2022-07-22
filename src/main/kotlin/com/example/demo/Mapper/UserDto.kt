package com.example.demo.Mapper

import org.jetbrains.annotations.NotNull

data class UserDto (
    var userId: Long,
    @NotNull
    var firstName:String,
    @NotNull
    var lastName:String,
    @NotNull
    var email:String,
    @NotNull
    var password:String
        )