
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/j-oma/Desktop/DataBase/DealItSrv/conf/routes
// @DATE:Fri Oct 14 07:32:28 BOT 2016


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
