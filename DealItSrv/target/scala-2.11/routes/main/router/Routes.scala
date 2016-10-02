
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/deadmanpr/DealItSrv/conf/routes
// @DATE:Sun Oct 02 11:20:29 AST 2016

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
      """ Home page""",
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

  // @LINE:10
  private[this] lazy val controllers_Application_getItems2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items")))
  )
  private[this] lazy val controllers_Application_getItems2_invoker = createInvoker(
    Application_1.getItems,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getItems",
      Nil,
      "GET",
      """""",
      this.prefix + """DealItSrv/items"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_getItemByID3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getItemByID3_invoker = createInvoker(
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

  // @LINE:12
  private[this] lazy val controllers_Application_addItem4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items")))
  )
  private[this] lazy val controllers_Application_addItem4_invoker = createInvoker(
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

  // @LINE:13
  private[this] lazy val controllers_Application_updateItem5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items")))
  )
  private[this] lazy val controllers_Application_updateItem5_invoker = createInvoker(
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

  // @LINE:14
  private[this] lazy val controllers_Application_deleteItemByID6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteItemByID6_invoker = createInvoker(
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
  
    // @LINE:10
    case controllers_Application_getItems2_route(params) =>
      call { 
        controllers_Application_getItems2_invoker.call(Application_1.getItems)
      }
  
    // @LINE:11
    case controllers_Application_getItemByID3_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_getItemByID3_invoker.call(Application_1.getItemByID(id))
      }
  
    // @LINE:12
    case controllers_Application_addItem4_route(params) =>
      call { 
        controllers_Application_addItem4_invoker.call(Application_1.addItem)
      }
  
    // @LINE:13
    case controllers_Application_updateItem5_route(params) =>
      call { 
        controllers_Application_updateItem5_invoker.call(Application_1.updateItem)
      }
  
    // @LINE:14
    case controllers_Application_deleteItemByID6_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_deleteItemByID6_invoker.call(Application_1.deleteItemByID(id))
      }
  }
}
