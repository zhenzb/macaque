/*钃濈浼佷笟缃戠珯绯荤粺PHP鐗�
http://www.lankecms.com*/

$(document).ready(function(){
    //杩斿洖椤堕儴
    $("#gototop").click(function(){
        $("html,body").animate({scrollTop :0}, 800);return false;
    });
    $("#gotocate").click(function(){
        $("html,body").animate({scrollTop:$("#categories").offset().top},800);return false;
    });


    // 鎼滅储
    $("#small_search").click(function(){
        $("#topsearch").slideToggle();
    });

    if($(window).width()>768){
        //榧犳爣鍒掕繃灏卞睍寮€瀛愯彍鍗�
        $('ul.nav li.dropdown').hover(function() {
            $(this).find('.dropdown-menu').stop(true, true).slideDown();
        }, function() {
            $(this).find('.dropdown-menu').stop(true, true).slideUp();
        });

        //scrollTop
        // $(window).scroll(function(){
        //     var scrolls = $(window).scrollTop()
        //     if (scrolls > 10) {
        //       $(".navbar").addClass("small-nav")
        //     }else{
        //       $(".navbar").removeClass("small-nav")
        //     }
        // });

    }

    //宸︿晶瀵艰埅鑿滃崟
    // if ($("#firstpane .menu_body:eq(0)").text().replace(/[\r\n ]/g,"").length>0) {
    //   $("#firstpane .menu_body:eq(0)").show().prev().html("-").prev().addClass("left_active");
    // };
    $("ul.menu_body").each(function(){
        if ($(this).text().replace(/[\r\n ]/g,"").length<=0) {$(this).prev().remove();} //鍘绘帀span
    });

    $("#firstpane span.menu_head").click(function(){
        var spanatt = $(this).next("ul.menu_body").css('display');
        if (spanatt == "block"){
            var spantext = "+";
            $(this).prev().removeClass("left_active");
        }else{
            var spantext = "-";
            $(this).prev().addClass("left_active");
        }
        $(this).html(spantext).addClass("current").next("ul.menu_body").slideToggle(300).siblings("ul.menu_body");
    });


});