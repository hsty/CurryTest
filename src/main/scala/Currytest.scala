object Currytest extends App{

  //def sum(f: Int => Int): (Int, Int) => Int = {
  //  def sumF(a: Int, b:Int): Int =
  //    if(a>b) 0
  //    else f(a) + sumF(a+1, b)
  //  sumF
  //}

  def sum(f: Int=>Int)(a: Int, b: Int): Int = abc(f, (x,y)=>x+y, 0)(a,b)
  //  if(a>b) 0 else f(a)+sum(f)(a+1,b)

  println(sum(x=>x*x*x)(1,10))

  def product(f: Int=>Int)(a: Int, b:Int): Int = abc(f, (x, y)=>x*y, 1)(a,b)
  //  if(a>b)1 else f(a)*product(f)(a+1,b)

  def factorial(a: Int) = product(x=>x)(1,a)

  //5 factorial
  println(factorial(5))


  def abc(f: Int=>Int, combine: (Int, Int)=>Int, zero: Int) (a: Int, b: Int): Int =
    if(a>b) zero
    else combine(f(a), abc(f,combine,zero)(a+1,b))



}
