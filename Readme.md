Grails Pjax Plugin
=========================
Pjax in Grails.
Pjax is similar to (turbolinks)[https://github.com/rails/turbolinks],works on a 'A' tag , a button and a form. see demo code in _pjaxHeader grails templtate file.

##What is Pjax?
Pjax is a jQuery plugin that uses ajax and pushState to deliver a fast browsing experience with real permalinks, page titles, and a working back button.

see more, Please go https://github.com/welefen/pjax

##Why Pjax?
just load a containter from remote with ajax ? 
Yes.But more than that.
No more loading of css and js files . No page flash when refresh. u can add loading animation. 
Last but important, it shows rightly when no push state support in the browser!

##Usage

First, the pjax function is enabled on a tag , a button and a form. see code as pjaxHeader showed.

1. load resource: in a page or layout header add code:

        <g:render template="/pjaxHeader" plugin="pjax"/>

    this will load the jquery.pjax.js file and give the default usage of pjax as a standand ref .
2. config content page: put the code below in a pjax content file:

        <meta name="layout" content="${request.isPjax?'':'main'}">

##Change Log


###v0.0.5@2015-01-26
- Updated the jquery.pjax.js to version 1.9.3
- clean project

###v0.0.2@2013-05-28
- Updated the jquery.pjax.js to version 1.7.0
- Updated this readme.md file. more details comes up.

###v0.0.1@2013-05-26
- First publish of Grails Pjax Plugin.

> the end


