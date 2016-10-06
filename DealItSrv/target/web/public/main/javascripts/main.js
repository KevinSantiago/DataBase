 var app= angular.module('myapp',["ngRoute","ngMaterial"]);




     // routing configuration
      app.config(function($routeProvider){

               $routeProvider
                    .when("/",{
                       templateUrl: "home.html",  //set the template that is going to be used by that view
                       controller: "homeController"  //set the controller that is going to be used by that view
                    })
                    .when("/about", {
                       templateUrl: "home.html",
                       controller: "aboutController"
                    });


      });

     // configuring theming
      app.config(function($mdThemingProvider) {
            $mdThemingProvider.theme('default')
                   .primaryPalette('amber')
                   .accentPalette('lime');

            $mdThemingProvider.theme('altTheme')
                   .primaryPalette('grey');
              });






     //Main controller
        app.controller('mainController',['$scope','$http','$location',function($scope,$http,$location){

             //Navegation configuration (All this functions just change the url in which you are current located)

             $scope.navHome= function(){
                 $location.path('/');  //The parameter is the path to which you want to change
             };

             $scope.navAbout= function(){
                 $location.path('/about');
             };


        }]);






     //Home controller (Home Page)
        app.controller('homeController',['$scope','$http', function($scope,$http){

              $scope.message="Welcome to the home page";



        }]);


     //About page controller

        app.controller('aboutController',['$scope', function($scope){
             $scope.message="This is about";


        }]);

