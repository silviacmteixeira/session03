import scala.annotation.tailrec
//testes
upskill.labRecursion.repeatChar('a',0)

def characters(c:Char,n:Int): String=
if (n<0) ""else c+characters(c,n-1 )

characters('z',3)

def charactersTR(c:Char,n:Int): String=
  @tailrec
  def charactersTR(c:Char,n:Int,acc:String): String=
    if (n<=0) acc else charactersTR(c,n-1,c+acc)
    charactersTR(c,n,"" )