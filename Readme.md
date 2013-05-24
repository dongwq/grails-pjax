## Grails pjax plugin
pjax enables on a tag , a button and a form. see code as pjaxHeader showed.

usage as ,in a page or layout header add code:


        <g:render template="/pjaxHeader" plugin="pjax"/>
        
        
        in a pjax content file use meta:
        
        
        <meta name="layout" content="${request.isPjax?'':'main'}">
        
        


it load the jquery.pjax.js file and give the default usage of pjax as a standand ref .


