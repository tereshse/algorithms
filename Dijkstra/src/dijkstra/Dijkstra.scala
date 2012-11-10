package dijkstra

object Dijkstra {

  type Vertex = Int

  class Edge(val from: Vertex, val to: Vertex, val weight: Int) {
    override def hashCode(): Int = 13 * from.hashCode() + 7 * to.hashCode() + weight.hashCode()
    override def equals(other: Any) = other match {
      case that: Edge => this.from == that.from && this.to == that.to && this.weight == that.weight
      case _ => false
    }
    override def toString = from + " -(" + weight + ")-> " + to
  }

  class Graph(adj: Array[Set[Edge]]) {
    // Vertices count
    def V() = adj.size
    // Edges count
    def E() = adj.foldLeft(0)((x, s) => x + s.size)
    //get all edges
    def edges() = adj.foldLeft(Set[Edge]())((xs, s) => xs ++ s)
    //get edges accessed from the vertex
    def edges(v: Vertex) = adj(v)
  }

  class ShortestPath(val graph: Graph, val start: Vertex) {

    // Returns pair ( total weigt of the path, List of the vertices from start to target incl
    def findShortestPathTo(target: Vertex): (Int, List[Vertex]) = {
      if (target == start) (0, start :: Nil)
      else findShortestPathToInternal(target, Set((start, 0)), (0, start :: Nil))
    }

    private def findShortestPathToInternal(target: Vertex, explored: Set[(Vertex, Int)], path: (Int, List[Vertex])): (Int, List[Vertex]) = {
      //TODO handle case when there is no path from start to target
      val newExplored = findVerticesAccessedFromExplored(explored).minBy(_._2)
      if (newExplored._1 == target)
        (newExplored._2, path._2 :+ newExplored._1)
      else
        findShortestPathToInternal(target, explored + newExplored, (newExplored._2, path._2 :+ newExplored._1))
    }

    private def findVerticesAccessedFromExplored(explored: Set[(Vertex, Int)]): Set[(Vertex, Int)] = {
      for (
        exp <- explored;
        edge <- graph.edges(exp._1) if explored.exists(p => p._1.equals(edge.from)) && !explored.exists(p => p._1.equals(edge.to))
      ) yield (edge.to, exp._2 + edge.weight)
    }
  }

}