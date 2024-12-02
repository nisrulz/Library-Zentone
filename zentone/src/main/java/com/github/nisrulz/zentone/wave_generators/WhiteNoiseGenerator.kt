package com.github.nisrulz.zentone.wave_generators

import kotlin.random.Random

object WhiteNoiseGenerator : WaveByteArrayGenerator {
  override var phase: Double = 0.0
  override fun waveFunction(angle: Double): Double {
    return Random.nextFloat() * 2.0 - 1.0
  }
}
