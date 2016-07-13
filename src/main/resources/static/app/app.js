(function(angular) {
  angular.module("jwtDemo.controllers", []);
  angular.module("jwtDemo.services", []);
  angular.module("jwtDemo", ["ui.router", "ngResource", "ngStorage", "jwtDemo.controllers", "jwtDemo.services"])
      .config(function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise("/");

        $stateProvider
            .state('home', {
              url: '/',
              templateUrl: 'home.html',
              controller: 'ProfileController'
            })
            .state('signin', {
              url: '/signin',
              templateUrl: 'signin.html',
              controller: 'LoginController'
            })
            .state('signout', {
              url: '/signout',
              templateUrl: 'signin.html',
              controller: 'LoginController'
            });
      })
      .run(function ($localStorage, $http, $location, $rootScope) {
        if ($localStorage.user) {
          $http.defaults.headers.common.Authorization = 'Bearer ' + $localStorage.token;
        }

        $rootScope.$on('$locationChangeStart', function (event, next, current) {
          if ($location.path() !== "/signin" && !$localStorage.user) {
            $location.path('/signin');
          } else if ($location.path() === "/signin" && $localStorage.user) {
            $location.path('/');
          }
        });
      });
}(angular));