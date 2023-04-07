AOS.init({
  duration: 600,
  delay: 200,
});

const swiper = new Swiper(".discount-banner", {
  slidesPerView: 3,
  spaceBetween: 20,
  loop: true,
  navigation: {
    nextEl: ".discount-banner .btn--next",
    prevEl: ".discount-banner .btn--prev",
  },
});

const btnTop = document.querySelector(".btn-top");
btnTop.addEventListener("click", function () {
  window.scrollTo({ top: 0, behavior: "smooth" });
});

const header = document.querySelector(".header");
window.addEventListener("scroll", function (e) {
  if (window.scrollY > 0) {
    header.classList.add("on");
    btnTop.classList.add("on");
  } else {
    header.classList.remove("on");
    btnTop.classList.remove("on");
  }
});

$(".sessionCheck").on("click", function () {
  if (session == null) {
    alert("You need to login to access to the page");
    return false;
  }
});

if (msg) {
  memoModal.show();
}

$("#btnDeleteAjax").on("click", function (e) {
  //e.preventDefault();
  isState = "delete";
  $("#deleteModal .modal-title").text("Enter password to delete your account.");
  deleteModal.show();
  return false;
});

$("#btnDeleteConfirm").on("click", function (e) {
  $.ajax({
    url: "/member/deleteProcess", // 해당 함수 필요 (responsebody)
    data: { no: session.no, userPw: $("#userPw_check").val() },
    type: "POST",
    success: function (response) {
      console.log(response);
      if (response.msg === "ok") {
        setTimeout(function () {
          location.href = "/";
        }, 500);
      } else {
        location.reload();
      }
    },
  });
});
