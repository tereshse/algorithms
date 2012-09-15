package org.tereshse.algorithms.sort


trait Sort {
  /**
   * Sorts given array
   * @param ar the array
   * @tparam T
   * @return sorted array
   */
  def sort[T <% Ordered[T]](ar: Array[T]): Array[T] = {
    if (ar == null) return null
    if (ar.length == 0 || ar.length == 1) return ar
    return doSort(ar)
  }

  /**
   * Sorts given not empty array
   * @param ar the array
   * @tparam T
   * @return sorted array
   */
  def doSort[T <% Ordered[T]](ar: Array[T]): Array[T]

}
