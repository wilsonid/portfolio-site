$(function() {
     
      $('img').each(function(n) {
        n += 1;
        $(this).wrap('<figure class="tint t'+ n + '"></figure>');
      });

    });