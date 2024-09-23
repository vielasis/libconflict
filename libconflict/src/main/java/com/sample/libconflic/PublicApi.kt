package com.sample.libconflic

import com.sample.libconflic.somepkg.Animal
import java.util.UUID

class PublicApi {

    fun statefulSample() {
        val s = SampleClass().apply { init() }
        s.animals.add(0, Animal { UUID.randomUUID().toString() })
    }

}