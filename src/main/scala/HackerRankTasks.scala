/**
  * Created by ladon on 01/08/2017.
  */
object HackerRankTasks extends App{

  def solveMeFirstFP(args: Array[String]) {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }

  def helloWorld() = println("Hello World")

  def helloWorldNTimes(n:Int) = for(i <- 0 until n)println("Hello World")

  def listReplication(num:Int,arr:List[Int]):List[Int] = {
    (for(i <- 0 until arr.distinct.length)yield{
      for(j <- 0 until num)yield{
        arr.distinct(i)
      }
    }).flatMap(e => e).toList
  }

  def filterArray(delim:Int,arr:List[Int]):List[Int] = arr.filter(_ < delim)

  //same result different implementations
  def filterPositionInAList(arr:List[Int]):List[Int] = (for(i <- 1 until arr.length by 2)yield arr(i)).toList
  def filterPositionInAList2(arr:List[Int]):List[Int] = arr.drop(1).sliding(1,2).toList.flatten

  def arrayOfNElements(num:Int) : List[Int] = (0 until num).toList

  def reverseAListWithoutReverse(arr:List[Int]):List[Int] = (for(i <- arr.length-1 to 0 by -1) yield arr(i)).toList

  def sumOfOddElements(arr:List[Int]):Int = arr.filter(e => (e%2!=0)).sum


}
