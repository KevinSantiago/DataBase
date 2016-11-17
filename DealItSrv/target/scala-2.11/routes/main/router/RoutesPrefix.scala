
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jariel/Documents/Oficial/DataBase/DealItSrv/conf/routes
// @DATE:Thu Nov 17 04:33:11 PST 2016


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
