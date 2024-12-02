package com.github.nisrulz.zentone.wavegenerators

/**
 * Square wave generator
 *
 * Square Wave: The square wave has only odd harmonics. This harmonic structure gives the square wave a little more
 * bite to the sound.
 *
 * @see <a
 *     href="https://en.wikipedia.org/wiki/Square_wave">Wikipedia</a>
 */
object SquareWaveGenerator : WaveByteArrayGenerator {
  override var phase: Double = 0.0

  override fun waveFunction(angle: Double): Double = if (angle < Math.PI) 1.0 else -1.0
}
