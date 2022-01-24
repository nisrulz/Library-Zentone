package github.nisrulz.zentone.internal

import github.nisrulz.zentone.DEFAULT_AMPLITUDE
import github.nisrulz.zentone.DEFAULT_FREQUENCY_HZ
import github.nisrulz.zentone.DEFAULT_SAMPLE_RATE

interface WaveByteArrayGenerator {
    fun generate(
        freqOfTone: Float = DEFAULT_FREQUENCY_HZ,
        sampleRate: Int = DEFAULT_SAMPLE_RATE
    ): ByteArray {
        val bufferSize = minBufferSize(sampleRate)
        val samplingInterval = sampleRate / freqOfTone

        val generatedSnd = ByteArray(bufferSize)

        generatedSnd.indices.forEach { i ->
            generatedSnd[i] = calculateData(i, samplingInterval, DEFAULT_AMPLITUDE)
        }

        return generatedSnd
    }

    fun calculateData(index: Int, samplingInterval: Float, amplitude: Int): Byte
}