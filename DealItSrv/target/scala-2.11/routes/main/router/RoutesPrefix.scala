
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/deadmanpr/DealItSrv/conf/routes
// @DATE:Sun Oct 02 11:20:29 AST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
