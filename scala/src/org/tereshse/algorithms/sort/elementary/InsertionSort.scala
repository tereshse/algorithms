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

    for (i <- 1 until ar.length) {
      if (less(ar(i), ar(i - 1))) {
        breakable {
          for (j <- i until 0 by -1) {
            if (less(ar(j), ar(j - 1)))
              swap(ar, j, j - 1)
            else
              break
          }
        }
      }
    }

    return ar
  }

}
