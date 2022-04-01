package upskill

import scala.annotation.tailrec

object labRecursion:
// soma dos números n
  def sumFirstNumbers(n: Int) : Long=
    if (n> 0) n + sumFirstNumbers(n-1) else n

  def sumFirstNumbersTR(n:Int): Long=
    @scala.annotation.tailrec
    def aux (x: Int, acc:Long): Long=
      if ( x>0) aux(x-1,acc+x) else acc
    if (n>1) aux(n,0 ) else n


//repetir carateres n vezes
  def repeatChar(c: Char, n: Int) : String =
    if (n > 0) c + repeatChar(c,n-1) else ""

  def repeatCharTR(c: Char, n: Int) : String =
    @scala.annotation.tailrec
    def aux(n:Int, acc:String):String=
      if(n>1) aux(n-1,acc+c) else c+acc
    aux(n,"" )

  // Repetir números n vezes
  def repeatNumber(d: Int, n: Int) : String =
    if (n > 0) d + repeatNumber(d,n-1) else ""


  def repeatNumberTR(d: Int, n: Int) : String =
    @tailrec
    def aux(n:Int,acc:String):String=
      if(n>1) aux(n-1,acc+d) else acc+d
    aux(n,"")

/*
  def repeatNumberTR(d: Int, n: Int) : String =
    @tailrec
    def repeatNumberTR(d:Int,n:Int,acc:String): String=
      if (n<=0) acc else repeatNumberTR(d,n-1,d+acc)
    repeatNumberTR(d,n,"" )
*/

  //Repetir String
  def repeatString(s: String, n: Int) : String =
    if (n > 0) s + repeatString(s,n-1) else ""

  def repeatStringTR(s: String, n: Int) : String =
    @tailrec
    def aux(n:Int,acc:String):String=
      if(n>1) aux(n-1,acc+s) else acc+s
    aux(n,"")

  // Fatorial
  def factorial(n: Long): Long =
    if (n == 0) 1 else n * factorial(n - 1)

  def factorialTR(n: BigInt): BigInt =
    @scala.annotation.tailrec
    def fact_aux(acc:BigInt, n:BigInt):BigInt=
      if (n<=0) acc else fact_aux(acc*n,n-1)
    fact_aux(1,n)

  def palindroma(s:String):Boolean=
     if(s.size<2) true else s.charAt(0)==s.size-1 &&
       palindroma(s.substring(1,s.size-1))
       
    @tailrec
    def palindroma_aux(n:Int,c:Char):String
      n=s1.size()
