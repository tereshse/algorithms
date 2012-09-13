package org.tereshse.algorithms.sort.elementary

import org.scalatest.FunSuite
import org.tereshse.algorithms.sort.utils.SortUtils.isSorted

class SelectionSortTest extends FunSuite {
  var sort: SelectionSort = new SelectionSort()

  test("that sort of emply Array is empty Array") {
    //given //when //then
    assert(sort.sort(Array[Int]()).length == 0)
  }

  test("that sort of one element Array is one element Array") {
    //given //when
    val sortedArray = sort.sort(Array[java.lang.Integer](2))
    //then
    assert(sortedArray.length == 1)
    assert(sortedArray(0) == 2)
  }

  test("that sort of 2 element Array is ...") {
    //given //when
    val sortedArray = sort.sort(Array[java.lang.Integer](3,2))
    //then
    assert(sortedArray.length == 2)
    assert(sortedArray(0) == 2)
    assert(sortedArray(1) == 3)
    assert(isSorted(sortedArray))
  }

  test("that sort of 3 element Array is ...") {
    //given //when
    val sortedArray = sort.sort(Array(3,2,1))
    //then
    assert(sortedArray.length == 3)
    assert(isSorted(sortedArray))

  }
  test("that sort of n element Array is ...") {
    //given //when
    val sortedArray = sort.sort(Array(3,2,5,8,1,4,7,6))
    //then
    println(sortedArray.length)
    assert(sortedArray.length == 8)
    assert(isSorted(sortedArray))

  }
}
