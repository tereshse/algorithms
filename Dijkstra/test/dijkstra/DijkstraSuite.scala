package dijkstra

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import dijkstra.Dijkstra.Graph
import dijkstra.Dijkstra.Edge
import dijkstra.Dijkstra.ShortestPath

@RunWith(classOf[JUnitRunner])
class DijkstraSuite extends FunSuite {

  test("Empty Graph creation") {
    val graph = new Graph(Array())
    assert(graph.E === 0)
    assert(graph.V === 0)
    assert(graph.edges().size === 0)
    intercept[IndexOutOfBoundsException] {
      graph.edges(1).size === 0
    }
    // assert(graph.edges(1).size === 0)

  }

  test("Graph creation") {
    val graph = new Graph(Array(
      Set(new Edge(0, 1, 1), new Edge(0, 2, 4)),
      Set(new Edge(1, 3, 6), new Edge(1, 2, 2)),
      Set(new Edge(2, 3, 3)),
      Set()))

    assert(graph.E === 5)
    assert(graph.V === 4)

    val edges = graph.edges()
    assert(Set(new Edge(0, 1, 1), new Edge(0, 2, 4), new Edge(1, 3, 6), new Edge(1, 2, 2), new Edge(2, 3, 3)).forall(p => edges.contains(p)))

    val edges_1 = graph.edges(1)
    assert(Set(new Edge(1, 3, 6), new Edge(1, 2, 2)).forall(p => edges_1.contains(p)))
  }
  
  test("Shortest path calculation") {
    val graph = new Graph(Array(
      Set(new Edge(0, 1, 1), new Edge(0, 2, 4)),
      Set(new Edge(1, 3, 6), new Edge(1, 2, 2)),
      Set(new Edge(2, 3, 3)),
      Set())) 

    val path = new ShortestPath(graph, 0)
    
    assert( path.findShortestPathTo(3) === (6, List(0,1,2,3)))
    assert( path.findShortestPathTo(0) === (0, List(0)))
    assert( path.findShortestPathTo(2) === (3, List(0,1,2)))
    
    assert( new ShortestPath(graph, 1).findShortestPathTo(3) === (5, List(1,2,3)))
  }
}