package org.tereshse.algorithms.sort.elementary

import org.tereshse.algorithms.sort.utils.SortUtils.swap
import org.tereshse.algorithms.sort.utils.SortUtils.less

import org.tereshse.algorithms.sort.Sort


/**
 * Implements Selections sort algorithm
 *
 * One of the simplest sorting algorithms works as follows: First, find the smallest item in the array, and exchange it
 * with the first entry. Then, find the next smallest item and exchange it with the second entry. Continue in this way
 * until the entire array is sorted.
 */

class SelectionSort extends Sort{

  /**
   * Sorts given array
   * @param ar the array
   * @tparam T
   * @return sorted array
   */
  def sort[T <% Ordered[T]](ar: Array[T]): Array[T] = {
    if (ar == null) return null
    if (ar.length == 1) return ar
    for (i <- 0 until ar.length-1){
                  //find index of minimal element index in range i .. ar.length-1
      swap(ar, i, (i+1 until ar.length).foldLeft(i)((first, second) => if (ar(first) < ar(second)) first else second))
    }
    return ar
  }

}
