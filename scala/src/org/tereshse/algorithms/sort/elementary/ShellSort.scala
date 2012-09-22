package org.tereshse.algorithms.sort.elementary

import org.tereshse.algorithms.sort.Sort

/**
 * Shellsort is a simple extension of insertion sort that gains speed by allowing exchanges of entries that are far
 * apart, to produce partially sorted arrays that can be efficiently sorted, eventually by insertion sort. The idea is
 * to rearrange the array to give it the property that taking every hth entry (starting anywhere) yields a sorted
 * sequence. Such an array is said to be h-sorted.
 *
 * Uses increment sequence proposed by Sedgewick and Incerpi.
 * The nth element of the sequence is the smallest integer >= 2.5^n
 * that is relatively prime to all previous terms in the sequence.
 * For example, incs[4] is 41 because 2.5^4 = 39.0625 and 41 is
 * the next integer that is relatively prime to 3, 7, and 16.
 */
class ShellSort extends Sort {
  val insertionSort = new InsertionSort()

  /**
   * Sorts given array
   * @param ar the array
   * @tparam T
   * @return sorted array
   */
  def doSort[T <% Ordered[T]](ar: Array[T]): Array[T] = {
    val N: Int = ar.length

    var h: Int = 1
    while (h < N / 3) h = h * 3 + 1

    while (h >= 1) {
      insertionSort.doSort(ar, h)
      h = h / 3
    }
    ar
  }
}
