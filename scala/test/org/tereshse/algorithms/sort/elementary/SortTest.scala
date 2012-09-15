package org.tereshse.algorithms.sort.elementary

import org.scalatest.FunSuite
import org.tereshse.algorithms.sort.Sort

class SortTest  extends FunSuite {
  val sort: Sort = new Sort(){
    def doSort[T <% Ordered[T]](ar: Array[T]): Array[T] = {
      return ar
    }
  }

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
}
