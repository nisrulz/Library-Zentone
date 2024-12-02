package com.github.nisrulz.zentone.wave_generators

import kotlin.math.sin


/**
 * Sine wave generator
 *
 * Sine Wave: The most basic and simple waveform, a sine wave has a simple hollow sound.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Sine_wave">Wikipedia</a>
 */
object SineWaveGenerator : WaveByteArrayGenerator {

  override var phase: Double = 0.0
  override fun waveFunction(angle: Double): Double {
    return sin(angle)
  }
}
