HomeModule.factory("BlogService", function($http){

  var BASE_URL = "http://localhost:8089/portalmiddleware"
  var blogservice={};

  blogservice.addblog= function(blog)
  {
    return $http.post(BASE_URL+"/addblog", blog);
  }
  blogservice.blogslist = function()
  {
    return $http.get(BASE_URL+"/blogslist");
  }
  return blogservice;
})