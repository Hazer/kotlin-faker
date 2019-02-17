package com.github.sergio.igwt.kfaker

import java.security.SecureRandom
import java.util.Random

internal class RandomService(private val random: Random = SecureRandom()) {

    fun nextInt() = random.nextInt()

    fun nextInt(bound: Int) = random.nextInt(bound)

    fun nextInt(intRange: IntRange): Int {
        val lowerBound = requireNotNull(intRange.min())
        val upperBound = requireNotNull(intRange.max())

        return nextInt(lowerBound, upperBound)
    }

    fun nextInt(min: Int, max: Int) = random.nextInt(max - min + 1) + min

    fun <T> randomValue(list: List<T>) = list[nextInt(list.size)]
}