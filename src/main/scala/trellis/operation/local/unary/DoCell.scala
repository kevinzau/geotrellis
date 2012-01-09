package trellis.operation

import trellis.raster._
import trellis.process._

/**
  * Perform a function on every cell in a raster.
  *
  * For example,
  * <pre>
  * val R = LoadFile(f)
  * val D = DoCell(R, x => x + 3 ) // add 3 to every cell in the raster  
  * </pre>
  */
case class DoCell(r:Op[IntRaster], f:(Int) => Int) extends UnaryLocal {
  //@inline
  //final def handleCell(z:Int): Int = f(z)
  def getCallback(context:Context) = f
}