 (function(){
     'use strict';

     // get main module and configure
     angular
         .module('campusconnect')
         .config(configure);

     function configure($routeProvider) {
                 $routeProvider
                     .when('/',{
                        templateUrl: "partials/newEvents.html",
                     })
                     .when('/hotThreads',{
                        templateUrl: "partials/hotThreads.html",
                     })
                     .when('/newEvents',{
                        templateUrl: "partials/newEvents.html",
                     })
                     .when('/blockchain',{
                        templateUrl: "partials/blockchain.html",
                     })
                     .when('/topicsHome',{
                        templateUrl: "topicsHome.html",
                     })
     };

 })();
