
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/deadmanpr/Documents/Git/DataBase/DealItSrv/conf/routes
// @DATE:Sun Oct 02 13:40:27 AST 2016


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
