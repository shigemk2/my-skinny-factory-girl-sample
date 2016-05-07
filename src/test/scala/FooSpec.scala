import example.User
import org.scalatest._
import scalikejdbc._
import scalikejdbc.scalatest.AutoRollback
import skinny.logging.Logging
import skinny.test.FactoryGirl

class FooSpec extends fixture.FunSpec with Matchers
  with Connection with CreateTables with AutoRollback with Logging {

  override def db(): DB = NamedDB('default).toDB()

  describe("factory.conf") {
    it("should be available") { implicit session =>
      val user = FactoryGirl(User).create()
      user.os should equal("Mac OSX")
      user.java should equal("8")
      user.user should equal("shigemk2")
    }
  }
}
