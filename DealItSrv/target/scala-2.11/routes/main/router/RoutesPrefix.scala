
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kevin/Documents/DataBase/DealItSrv/conf/routes
// @DATE:Tue Nov 15 17:35:12 AST 2016


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
