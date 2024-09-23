package com.sample.libconflic

import com.sample.libconflic.somepkg.Animal
import com.sample.libconflic.somepkg.Cat
import com.sample.libconflic.somepkg.Dog

class SampleClass {

    val animals: MutableList<Animal> = mutableListOf()

    fun init() {
        animals.add(Cat())
        animals.add(Dog())
    }
}