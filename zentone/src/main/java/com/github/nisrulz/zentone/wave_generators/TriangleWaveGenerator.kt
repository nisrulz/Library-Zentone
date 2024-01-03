package com.github.nisrulz.zentone.wave_generators

/**
 * Triangle wave generator
 *
 * Triangle Wave: Defined as the arc sine function of a sinusoid
 *
 * @see <a
 *     href="https://en.wikipedia.org/wiki/Triangle_wave">Wikipedia</a>
 */
object TriangleWaveGenerator : WaveByteArrayGenerator {

  override fun calculateData(index: Int, samplingInterval: Float, amplitude: Int): Byte {
    val angle = 2.0 * Math.PI * index / samplingInterval
    return (amplitude * waveFunction(angle) * Byte.MAX_VALUE).toInt().toByte()
  }

  /*
    generates a triangle wave by increasing linearly from -1 to 1 as phase goes from 0 to π,
    and then decreasing linearly from 1 to -1 as phase goes from π to 2π. This creates a
    triangle wave with period 2π
   */
  private fun waveFunction(angle: Double): Double {
    val phase = angle % (2 * Math.PI)
    return if (phase < Math.PI) {
      2 * phase / Math.PI - 1
    } else {
      3 - 2 * phase / Math.PI
    }
  }
}
