package org.tereshse.algorithms.sort.elementary

import org.scalatest.FunSuite
import org.tereshse.algorithms.sort.utils.SortUtils._


class InsertionSortTest extends FunSuite {
  var sort: InsertionSort = new InsertionSort()


  test("that sort of 2 element Array is ...") {
    //given //when
    val sortedArray = sort.sort(Array[java.lang.Integer](3, 2))
    //then
    assert(sortedArray.length == 2)
    assert(isSorted(sortedArray))
  }

  test("that sort of 3 element Array is ...") {
    //given //when
    val sortedArray = sort.sort(Array(3, 2, 1))
    //then
    assert(sortedArray.length == 3)
    assert(isSorted(sortedArray))

  }

  test("that sort of n element Array is ...") {
    //given //when
    val sortedArray = sort.sort(Array(3, 2, 5, 8, 1, 4, 7, 6))
    //then
    assert(sortedArray.length == 8)
    assert(isSorted(sortedArray))

  }

  test("that sort of n element Array with dublicates is ...") {
    //given //when
    val sortedArray = sort.sort(Array(3, 2, 1, 5, 8, 1, 4, 8, 7, 6))
    //then
    assert(sortedArray.length == 10)
    assert(isSorted(sortedArray))

  }
}
