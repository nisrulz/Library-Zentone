package com.github.nisrulz.zentone.wavegenerators

import com.github.nisrulz.zentone.DEFAULT_FREQUENCY_HZ
import com.github.nisrulz.zentone.DEFAULT_SAMPLE_RATE
import com.github.nisrulz.zentone.internal.minBufferSize

interface WaveByteArrayGenerator {
  var phase: Double

  private fun calculateAngle(
    i: Int,
    freqOfTone: Float,
    sampleRate: Int,
  ): Double = ((i.toFloat() / sampleRate) * freqOfTone * 2.0 * Math.PI).toDouble()

  private fun calculateSample(angle: Double): Byte = (waveFunction(angle) * Byte.MAX_VALUE).toInt().toByte()

  /**
   * Generate byte data for tone
   *
   * @param freqOfTone Frequency of the tone you want to generate, in Hz.
   * @param sampleRate Number of samples per second, in Hz
   * @return ByteArray of generated tone
   */
  fun generate(
    freqOfTone: Float = DEFAULT_FREQUENCY_HZ,
    sampleRate: Int = DEFAULT_SAMPLE_RATE,
  ): ByteArray {
    val bufferSize = minBufferSize(sampleRate)
    val generatedSnd = ByteArray(bufferSize)

    for (i in generatedSnd.indices) {
      val angle = calculateAngle(i, freqOfTone, sampleRate)
      generatedSnd[i] = calculateSample(angle)
      phase += 1.0 / (sampleRate / freqOfTone)
    }

    return generatedSnd
  }

  fun waveFunction(angle: Double): Double
}
