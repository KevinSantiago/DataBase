
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/deadmanpr/Documents/Git/DataBase/DealItSrv/conf/routes
// @DATE:Sun Oct 02 13:40:27 AST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:9
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:9
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv""", """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/login""", """controllers.Application.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/logout""", """controllers.Application.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/users""", """controllers.Application.getUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/users/""" + "$" + """id<[^/]+>""", """controllers.Application.getUserByID(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/users""", """controllers.Application.addUser"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/users""", """controllers.Application.updateUser"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/users/""" + "$" + """id<[^/]+>""", """controllers.Application.deleteUserByID(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/items""", """controllers.Application.getItems"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/items/""" + "$" + """id<[^/]+>""", """controllers.Application.getItemByID(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/items""", """controllers.Application.addItem"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/items""", """controllers.Application.updateItem"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/items/""" + "$" + """id<[^/]+>""", """controllers.Application.deleteItemByID(id:Integer)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv")))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page (Must be called first)""",
      this.prefix + """DealItSrv"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_at1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_login2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/login")))
  )
  private[this] lazy val controllers_Application_login2_invoker = createInvoker(
    Application_1.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "POST",
      """ Login / Logout""",
      this.prefix + """DealItSrv/login"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_logout3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/logout")))
  )
  private[this] lazy val controllers_Application_logout3_invoker = createInvoker(
    Application_1.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/logout"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_getUsers4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/users")))
  )
  private[this] lazy val controllers_Application_getUsers4_invoker = createInvoker(
    Application_1.getUsers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUsers",
      Nil,
      "GET",
      """ Users""",
      this.prefix + """DealItSrv/users"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_getUserByID5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getUserByID5_invoker = createInvoker(
    Application_1.getUserByID(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUserByID",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """DealItSrv/users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_addUser6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/users")))
  )
  private[this] lazy val controllers_Application_addUser6_invoker = createInvoker(
    Application_1.addUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addUser",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/users"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_updateUser7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/users")))
  )
  private[this] lazy val controllers_Application_updateUser7_invoker = createInvoker(
    Application_1.updateUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateUser",
      Nil,
      "PUT",
      """""",
      this.prefix + """DealItSrv/users"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_deleteUserByID8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteUserByID8_invoker = createInvoker(
    Application_1.deleteUserByID(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteUserByID",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """DealItSrv/users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_getItems9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items")))
  )
  private[this] lazy val controllers_Application_getItems9_invoker = createInvoker(
    Application_1.getItems,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getItems",
      Nil,
      "GET",
      """ Items""",
      this.prefix + """DealItSrv/items"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_getItemByID10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getItemByID10_invoker = createInvoker(
    Application_1.getItemByID(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getItemByID",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """DealItSrv/items/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_addItem11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items")))
  )
  private[this] lazy val controllers_Application_addItem11_invoker = createInvoker(
    Application_1.addItem,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addItem",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/items"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_updateItem12_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items")))
  )
  private[this] lazy val controllers_Application_updateItem12_invoker = createInvoker(
    Application_1.updateItem,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateItem",
      Nil,
      "PUT",
      """""",
      this.prefix + """DealItSrv/items"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Application_deleteItemByID13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteItemByID13_invoker = createInvoker(
    Application_1.deleteItemByID(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteItemByID",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """DealItSrv/items/""" + "$" + """id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:9
    case controllers_Assets_at1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:12
    case controllers_Application_login2_route(params) =>
      call { 
        controllers_Application_login2_invoker.call(Application_1.login)
      }
  
    // @LINE:13
    case controllers_Application_logout3_route(params) =>
      call { 
        controllers_Application_logout3_invoker.call(Application_1.logout)
      }
  
    // @LINE:16
    case controllers_Application_getUsers4_route(params) =>
      call { 
        controllers_Application_getUsers4_invoker.call(Application_1.getUsers)
      }
  
    // @LINE:17
    case controllers_Application_getUserByID5_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_getUserByID5_invoker.call(Application_1.getUserByID(id))
      }
  
    // @LINE:18
    case controllers_Application_addUser6_route(params) =>
      call { 
        controllers_Application_addUser6_invoker.call(Application_1.addUser)
      }
  
    // @LINE:19
    case controllers_Application_updateUser7_route(params) =>
      call { 
        controllers_Application_updateUser7_invoker.call(Application_1.updateUser)
      }
  
    // @LINE:20
    case controllers_Application_deleteUserByID8_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_deleteUserByID8_invoker.call(Application_1.deleteUserByID(id))
      }
  
    // @LINE:23
    case controllers_Application_getItems9_route(params) =>
      call { 
        controllers_Application_getItems9_invoker.call(Application_1.getItems)
      }
  
    // @LINE:24
    case controllers_Application_getItemByID10_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_getItemByID10_invoker.call(Application_1.getItemByID(id))
      }
  
    // @LINE:25
    case controllers_Application_addItem11_route(params) =>
      call { 
        controllers_Application_addItem11_invoker.call(Application_1.addItem)
      }
  
    // @LINE:26
    case controllers_Application_updateItem12_route(params) =>
      call { 
        controllers_Application_updateItem12_invoker.call(Application_1.updateItem)
      }
  
    // @LINE:27
    case controllers_Application_deleteItemByID13_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_deleteItemByID13_invoker.call(Application_1.deleteItemByID(id))
      }
  }
}
