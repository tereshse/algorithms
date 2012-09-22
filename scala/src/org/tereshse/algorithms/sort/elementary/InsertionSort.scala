package org.tereshse.algorithms.sort.elementary

import org.tereshse.algorithms.sort.Sort
import org.tereshse.algorithms.sort.utils.SortUtils._
import util.control.Breaks._

/**
 * Implements Insertion Sort algorithm
 *
 * The algorithm that people often use to sort bridge hands is to consider the cards one at a time,
 * inserting each into its proper place among those already considered (keeping them sorted). In a computer
 * implementation, we need to make space for the current item by moving larger items one position to the right,
 * before inserting the current item into the vacated position.
 */
class InsertionSort extends Sort {

  /**
   * Sorts given array
   * @param ar the array
   * @tparam T
   * @return sorted array
   */
  def doSort[T <% Ordered[T]](ar: Array[T]): Array[T] = {
    doSort(ar,1)
  }

  def doSort[T <% Ordered[T]](ar: Array[T], inc: Int): Array[T] = {
    for (i <- inc until ar.length) {
      var j = i
      while(j>=inc && less(ar(j), ar(j - 1))){
        swap(ar, j, j - 1)
        j=j-inc
      }
    }
    ar
  }
}
