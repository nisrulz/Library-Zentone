package com.github.nisrulz.zentone.wavegenerators

/**
 * Triangle wave generator
 *
 * Triangle Wave: A triangle wave increases and decreases linearly, creating a wave that looks like a
 * series of triangles.
 *
 * @see <a
 *     href="https://en.wikipedia.org/wiki/Triangle_wave">Wikipedia</a>
 */
object TriangleWaveGenerator : WaveByteArrayGenerator {
  override var phase: Double = 0.0

  override fun waveFunction(angle: Double): Double =
    if (angle < Math.PI) {
      2 * angle / Math.PI - 1
    } else {
      3 - 2 * angle / Math.PI
    }
}
