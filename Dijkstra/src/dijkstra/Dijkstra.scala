package dijkstra
import scala.runtime.ScalaRunTime

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
    def V() = adj.size
    def E() = adj.foldLeft(0)((x, s) => x + s.size)
    def edges() = adj.foldLeft(Set[Edge]())((xs, s) => xs ++ s)
    def edges(v: Vertex) = adj(v)
  }

  class ShortestPath(val graph: Graph, val start: Vertex){
    def pathTo(target: Vertex) : (Int, List[Vertex]) = (1,Nil)
  }
}