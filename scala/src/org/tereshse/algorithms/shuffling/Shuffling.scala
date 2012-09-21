package org.tereshse.algorithms.shuffling

import org.tereshse.algorithms.sort.utils.SortUtils

/**
 * Implement suffling algorithm of array
 */
class Shuffling {
  /**
   * Shuffles array of T
   * @param ar
   * @tparam T
   * @return
   */
  def shuffle[T]( ar : Array[T]) : Array[T] = {
    for (i <- 0 until ar.length-1){
      SortUtils.swap( ar, i, scala.math.round((scala.math.random * i)).toInt)
    }
    ar
  }
}
