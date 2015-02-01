// -   Project: scalajs-glmatrix (https://github.com/jokade/scalajs-glmatrix)
// Description: Test cases for Vec2
//
// Copyright (c) 2015 Johannes Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included file LICENSE)
package test

import utest._
import biz.enef.glmatrix.Vec2

import scala.scalajs.js

object Vec2Test extends TestSuite {
  override val tests = TestSuite {

    'Bindings-{

      'add-{
        val v1 = Vec2(-1,2)
        val v2 = Vec2(2,-1)
        val out = Vec2()
        assert(
          Vec2.add(out,v1,v2)(0) == 1,
          out(1) == 1
        )
      }

      'create-{
        val v1 = Vec2.create()
        assert( v1(0) == 0, v1(1) == 0, v1.length == 2 )

        val v2 = Vec2()
        assert( v2(0) == 0, v2(1) == 0, v2.length == 2 )
      }

      'fromValues-{
        val v1 = Vec2.fromValues(1.1F,2.2F)
        assert( v1(0) == 1.1F, v1(1) == 2.2F, v1.length == 2 )

        val v2 = Vec2(1.1F,2.2F)
        assert( v2(0) == 1.1F, v2(1) == 2.2F, v2.length == 2 )
      }
    }
  }
}
