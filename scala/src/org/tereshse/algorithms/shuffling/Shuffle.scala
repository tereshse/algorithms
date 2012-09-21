package org.tereshse.algorithms.shuffling

import org.tereshse.algorithms.sort.utils.{RandomUtils, SortUtils}

/**
 * Implement suffling algorithm of array
 */
class Shuffle {

  var random : (Int) => Int = RandomUtils.getRandomInt(_)

  /**
   * Shuffles array of T
   * @param ar
   * @tparam T
   * @return
   */
  def shuffle[T]( ar : Array[T]) : Array[T] = {
    for (i <- 0 until ar.length){
      SortUtils.swap( ar, i, random(i))
    }
    ar
  }

 }
