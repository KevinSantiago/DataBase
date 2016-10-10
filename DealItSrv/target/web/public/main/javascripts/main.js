 var app= angular.module('myapp',["ngRoute","ngMaterial","ngMdIcons"]);




     // routing configuration
      app.config(function($routeProvider){

               $routeProvider
                    .when("/",{
                       templateUrl: "home.html",  //set the template that is going to be used by that view
                       controller: "homeController"  //set the controller that is going to be used by that view
                    })
                    .when("/about", {
                       templateUrl: "about.html",
                       controller: "aboutController"
                    })
                    .when("/login", {
                       templateUrl: "login.html",
                       controller: "loginController"
                    });


      });

     // configuring theming
      app.config(function($mdThemingProvider) {
            $mdThemingProvider.theme('default')
                   .primaryPalette('amber')
                   .accentPalette('red');

            $mdThemingProvider.theme('altTheme')
                   .primaryPalette('blue-grey')
                   .accentPalette('amber');
              });






     //Main controller
        app.controller('mainController',['$scope','$http','$location','$mdSidenav',function($scope,$http,$location,$mdSidenav){


             $scope.toggleLeft = buildToggler('left');
             $scope.toggleRight = buildToggler('right');

                 function buildToggler(componentId) {
                   return function() {
                     $mdSidenav(componentId).toggle();
                   }
                 }



             //Navegation configuration (All this functions just change the url in which you are current located)

             $scope.navHome= function(){
                 $location.path('/');  //The parameter is the path to which you want to change
             };

             $scope.navAbout= function(){
                 $location.path('/about');
             };

             $scope.logNav = function(){
                 $location.path('/login')
             }


        }]);






     //Home controller (Home Page)
        app.controller('homeController',['$scope','$http', '$location', function($scope,$http, $location){

              $scope.marketing="What's better than having a tool that makes easy advertise your items."
                               +" What are you waiting for? Join our family today!";

              $scope.capabilities=[
                "Sale/Buy or Trade Cars",
                'Sale/Buy Houses',
                'Sale/Buy or Trade technology items',
                'Sale/Buy Furniture'
              ]

              // Navegation

              $scope.learnMore= function(){
                $location.path('/about');
              }

              $scope.joinUs= function(){
                $location.path('/login');
              }

        }]);


     //About page controller

        app.controller('aboutController',['$scope', function($scope){

             $scope.aboutUs="We are a group of students looking to contribute with innovating ideas.We live on a society that depends on  science and technology. As technology advance  our goal is making things easier."
                             +" Things like cars, houses, and clothes advertisement are now performed online.";

             $scope.clients="DealIt is a web application that offers a user friendly interface were can be placed sales/trades and special offers."
                                                         +" The sales/trade transactions could be anything such as: vehicles, houses, electronics, furniture, and miscellaneous.As mentioned before"
                                                        +" sales/trades could be anything, so this web application targets everyone willing to"
                                                         +" sale/buy/trade something that fits in one of the above categories.";


        }]);


     // Login , Sign up controller

        app.controller('loginController',['$scope','$http','$location', function($scope,$http,$location){
                var currentPath= $location.path();
                $scope.email="";
                $scope.password="";
                $scope.name="";
                $scope.submitedDate="";
                $scope.reEmail="";
                $scope.rePassword="";


                //===================== Functions ==============================================


                $scope.login = function(){
                    $http.post(currentPath+"/submit")
                           .then(function(response){
                                alert(response.data);

                           });
                }

                $scope.signup = function(){
                    $http.post(currentPath+"/signup")
                           .then(function(response){

                                alert(response.data);
                           });


                }


        }]);

