package com.github.nisrulz.zentone.wave_generators

import kotlin.random.Random

object BrownNoiseGenerator : WaveByteArrayGenerator {
  override var phase: Double = 0.0
  private var lastOut = 0.0
  override fun waveFunction(angle: Double): Double {
    val white = Random.nextFloat() * 2.0 - 1.0
    val value = (lastOut + (0.02 * white)) / 1.02
    lastOut = value
    return lastOut
  }
}

