Grails Pjax Plugin
=========================
Grails Pjax Plugin cloud help you use pjax in Grails.

The pjax function is enabled on a 'A' tag , a button and a form. see code in pjaxHeader.

##What is Pjax?
Pjax is a jQuery plugin that uses ajax and pushState to deliver a fast browsing experience with real permalinks, page titles, and a working back button.

see more, Please go https://github.com/welefen/pjax

##Usage

First, the pjax function is enabled on a tag , a button and a form. see code as pjaxHeader showed.

1. load resource: in a page or layout header add code:

        <g:render template="/pjaxHeader" plugin="pjax"/>

    this will load the jquery.pjax.js file and give the default usage of pjax as a standand ref .
2. config content page: put the code below in a pjax content file:

        <meta name="layout" content="${request.isPjax?'':'main'}">

##Change Log

###v0.0.2@2013-05-28
- Updated the jquery.pjax.js to version 1.7.0
- Updated this readme.md file. more details comes up.

###v0.0.1@2013-05-26
- First publish of Grails Pjax Plugin.

