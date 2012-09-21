package org.tereshse.algorithms.sort.utils

/**
 * Container for sort algorithm's utility methods
 */
object SortUtils {
  /**
   * Swap first and second element of array
   * @param ar tarhet array
   * @param first index of the first element to swap
   * @param second index of the second element to swap
   * @tparam T
   */
  def swap[T](ar: Array[T], first: Int, second: Int) {
    if (ar == null) return
    if (ar.length == 0) return
    if (ar.length == 1) return
    val temp: T = ar(first)
    ar(first) = ar(second)
    ar(second) = temp
  }

  /**
   * Return true is first parameter is less then second
   * @param first ordered value
   * @param second ordered value
   * @tparam T ordered type
   * @return true is first parameter is less then second
   */
  def less[T <% Ordered[T]](first: T, second: T): Boolean = {
    if (first.compareTo(second) < 0)
      return true
    else
      return false
  }

  /**
   * Return true is first parameter is greater then second
   * @param first ordered value
   * @param second ordered value
   * @tparam T ordered type
   * @return true is first parameter is greater then second
   */
  def greater[T <% Ordered[T]](first: T, second: T): Boolean = {
    if (first.compareTo(second) > 0)
      return true
    else
      return false
  }


  /**
   * Returns true if given array is sorted
   * @param ar the array
   * @tparam T
   * @return true if given array is sorted
   */
  def isSorted[T <% Ordered[T]](ar: Array[T]): Boolean = {
    if (ar == null) return true
    if (ar.length == 0) return true
    if (ar.length == 1) return true

    for (i <- 1 until ar.length) {
      if (greater(ar(i - 1), ar(i)))
        return false
    }
    return true
  }
}
