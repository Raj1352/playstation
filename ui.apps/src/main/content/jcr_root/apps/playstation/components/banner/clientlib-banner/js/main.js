
$(document).ready(function() {


        $.ajax({
          url: "/api/get-data",
          type: "GET",
          success: function(data) {
            console.log(data);
          },
          error: function(xhr, status, errorThrown) {
            console.log("Request failed: " + status);
          }
        });



});

