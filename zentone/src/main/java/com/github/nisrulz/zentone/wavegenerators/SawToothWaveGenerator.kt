package com.github.nisrulz.zentone.wavegenerators

/**
 *
 * The sawtooth wave produces a lot of harmonic content and therefore a full buzzing sound.
 */
object SawToothWaveGenerator : WaveByteArrayGenerator {
  override var phase: Double = 0.0

  override fun waveFunction(angle: Double): Double = 2 * angle / Math.PI - 1
}
