package com.example.homework3

import com.github.javafaker.Faker

class UsersService {


    private var users = mutableListOf<User>()

    init {
        val faker = Faker.instance()

        users = (1..10).map { User(
            id = it.toLong(),
            name = faker.name().name(),
            company = faker.company().name(),
        ) }.toMutableList()
    }
}