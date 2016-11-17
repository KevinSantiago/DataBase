
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jariel/Documents/Oficial/DataBase/DealItSrv/conf/routes
// @DATE:Wed Nov 16 20:25:07 PST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  Application_1: controllers.Application,
  // @LINE:11
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    Application_1: controllers.Application,
    // @LINE:11
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/logout""", """controllers.Application.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/submit""", """controllers.Application.loginUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/signup2""", """controllers.Application.createUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/user""", """controllers.Application.getUserInfo"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/user/phone""", """controllers.Application.getPhoneNumbers"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/user/creditcard""", """controllers.Application.getCreditCard"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/user/products""", """controllers.Application.getProductsFromUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/order""", """controllers.Application.getOrdersFromAccount"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/order/content""", """controllers.Application.getOrderContent"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/items/""" + "$" + """id<[^/]+>""", """controllers.Application.getItemByID(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/itemsByCat""", """controllers.Application.getItemsPerCategory"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/product/ownerinfo""", """controllers.Application.getProductOwnerInfo"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/product/feedback""", """controllers.Application.getFeedbackFromProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/product/info""", """controllers.Application.getProductInfo"""),
    ("""GET""", this.prefix, """controllers.Assets.at(path:String = "/public/html/", file:String = "index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular", file:String = "angular.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-route.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-route", file:String = "angular-route.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """main.js""", """controllers.Assets.at(path:String = "/public/javascripts/", file:String = "main.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-aria.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-aria", file:String = "angular-aria.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-material.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-material", file:String = "angular-material.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-animate.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-animate", file:String = "angular-animate.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-messages.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-messages", file:String = "angular-messages.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-material-icons.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-material-icons", file:String = "angular-material-icons.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ui-grid.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-ui-grid", file:String = "ui-grid.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-material.css""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-material", file:String = "angular-material.css")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ui-grid.css""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-ui-grid", file:String = "ui-grid.css")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ui-grid.woff""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-ui-grid", file:String = "ui-grid.woff")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "home.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "about.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "login.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cars.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "cars.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """house.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "house.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "technology.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """furniture.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "furniture.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "profile.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """item.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "item.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPost.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "addPost.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "cart.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkout.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "checkout.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order_success.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "order_success.html")"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
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

  // @LINE:11
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

  // @LINE:14
  private[this] lazy val controllers_Application_logout2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/logout")))
  )
  private[this] lazy val controllers_Application_logout2_invoker = createInvoker(
    Application_1.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "POST",
      """ Login / Logout""",
      this.prefix + """DealItSrv/logout"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_loginUser3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/submit")))
  )
  private[this] lazy val controllers_Application_loginUser3_invoker = createInvoker(
    Application_1.loginUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "loginUser",
      Nil,
      "POST",
      """""",
      this.prefix + """login/submit"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_createUser4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/signup2")))
  )
  private[this] lazy val controllers_Application_createUser4_invoker = createInvoker(
    Application_1.createUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "createUser",
      Nil,
      "POST",
      """Sign Up
 POST    /login/signup               controllers.Application.signup""",
      this.prefix + """login/signup2"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_getUserInfo5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/user")))
  )
  private[this] lazy val controllers_Application_getUserInfo5_invoker = createInvoker(
    Application_1.getUserInfo,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUserInfo",
      Nil,
      "POST",
      """ Users""",
      this.prefix + """DealItSrv/user"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_getPhoneNumbers6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/user/phone")))
  )
  private[this] lazy val controllers_Application_getPhoneNumbers6_invoker = createInvoker(
    Application_1.getPhoneNumbers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getPhoneNumbers",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/user/phone"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_getCreditCard7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/user/creditcard")))
  )
  private[this] lazy val controllers_Application_getCreditCard7_invoker = createInvoker(
    Application_1.getCreditCard,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getCreditCard",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/user/creditcard"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_getProductsFromUser8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/user/products")))
  )
  private[this] lazy val controllers_Application_getProductsFromUser8_invoker = createInvoker(
    Application_1.getProductsFromUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProductsFromUser",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/user/products"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_getOrdersFromAccount9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/order")))
  )
  private[this] lazy val controllers_Application_getOrdersFromAccount9_invoker = createInvoker(
    Application_1.getOrdersFromAccount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getOrdersFromAccount",
      Nil,
      "POST",
      """Orders""",
      this.prefix + """DealItSrv/order"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Application_getOrderContent10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/order/content")))
  )
  private[this] lazy val controllers_Application_getOrderContent10_invoker = createInvoker(
    Application_1.getOrderContent,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getOrderContent",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/order/content"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Application_getItemByID11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getItemByID11_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_Application_getItemsPerCategory12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/itemsByCat")))
  )
  private[this] lazy val controllers_Application_getItemsPerCategory12_invoker = createInvoker(
    Application_1.getItemsPerCategory,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getItemsPerCategory",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/itemsByCat"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Application_getProductOwnerInfo13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/product/ownerinfo")))
  )
  private[this] lazy val controllers_Application_getProductOwnerInfo13_invoker = createInvoker(
    Application_1.getProductOwnerInfo,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProductOwnerInfo",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/product/ownerinfo"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Application_getFeedbackFromProduct14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/product/feedback")))
  )
  private[this] lazy val controllers_Application_getFeedbackFromProduct14_invoker = createInvoker(
    Application_1.getFeedbackFromProduct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getFeedbackFromProduct",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/product/feedback"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Application_getProductInfo15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/product/info")))
  )
  private[this] lazy val controllers_Application_getProductInfo15_invoker = createInvoker(
    Application_1.getProductInfo,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProductInfo",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/product/info"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Assets_at16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Assets_at16_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Assets_at17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular.js")))
  )
  private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Javascripts routes""",
      this.prefix + """angular.js"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Assets_at18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-route.js")))
  )
  private[this] lazy val controllers_Assets_at18_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """angular-route.js"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Assets_at19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("main.js")))
  )
  private[this] lazy val controllers_Assets_at19_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """main.js"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Assets_at20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-aria.js")))
  )
  private[this] lazy val controllers_Assets_at20_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """angular-aria.js"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Assets_at21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-material.js")))
  )
  private[this] lazy val controllers_Assets_at21_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """angular-material.js"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Assets_at22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-animate.js")))
  )
  private[this] lazy val controllers_Assets_at22_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """angular-animate.js"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Assets_at23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-messages.js")))
  )
  private[this] lazy val controllers_Assets_at23_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """angular-messages.js"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Assets_at24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-material-icons.js")))
  )
  private[this] lazy val controllers_Assets_at24_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """angular-material-icons.js"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Assets_at25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-grid.js")))
  )
  private[this] lazy val controllers_Assets_at25_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """ui-grid.js"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Assets_at26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-material.css")))
  )
  private[this] lazy val controllers_Assets_at26_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Stylesheet routes""",
      this.prefix + """angular-material.css"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Assets_at27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-grid.css")))
  )
  private[this] lazy val controllers_Assets_at27_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """ui-grid.css"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Assets_at28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-grid.woff")))
  )
  private[this] lazy val controllers_Assets_at28_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """ui-grid.woff"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_Assets_at29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home.html")))
  )
  private[this] lazy val controllers_Assets_at29_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """Templates""",
      this.prefix + """home.html"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Assets_at30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about.html")))
  )
  private[this] lazy val controllers_Assets_at30_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """about.html"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_Assets_at31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login.html")))
  )
  private[this] lazy val controllers_Assets_at31_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """login.html"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_Assets_at32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cars.html")))
  )
  private[this] lazy val controllers_Assets_at32_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """cars.html"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Assets_at33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("house.html")))
  )
  private[this] lazy val controllers_Assets_at33_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """house.html"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Assets_at34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology.html")))
  )
  private[this] lazy val controllers_Assets_at34_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """technology.html"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_Assets_at35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("furniture.html")))
  )
  private[this] lazy val controllers_Assets_at35_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """furniture.html"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_Assets_at36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile.html")))
  )
  private[this] lazy val controllers_Assets_at36_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """profile.html"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_Assets_at37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("item.html")))
  )
  private[this] lazy val controllers_Assets_at37_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """item.html"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_Assets_at38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPost.html")))
  )
  private[this] lazy val controllers_Assets_at38_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """addPost.html"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_Assets_at39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart.html")))
  )
  private[this] lazy val controllers_Assets_at39_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """cart.html"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_Assets_at40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkout.html")))
  )
  private[this] lazy val controllers_Assets_at40_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """checkout.html"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_Assets_at41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order_success.html")))
  )
  private[this] lazy val controllers_Assets_at41_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """order_success.html"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:11
    case controllers_Assets_at1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:14
    case controllers_Application_logout2_route(params) =>
      call { 
        controllers_Application_logout2_invoker.call(Application_1.logout)
      }
  
    // @LINE:15
    case controllers_Application_loginUser3_route(params) =>
      call { 
        controllers_Application_loginUser3_invoker.call(Application_1.loginUser)
      }
  
    // @LINE:19
    case controllers_Application_createUser4_route(params) =>
      call { 
        controllers_Application_createUser4_invoker.call(Application_1.createUser)
      }
  
    // @LINE:22
    case controllers_Application_getUserInfo5_route(params) =>
      call { 
        controllers_Application_getUserInfo5_invoker.call(Application_1.getUserInfo)
      }
  
    // @LINE:23
    case controllers_Application_getPhoneNumbers6_route(params) =>
      call { 
        controllers_Application_getPhoneNumbers6_invoker.call(Application_1.getPhoneNumbers)
      }
  
    // @LINE:24
    case controllers_Application_getCreditCard7_route(params) =>
      call { 
        controllers_Application_getCreditCard7_invoker.call(Application_1.getCreditCard)
      }
  
    // @LINE:25
    case controllers_Application_getProductsFromUser8_route(params) =>
      call { 
        controllers_Application_getProductsFromUser8_invoker.call(Application_1.getProductsFromUser)
      }
  
    // @LINE:28
    case controllers_Application_getOrdersFromAccount9_route(params) =>
      call { 
        controllers_Application_getOrdersFromAccount9_invoker.call(Application_1.getOrdersFromAccount)
      }
  
    // @LINE:29
    case controllers_Application_getOrderContent10_route(params) =>
      call { 
        controllers_Application_getOrderContent10_invoker.call(Application_1.getOrderContent)
      }
  
    // @LINE:33
    case controllers_Application_getItemByID11_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_getItemByID11_invoker.call(Application_1.getItemByID(id))
      }
  
    // @LINE:34
    case controllers_Application_getItemsPerCategory12_route(params) =>
      call { 
        controllers_Application_getItemsPerCategory12_invoker.call(Application_1.getItemsPerCategory)
      }
  
    // @LINE:35
    case controllers_Application_getProductOwnerInfo13_route(params) =>
      call { 
        controllers_Application_getProductOwnerInfo13_invoker.call(Application_1.getProductOwnerInfo)
      }
  
    // @LINE:36
    case controllers_Application_getFeedbackFromProduct14_route(params) =>
      call { 
        controllers_Application_getFeedbackFromProduct14_invoker.call(Application_1.getFeedbackFromProduct)
      }
  
    // @LINE:37
    case controllers_Application_getProductInfo15_route(params) =>
      call { 
        controllers_Application_getProductInfo15_invoker.call(Application_1.getProductInfo)
      }
  
    // @LINE:40
    case controllers_Assets_at16_route(params) =>
      call(Param[String]("path", Right("/public/html/")), Param[String]("file", Right("index.html"))) { (path, file) =>
        controllers_Assets_at16_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:43
    case controllers_Assets_at17_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular")), Param[String]("file", Right("angular.js"))) { (path, file) =>
        controllers_Assets_at17_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:44
    case controllers_Assets_at18_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-route")), Param[String]("file", Right("angular-route.js"))) { (path, file) =>
        controllers_Assets_at18_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:45
    case controllers_Assets_at19_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/")), Param[String]("file", Right("main.js"))) { (path, file) =>
        controllers_Assets_at19_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:46
    case controllers_Assets_at20_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-aria")), Param[String]("file", Right("angular-aria.js"))) { (path, file) =>
        controllers_Assets_at20_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:47
    case controllers_Assets_at21_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-material")), Param[String]("file", Right("angular-material.js"))) { (path, file) =>
        controllers_Assets_at21_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:48
    case controllers_Assets_at22_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-animate")), Param[String]("file", Right("angular-animate.js"))) { (path, file) =>
        controllers_Assets_at22_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:49
    case controllers_Assets_at23_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-messages")), Param[String]("file", Right("angular-messages.js"))) { (path, file) =>
        controllers_Assets_at23_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:50
    case controllers_Assets_at24_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-material-icons")), Param[String]("file", Right("angular-material-icons.js"))) { (path, file) =>
        controllers_Assets_at24_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:51
    case controllers_Assets_at25_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-ui-grid")), Param[String]("file", Right("ui-grid.js"))) { (path, file) =>
        controllers_Assets_at25_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:54
    case controllers_Assets_at26_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-material")), Param[String]("file", Right("angular-material.css"))) { (path, file) =>
        controllers_Assets_at26_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:55
    case controllers_Assets_at27_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-ui-grid")), Param[String]("file", Right("ui-grid.css"))) { (path, file) =>
        controllers_Assets_at27_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:56
    case controllers_Assets_at28_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-ui-grid")), Param[String]("file", Right("ui-grid.woff"))) { (path, file) =>
        controllers_Assets_at28_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:59
    case controllers_Assets_at29_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("home.html"))) { (path, file) =>
        controllers_Assets_at29_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:60
    case controllers_Assets_at30_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("about.html"))) { (path, file) =>
        controllers_Assets_at30_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:61
    case controllers_Assets_at31_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("login.html"))) { (path, file) =>
        controllers_Assets_at31_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:62
    case controllers_Assets_at32_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("cars.html"))) { (path, file) =>
        controllers_Assets_at32_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:63
    case controllers_Assets_at33_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("house.html"))) { (path, file) =>
        controllers_Assets_at33_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:64
    case controllers_Assets_at34_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("technology.html"))) { (path, file) =>
        controllers_Assets_at34_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:65
    case controllers_Assets_at35_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("furniture.html"))) { (path, file) =>
        controllers_Assets_at35_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:66
    case controllers_Assets_at36_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("profile.html"))) { (path, file) =>
        controllers_Assets_at36_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:67
    case controllers_Assets_at37_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("item.html"))) { (path, file) =>
        controllers_Assets_at37_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:68
    case controllers_Assets_at38_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("addPost.html"))) { (path, file) =>
        controllers_Assets_at38_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:69
    case controllers_Assets_at39_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("cart.html"))) { (path, file) =>
        controllers_Assets_at39_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:70
    case controllers_Assets_at40_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("checkout.html"))) { (path, file) =>
        controllers_Assets_at40_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:71
    case controllers_Assets_at41_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("order_success.html"))) { (path, file) =>
        controllers_Assets_at41_invoker.call(Assets_0.at(path, file))
      }
  }
}
