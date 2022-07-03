package com.example.homework3

import com.github.javafaker.Faker

class UsersService {


//    private var users = mutableListOf<User>()
//
//    init {
//        val faker = Faker.instance()
//
//        users = (1..10).map { User(
//            id = it.toLong(),
//            name = faker.name().name(),
//            company = faker.company().name(),
//        ) }.toMutableList()
//    }


    private var users: List<User> = listOf<User>(
        User(12, "111", "1222"),
        User(2, "111", "1222"),
        User(16, "111", "1222"),
        User(17, "111", "1222"),


        )

    fun getUsers(): List<User> {
        return users
    }

}