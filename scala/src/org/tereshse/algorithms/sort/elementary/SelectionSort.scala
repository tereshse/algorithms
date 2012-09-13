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
      swap(ar, i, findMinElementIndex(ar, i))
    }
    return ar
  }

  /**
   * Finds index of minimum element starts from the given index in the array
   * @param ar the array
   * @param first index to start from
   * @tparam T
   * @return index of minimun element in sub array
   */
  private def findMinElementIndex[T <% Ordered[T]](ar: Array[T], first:Int): Int = {
    var min : Int = first;

    for(i <- first until ar.length){
      if(less(ar(i),ar(min))){
        min = i
      }
    }
    return min
  }

}
