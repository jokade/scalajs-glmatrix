// -   Project: scalajs-glmatrix (https://github.com/jokade/scalajs-glmatrix)
// Description: Scala.js bindings for glMatrix vec2 class
//
// Copyright (c) 2015 Johannes Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included file LICENSE)
package biz.enef.glmatrix

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSBracketAccess, JSName}

/**
 * A 2D vector.
 */
@JSName("vec2")
trait Vec2 extends js.Object {
  /**
   * Returns the specified vector element.
   *
   * @param idx element index (0 or 1)
   */
  @JSBracketAccess
  def apply(idx: Int) : Float = js.native

  def length : Int = js.native
}


/**
 * Operations on 2D vectors.
 */
@JSName("vec2")
object Vec2 extends js.Object {

  /**
   * Adds two Vec2's.
   *
   * @param out the receiving vector
   * @param a the first operand
   * @param b the second operand
   * @return out
   */
  def add(out: Vec2, a: Vec2, b: Vec2) : Vec2 = js.native

  /**
   * Creates a new Vec2 initialized with values from an existing vector.
   *
   * @param a vector to clone
   * @return a new 2D vector
   */
  def clone(a: Vec2) : Vec2 = js.native

  /**
   * Copy the values from one Vec2 to another.
   *
   * @param out the receiving vector
   * @param a the source vector
   * @return out
   */
  def copy(out: Vec2, a: Vec2) : Vec2 = js.native

  /**
   * Creates a new, empty Vec2.
   *
   * @return a new 2D vector
   */
  def create() : Vec2 = js.native

  /**
   * Creates a new, empty Vec2.
   */
  @JSName("create")
  def apply() : Vec2 = js.native

  /**
   * Computes the cross product of two Vec2's. Note that the cross
   * product must by definition produce a 3D Vector.
   *
   * @param out the receiving vector
   * @param a the first operand
   * @param b the second operand
   * @return out
   */
  def cross(out: Vec3, a: Vec2, b: Vec2) : Vec3 = js.native

  /**
   * Calculates the euclidian distance between two Vec2's.
   *
   * @param a the first operand
   * @param b the second operand
   * @return distance between a and b
   */
  def distance(a: Vec2, b: Vec2) : Float = js.native

  /**
   * Divides two Vec2's.
   *
   * @param out the receiving vector
   * @param a the first operand
   * @param b the second operand
   * @return out
   */
  def divide(out: Vec2, a: Vec2, b: Vec2) : Vec2 = js.native

  /**
   * Calculates the dot product of two Vec2's.
   *
   * @param a the first operand
   * @param b the second operand
   * @return dot product of a and b
   */
  def dot(a: Vec2, b: Vec2) : Float = js.native

  // TODO: implement forEach (semantics yet unclear)
  //def forEach(a: js.Array[Vec2], stride)

  /**
   * Creates a new Vec2 initialized with the given values.
   *
   * @param x X component
   * @param y Y component
   * @return a new 2D vector
   */
  def fromValues(x: Float, y: Float) : Vec2 = js.native

  /**
   * Creates a new Vec2 initialized with the given values.
   *
   * @param x X component
   * @param y Y component
   * @return a new 2D vector
   */
  @JSName("fromValues")
  def apply(x: Float, y: Float) : Vec2 = js.native

  /**
   * Calculates the length of a Vec2.
   *
   * @param a vector to calculate length of
   */
  def length(a: Vec2) : Float = js.native

  /**
   * Performs a linear interpolation between two Vec2's.
   *
   * @param out the receiving vector
   * @param a the first operand
   * @param b the second operand
   * @param t interpolation amount between two inputs
   * @return out
   */
  def lerp(out: Vec2, a: Vec2, b: Vec2, t: Float) : Vec2 = js.native

  /**
   * Returns the maximum of two Vec2's.
   *
   * @param out the receiving vector
   * @param a the first operand
   * @param b the second operand
   * @return out
   */
  def max(out: Vec2, a: Vec2, b: Vec2) : Vec2 = js.native

  /**
   * Returns the minimum of two Vec2's.
   *
   * @param out the receiving vector
   * @param a the first operand
   * @param b the second operand
   * @return out
   */
  def min(out: Vec2, a: Vec2, b: Vec2) : Vec2 = js.native

  /**
   * Multiplies two Vec2's
   *
   * @param out the receiving vector
   * @param a the first operand
   * @param b the second operand
   * @return out
   */
  def multiply(out: Vec2, a: Vec2, b: Vec2) : Vec2 = js.native

  /**
   * def Negates the components of a Vec2.
   *
   * @param out the receiving vector
   * @param a vector to negate
   * @return out
   */
  def negate(out: Vec2, a: Vec2) : Vec2 = js.native

  /**
   * Normalize a Vec2
   *
   * @param out the receiving vector
   * @param a vector to normalize
   * @return out
   */
  def normalize(out: Vec2, a: Vec2) : Vec2 = js.native

  /**
   * Generates a random vector with the given scale
   *
   * @param out the receiving vector
   * @param scale length of the resulting vector
   * @return out
   */
  def random(out: Vec2, scale: Float = 1F) : Vec2 = js.native

  /**
   * Scales a Vec2 by a scalar number.
   *
   * @param out the receiving vector
   * @param a the vector to scale
   * @param scale amount to scale the vector by
   * @return out
   */
  def scale(out: Vec2, a: Vec2, scale: Float) : Vec2 = js.native

  /**
   * Add two Vec2's after scaling the second operand by a scalar value.
   *
   * @param out the receiving vector
   * @param a the first operand
   * @param b the second operand
   * @param scale the amount to scale b by before adding
   * @return out
   */
  def scaleAndAdd(out: Vec2, a: Vec2, b: Vec2, scale: Float) : Float = js.native

  /**
   * Set the components of a Vec2 to the given values.
   *
   * @param out the receiving vector
   * @param x X component
   * @param y Y component
   * @return out
   */
  def set(out: Vec2, x: Float, y: Float) : Vec2 = js.native

  /**
   * Calculates the squared euclidian distance between two Vec2's
   *
   * @param a the first operand
   * @param b the second operand
   * @return squared distance between a and b
   */
  def squareDistance(a: Vec2, b: Vec2) : Float = js.native

  /**
   * Calculates the squared length of a Vec2
   *
   * @param a vector to calculate squared length of
   * @return squared length of a
   */
  def squaredLength(a: Vec2) : Float = js.native

  /**
   * Returns a string representation of a vector
   *
   * @param vec vector to represent as a string
   * @return string representation of the vector
   */
  def str(vec: Vec2) : String = js.native

  /**
   * Subtracts vector b from vector a
   *
   * @param out the receiving vector
   * @param a the first operand
   * @param b the second operand
   * @return out
   */
  def subtract(out: Vec2, a: Vec2, b: Vec2) : Vec2 = js.native
}
