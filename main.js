document.querySelector(".bars-menu").addEventListener("click", () => {
    document.querySelector(".nav-items").classList.toggle("active");
  });
  
  document.querySelectorAll(".nav-link").forEach((item) => {
    item.addEventListener("click", () => {
      document.querySelector(".nav-items").classList.toggle("active");
    });
  });
  document.addEventListener("DOMContentLoaded", () => {
    document.querySelector(".bars-menu").addEventListener("click", () => {
        document.querySelector(".nav-items").classList.toggle("active");
      });
      
      document.querySelectorAll(".nav-link").forEach((item) => {
        item.addEventListener("click", () => {
          document.querySelector(".nav-items").classList.toggle("active");
        });
      });
      function displayTime(){
        var dateTime =new Date();
        var hrs = dateTime.getHours();
        var min = dateTime.getMinutes();
        var sec = dateTime.getSeconds();
        var session = document.getElementById('session');
    
        if(hrs >= 12){
          session.innerHTML = 'PM';
        }
        else{
          session.innerHTML = 'AM';
        }
        if(hrs > 12){
          hrs = hrs - 12;
        }
    
        document.getElementById('hours').innerHTML = hrs;
        document.getElementById('minutes').innerHTML = min;
        document.getElementById('seconds').innerHTML = sec;
      }
      setInterval(displayTime, 10);
    })
