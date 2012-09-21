package org.tereshse.algorithms.sort.utils

/**
 * Provides methods to generate random values
 */
object RandomUtils {

  /**
   * Gererates random Int in range 0 .. i
   * @param i
   * @return
   */
  def getRandomInt(i: Int): Int = {
    scala.math.round((scala.math.random * i)).toInt
  }

}
