package domain

import data.repository.DataRS

class TestClassOrIdk {

    fun test( name: String ): String {
        val res = DataRS().getData("Añom")
        return res
    }
}