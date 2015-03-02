<r:require modules="pjax"/>

%{--bumping the version constant to force clients to do a full reload the next request getting the new layout and assets.--}%
<meta http-equiv="x-pjax-version" content="v123">

<jq:jquery>
    $(document).pjax('a[data-pjax]', '#pjax-container');

    $(document).on('submit', 'form[data-pjax]', function(event) {
      $.pjax.submit(event, '#pjax-container');
    });

    $(document).on('pjax:send', function() {
      $('#loading').show();
    });

    $(document).on('pjax:complete', function() {
      $('#loading').hide();
    });
</jq:jquery>

%{--<jq:jquery>--}%
%{--if($.support.pjax)--}%
%{--alert("$.support.pjax");--}%
%{--</jq:jquery>--}%
