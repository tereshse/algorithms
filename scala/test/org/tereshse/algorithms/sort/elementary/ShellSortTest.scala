package org.tereshse.algorithms.sort.elementary

import org.scalatest.FunSuite
import org.tereshse.algorithms.sort.utils.SortUtils._
import java.util
import org.tereshse.algorithms.sort.utils.RandomUtils


class ShellSortTest extends FunSuite {
  val sort: ShellSort = new ShellSort()

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

  test("that sort of n random element Array with dublicates is ...") {
    //given
    val unsortedArray = Array.fill(100){RandomUtils.getRandomInt(100)}
    //when
    val sortedArray = sort.sort(unsortedArray)
    //then
    assert(sortedArray.length == 100)
    assert(isSorted(sortedArray))
  }

}