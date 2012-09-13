package org.tereshse.algorithms.sort


trait Sort {
  /**
   * Sorts given array
   * @param ar the array
   * @tparam T
   * @return sorted array
   */
  def sort[T <% Ordered[T]](ar: Array[T]): Array[T]
}
