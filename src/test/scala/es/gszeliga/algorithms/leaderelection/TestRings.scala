package es.gszeliga.algorithms.leaderelection
/*

import akka.actor.{ActorRef, Actor, ActorSystem, Props}
import akka.testkit.TestKit
import org.scalatest.{FlatSpecLike, Matchers}

import scala.util.Random

/**
  * Created by guillermo on 27/04/16.
  */
class TestRings extends TestKit(ActorSystem("test-actor-system")) with FlatSpecLike with Matchers {

  private val integers: () => Int = Random.nextInt

  case class Config(ref: ActorRef)

  class ShallowActor[ID](val id: ID) extends Actor {
    def receive  = {
      case _ =>
    }
  }

  "Ring" should "have an specific number of nodes" in {

    val ring = Ring.unidirectional(10)(integers){id => new UnidirectionalMemberProps[Int,ShallowActor[Int],Config] {
      def props = Props(new ShallowActor(id))
      def config(references: Member[Int, Config]) = new Config(references.ref())
    }
    }

    ring.size() shouldBe 10
  }

  it should "create as many nodes as requested" in {

    val ring = Ring.unidirectional(10)(integers){id => new UnidirectionalMemberProps[Int, ShallowActor[Int],Config] {
      def props = Props(new ShallowActor(id))
      def config(references: Member[Int, Config]) = new Config(references.ref())
    }
    }

    ring.members should have length 10

  }


}
*/
